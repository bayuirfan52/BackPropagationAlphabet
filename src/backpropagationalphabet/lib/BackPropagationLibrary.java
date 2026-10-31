/*
 * Backpropagation network for the 7x9 alphabet patterns.
 */
package backpropagationalphabet.lib;

/**
 * A one-hidden-layer bipolar sigmoid network (63 inputs, 63 hidden units,
 * 6 output units). Training uses online backpropagation and stops when the
 * MSE tolerance is met or the requested maximum epoch is reached.
 * The target vectors in AlphabetLibrary are preserved.
 */
public class BackPropagationLibrary implements BackPropagationInterface.Presenter {
    private double[][] inputHiddenWeights;
    private double[][] hiddenOutputWeights;
    private double[] hiddenBias;
    private double[] outputBias;
    private final BackPropagationInterface.View view;
    private boolean trained;

    public BackPropagationLibrary(BackPropagationInterface.View view) {
        this.view = view;
    }

    @Override
    public void learn(double[][] input, double[][] target) {
        validateTrainingData(input, target);
        int inputCount = input[0].length;
        int hiddenCount = inputCount;
        int outputCount = target[0].length;
        double learningRate = CoreVariable.ALPHA;
        double tolerance = CoreVariable.THETA;
        int epochs = (int) CoreVariable.EPOCH;

        if (epochs < 1 || CoreVariable.EPOCH != epochs) {
            throw new IllegalArgumentException("Epoch harus berupa bilangan bulat positif.");
        }
        if (!(learningRate > 0.0) || Double.isInfinite(learningRate) || Double.isNaN(learningRate)) {
            throw new IllegalArgumentException("Learning rate harus lebih besar dari 0.");
        }
        if (tolerance < 0.0 || Double.isInfinite(tolerance) || Double.isNaN(tolerance)) {
            throw new IllegalArgumentException("Tolerance harus berupa angka 0 atau lebih besar.");
        }

        initializeWeights(inputCount, hiddenCount, outputCount);
        double[] hidden = new double[hiddenCount];
        double[] output = new double[outputCount];
        double[] outputDelta = new double[outputCount];
        double[] hiddenDelta = new double[hiddenCount];

        int completedEpoch = 0;
        double meanSquaredError = Double.POSITIVE_INFINITY;
        boolean toleranceReached = false;
        for (int epoch = 1; epoch <= epochs; epoch++) {
            for (int pattern = 0; pattern < input.length; pattern++) {
                forward(input[pattern], hidden, output);

                for (int k = 0; k < outputCount; k++) {
                    double difference = target[pattern][k] - output[k];
                    outputDelta[k] = difference * bipolarDerivativeFromOutput(output[k]);
                }

                // Calculate hidden deltas before changing the output weights.
                for (int j = 0; j < hiddenCount; j++) {
                    double propagatedError = 0.0;
                    for (int k = 0; k < outputCount; k++) {
                        propagatedError += outputDelta[k] * hiddenOutputWeights[k][j];
                    }
                    hiddenDelta[j] = propagatedError * bipolarDerivativeFromOutput(hidden[j]);
                }

                for (int k = 0; k < outputCount; k++) {
                    for (int j = 0; j < hiddenCount; j++) {
                        hiddenOutputWeights[k][j] += learningRate * outputDelta[k] * hidden[j];
                    }
                    outputBias[k] += learningRate * outputDelta[k];
                }
                for (int j = 0; j < hiddenCount; j++) {
                    for (int i = 0; i < inputCount; i++) {
                        inputHiddenWeights[j][i] += learningRate * hiddenDelta[j] * input[pattern][i];
                    }
                    hiddenBias[j] += learningRate * hiddenDelta[j];
                }
            }

            // Measure the complete training set with the updated weights so the
            // tolerance is checked against one consistent end-of-epoch model.
            meanSquaredError = calculateMeanSquaredError(input, target, hidden, output);
            completedEpoch = epoch;
            view.showEpochData(epoch);
            view.showErrorData(meanSquaredError);
            view.showLogData("Epoch " + epoch + "/" + epochs + " - MSE: " + meanSquaredError + "\n");

            if (meanSquaredError <= tolerance) {
                toleranceReached = true;
                view.showLogData("Tolerance tercapai (MSE <= " + tolerance + "). Training berhenti lebih awal.\n");
                break;
            }
        }
        trained = true;
        if (toleranceReached) {
            view.showLogData("Training selesai pada epoch " + completedEpoch + ".\n");
        } else {
            view.showLogData("Batas Epoch " + epochs + " tercapai. MSE akhir: " + meanSquaredError
                    + " (Tolerance: " + tolerance + ").\n");
        }
    }

    @Override
    public void test(double[] input) {
        if (!trained || input == null || inputHiddenWeights == null || input.length != inputHiddenWeights[0].length) {
            view.showResult("Unknown");
            return;
        }
        double[] hidden = new double[hiddenBias.length];
        double[] output = new double[outputBias.length];
        forward(input, hidden, output);
        view.showResult(classify(output));
    }

    private void forward(double[] input, double[] hidden, double[] output) {
        for (int j = 0; j < hidden.length; j++) {
            double sum = hiddenBias[j];
            for (int i = 0; i < input.length; i++) {
                sum += inputHiddenWeights[j][i] * input[i];
            }
            hidden[j] = bipolarSigmoid(sum);
        }
        for (int k = 0; k < output.length; k++) {
            double sum = outputBias[k];
            for (int j = 0; j < hidden.length; j++) {
                sum += hiddenOutputWeights[k][j] * hidden[j];
            }
            output[k] = bipolarSigmoid(sum);
        }
    }

    private double calculateMeanSquaredError(double[][] input, double[][] target,
            double[] hidden, double[] output) {
        double squaredError = 0.0;
        for (int pattern = 0; pattern < input.length; pattern++) {
            forward(input[pattern], hidden, output);
            for (int k = 0; k < output.length; k++) {
                double difference = target[pattern][k] - output[k];
                squaredError += difference * difference;
            }
        }
        return squaredError / (input.length * output.length);
    }

    private String classify(double[] output) {
        // The network outputs continuous sigmoid values, so select the closest
        // bipolar target instead of comparing Java arrays or doubles exactly.
        int best = -1;
        double bestDistance = Double.POSITIVE_INFINITY;
        for (int pattern = 0; pattern < AlphabetLibrary.TARGET.length; pattern++) {
            double distance = 0.0;
            for (int k = 0; k < output.length; k++) {
                double difference = output[k] - AlphabetLibrary.TARGET[pattern][k];
                distance += difference * difference;
            }
            if (distance < bestDistance) {
                bestDistance = distance;
                best = pattern;
            }
        }
        return best >= 0 ? AlphabetLibrary.ALPHABET_STATUS[best] : "Unknown";
    }

    private void initializeWeights(int inputCount, int hiddenCount, int outputCount) {
        inputHiddenWeights = new double[hiddenCount][inputCount];
        hiddenOutputWeights = new double[outputCount][hiddenCount];
        hiddenBias = new double[hiddenCount];
        outputBias = new double[outputCount];
        initialize(inputHiddenWeights);
        initialize(hiddenOutputWeights);
        initialize(hiddenBias);
        initialize(outputBias);
    }

    private void initialize(double[][] weights) {
        for (int row = 0; row < weights.length; row++) {
            for (int column = 0; column < weights[row].length; column++) {
                // Small symmetric values reduce initial sigmoid saturation.
                weights[row][column] = (Math.random() - 0.5) * 0.2;
            }
        }
    }

    private void initialize(double[] values) {
        for (int i = 0; i < values.length; i++) {
            values[i] = (Math.random() - 0.5) * 0.2;
        }
    }

    private double bipolarSigmoid(double value) {
        return 2.0 / (1.0 + Math.exp(-value)) - 1.0;
    }

    private double bipolarDerivativeFromOutput(double output) {
        return 0.5 * (1.0 - output * output);
    }

    private void validateTrainingData(double[][] input, double[][] target) {
        if (input == null || target == null || input.length == 0 || input.length != target.length) {
            throw new IllegalArgumentException("Jumlah pola input dan target harus sama dan tidak kosong.");
        }
        if (input[0] == null || target[0] == null) {
            throw new IllegalArgumentException("Pola input dan target tidak boleh null.");
        }
        int inputSize = input[0].length;
        int targetSize = target[0].length;
        if (inputSize == 0 || targetSize != AlphabetLibrary.TARGET[0].length) {
            throw new IllegalArgumentException("Ukuran pola input atau target tidak sesuai.");
        }
        for (int i = 0; i < input.length; i++) {
            if (input[i] == null || input[i].length != inputSize || target[i] == null || target[i].length != targetSize) {
                throw new IllegalArgumentException("Ukuran setiap pola input/target harus konsisten.");
            }
        }
    }
}
