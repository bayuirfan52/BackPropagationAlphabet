/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backpropagationalphabet.lib;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * A main library in Backpropagation application. 
 * This library is Require CoreVariable class to define more variable value in this class.
 * 
 * @author bayuirfan
 */
public class BackPropagationLibrary implements BackPropagationInterface.Presenter{
    private double[][] bobotInvisibleLayer, bobotOutputLayer;
    private double[] biasInvisibleLayer, biasOutputLayer; 
    private double[] hiddenLayerBefore, hiddenLayer, errHiddenLayer; 
    private double[] outputLayerBefore, outputLayer, errOutputLayer;
    private double[] deltaBobotOutputLayer, deltaBobotHiddenLayer;
    private double[] deltaBiasOutputLayer, deltaBiasHiddenLayer;
    private double alpha, theta;
    private int epoch = 0, iteration = 0;
    private final BackPropagationInterface.View contextBackPropagationInterface;
    
    /**
     * Backpropagation library class constructor.
     * @param contextBackPropagationInterface 
     */
    public BackPropagationLibrary(BackPropagationInterface.View contextBackPropagationInterface) {
        this.contextBackPropagationInterface = contextBackPropagationInterface;        
    }
    
    /**
     * Learn your pattern to this application. 
     * This function is require CoreVariable class to define weight and more input variables 
     * @param input
     * @param target
     */
    @Override
    public void learn(double[][] input, double[][] target){
        Boolean[] checkUpdate = new Boolean[input.length];
        boolean check, isLoop;
        bobotInvisibleLayer = CoreVariable.getBobotInvisibleLayer();
        bobotOutputLayer = CoreVariable.getBobotOutputLayer();
        biasInvisibleLayer = CoreVariable.getBiasInvisibleLayer();
        biasOutputLayer = CoreVariable.getBiasOutputLayer();
        contextBackPropagationInterface.showLogData(
                "Bobot Invisible Generate : " + Arrays.toString(bobotInvisibleLayer)
        );
        contextBackPropagationInterface.showLogData(
                "Bobot Output Generate : " + Arrays.toString(bobotOutputLayer)
        );
        contextBackPropagationInterface.showLogData(
                "Bias Invisible Generate : " + Arrays.toString(biasInvisibleLayer)
        );
        contextBackPropagationInterface.showLogData(
                "Bias Output Generate : " + Arrays.toString(biasOutputLayer)
        );
        hiddenLayerBefore = new double[biasInvisibleLayer.length];
        hiddenLayer = new double[biasInvisibleLayer.length];
        errHiddenLayer = new double[biasInvisibleLayer.length];
        
        outputLayerBefore = new double[biasOutputLayer.length];
        outputLayer = new double[biasOutputLayer.length];
        errOutputLayer = new double[biasOutputLayer.length];
        
        deltaBiasHiddenLayer = new double[63];
        deltaBiasOutputLayer = new double[6];
        
        deltaBobotHiddenLayer = new double[63];
        deltaBobotOutputLayer = new double[6];
        
        alpha = CoreVariable.ALPHA;
        double max1, max2, maxFinal;
        try{            
            do{
                if (iteration == input.length) {
                    iteration = 0;
                    epoch++;                    
                }
                contextBackPropagationInterface.showEpochData(epoch);
                System.err.println("Pattern : " + (iteration + 1));
                // Get Invisible Signal Value
                for (int i = 0; i < input[iteration].length; i++) {
                    hiddenLayerBefore[i] = countLayerSignal(input[iteration], bobotInvisibleLayer[iteration], biasInvisibleLayer[iteration]);                    
                    hiddenLayer[i] = activationSigmoidBipolar(hiddenLayerBefore[i]);
                }

                //Show Log Hidden Layer Data
                contextBackPropagationInterface.showLogData(
                        "Hidden Layer Before Data : " + Arrays.toString(hiddenLayerBefore)
                );
                System.out.println(
                        "Hidden Layer Before Data : " + Arrays.toString(hiddenLayerBefore)
                );
                contextBackPropagationInterface.showLogData(
                        "Hidden Layer Data after activation : " + Arrays.toString(hiddenLayer)
                );
                System.out.println(
                        "Hidden Layer Data after activation : " + Arrays.toString(hiddenLayer)
                );

                //Get Output Signal Value
                for (int j = 0; j < target[iteration].length; j++) {
                    outputLayerBefore[j] = countLayerSignal(hiddenLayer, bobotOutputLayer[j], biasOutputLayer[j]);
                    outputLayer[j] = activationSigmoidBipolar(outputLayerBefore[j]);
                }

                //Show Log Output Layer Data
                contextBackPropagationInterface.showLogData(
                        "Output Layer Before Data : " + Arrays.toString(outputLayerBefore)
                );
                System.out.println(
                        "Output Layer Before Data : " + Arrays.toString(outputLayerBefore)
                );
                contextBackPropagationInterface.showLogData(
                        "Output Layer Data after activation : " + Arrays.toString(outputLayer)
                );
                System.out.println(
                        "Output Layer Data after activation : " + Arrays.toString(outputLayer)
                );

                //Count error, delta W, and delta Bias on Output Layer
                errOutputLayer = countErrorOutputLayer(outputLayer, target[iteration], outputLayerBefore);
                deltaBobotOutputLayer = countDeltaBobotOutputLayer(outputLayerBefore, errOutputLayer);
                deltaBiasOutputLayer = countDeltaBiasOutputLayer(errOutputLayer);
                
                //Count error, delta W and delta Bias on Hidden Layer
                errHiddenLayer = countErrorHiddenLayer(errOutputLayer, bobotOutputLayer[iteration], hiddenLayerBefore);
                deltaBobotHiddenLayer = countDeltaBobotHiddenLayer(errHiddenLayer, input[iteration]);
                deltaBiasHiddenLayer = countDeltaBiasHiddenLayer(errHiddenLayer);
                
                updateBobotOutputLayer(bobotOutputLayer, deltaBobotOutputLayer);
                updateBobotHiddenLayer(bobotInvisibleLayer, deltaBobotHiddenLayer);
                updateBiasOutputLayer(biasOutputLayer, deltaBiasOutputLayer);
                updateBiasInvisibleLayer(biasInvisibleLayer, deltaBiasHiddenLayer);
                
                max1 = Arrays.stream(errOutputLayer).max().getAsDouble();
                max2 = Arrays.stream(errHiddenLayer).max().getAsDouble();
                                
                double[] maxErr = {
                    max1, max2
                };
                maxFinal = Arrays.stream(maxErr).max().getAsDouble();
                
                //Show max error value
                contextBackPropagationInterface.showErrorData(maxFinal);
                check = outputLayer != target[iteration];
                checkUpdate[iteration] = check;
                
                //Check break if condition
                if (maxFinal <= CoreVariable.THETA) {
                    break;
                }
                else {
                    isLoop = Arrays.stream(checkUpdate).noneMatch(val -> val);
                    contextBackPropagationInterface.showLogData("Is Activation same with target? : " + isLoop);
                    System.err.println("Checking Array : " + Arrays.toString(checkUpdate));
                    if (isLoop) {
                        contextBackPropagationInterface.showLogData("Finished");
                        break;
                    }
                }
                
                iteration++;
            }while(epoch != CoreVariable.EPOCH);
        }
        catch(IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, e.toString());
            System.err.println(e.toString());
        }
    }
    
    /**
     * Test your input is same with target (this function used after learning process)
     * @param input
     */
    @Override
    public void test(double[] input){
        try{
            for (int i = 0; i < input.length; i++) {
                hiddenLayerBefore[i] = countLayerSignal(input, bobotInvisibleLayer[i], biasInvisibleLayer[i]);
                hiddenLayer[i] = activationSigmoidBipolar(hiddenLayerBefore[i]);
            }
            for (int i = 0; i < biasOutputLayer.length; i++) {
                outputLayerBefore[i] = countLayerSignal(hiddenLayer, bobotOutputLayer[i], biasOutputLayer[i]);
                outputLayer[i] = activationSigmoidBipolar(outputLayerBefore[i]);
            }
            System.out.println(Arrays.toString(outputLayer));
            contextBackPropagationInterface.showResult(isSameWithTarget(outputLayer));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            System.err.println(e.toString());
        }
    }
    
    /**
     * A function to get value on the layer process
     * @param input
     * @param bobot
     * @param bias
     * @return 
     */
    private double countLayerSignal(double[] input, double[] bobot, double bias){
        double temp = 0;
        for (int i = 0; i < bobot.length; i++) {
            temp = temp + (input[i] * bobot[i]);
        }        
        return bias + temp;
    }
    
    /**
     * Count error of the training process on the Output Layer
     * @param outputLayer
     * @param target
     * @param outputLayerBefore
     * @return 
     */
    private double[] countErrorOutputLayer(double[] outputLayer, double[] target, double[] outputLayerBefore){
        double[] err = new double[outputLayer.length];
        for (int i = 0; i < target.length; i++) {
            err[i] = (target[i] - outputLayer[i]) * derivativeActivationSigmoidBipolar(outputLayerBefore[i]);
        }
        return err;
    }
    
    /**
     * Count error of the training process on the Hidden Layer
     * @param errOutputLayer
     * @param bobotOutputLayer
     * @param hiddenLayerBefore
     * @return 
     */
    private double[] countErrorHiddenLayer(double[] errOutputLayer, double[] bobotOutputLayer, double[] hiddenLayerBefore){
        double[] err = new double[hiddenLayerBefore.length];
        double sum = 0;
        for (int i = 0; i < errOutputLayer.length; i++) {
            sum = sum + (errOutputLayer[i] * bobotOutputLayer[i]);
        }
        for (int i = 0; i < hiddenLayerBefore.length; i++) {
            err[i] = sum * derivativeActivationSigmoidBipolar(hiddenLayerBefore[i]);
        }
        return err;
    }
    
    /**
     * Count delta W of Output Layer
     * @param outputLayerBefore
     * @param errOutputLayer
     * @return 
     */
    private double[] countDeltaBobotOutputLayer(double[] outputLayerBefore, double[] errOutputLayer){
        double[] deltaBobot;
        deltaBobot = new double[6];
        for (int i = 0; i < deltaBobot.length; i++) {
                deltaBobot[i] = CoreVariable.ALPHA * errOutputLayer[i] * outputLayerBefore[i];
        }
        return deltaBobot;
    }
    
    /**
     * Count delta Bias of Output Layer
     * @param errOutputLayer
     * @return 
     */
    private double[] countDeltaBiasOutputLayer(double[] errOutputLayer){
        double[] deltaBias = new double[errOutputLayer.length];
        for (int i = 0; i < errOutputLayer.length; i++) {
            deltaBias[i] = CoreVariable.ALPHA * errOutputLayer[i];            
        }
        return deltaBias;
    }
    
    /**
     * Count delta W of Hidden Layer
     * @param errHiddenLayer
     * @param input
     * @return 
     */
    private double[] countDeltaBobotHiddenLayer(double[] errHiddenLayer, double[] input){
        double[] deltaBobot;
        deltaBobot = new double[63];
        for (int i = 0; i < deltaBobot.length; i++) {
                deltaBobot[i] = CoreVariable.ALPHA * errHiddenLayer[i] * input[i];   
        }
        return deltaBobot;
    }
    
    /**
     * Count delta Bias of Hidden Layer
     * @param errHiddenLayer
     * @return 
     */
    private double[] countDeltaBiasHiddenLayer(double[] errHiddenLayer){
        double[] deltaBias = new double[errHiddenLayer.length];
        for (int i = 0; i < errHiddenLayer.length; i++) {
            deltaBias[i] = CoreVariable.ALPHA * errHiddenLayer[i];            
        }
        return deltaBias;
    }
    
    /**
     * Update W to Output Layer
     * @param bobotOutputLayer
     * @param deltaBobotOutput
     * @return 
     */
    private void updateBobotOutputLayer(double[][] bobotOutputLayer, double[] deltaBobotOutput){
        for (int i = 0; i < bobotOutputLayer.length; i++) {
            for (int j = 0; j < bobotOutputLayer[i].length; j++) {
                bobotOutputLayer[i][j] = bobotOutputLayer[i][j] + deltaBobotOutput[j];
            }            
        }
        contextBackPropagationInterface.showLogData(
                        "Update Bobot Output Layer : " + String.valueOf(Arrays.stream(bobotOutputLayer).toString())
                );
    }
    
    /**
     * Update bias in Output Layer
     * @param biasOutputLayer
     * @param deltaBiasOutputLayer 
     */
    private void updateBiasOutputLayer(double[] biasOutputLayer, double[] deltaBiasOutputLayer){
        for (int i = 0; i < biasOutputLayer.length; i++) {
            biasOutputLayer[i] = biasOutputLayer[i] + deltaBiasOutputLayer[i];
            
        }
    }
    
    /**
     * Update bias in Hidden Layer
     * @param biasInvisibleLayer
     * @param deltaBiasInvisibleLayer 
     */
    private void updateBiasInvisibleLayer(double[] biasInvisibleLayer, double[] deltaBiasInvisibleLayer){
        for (int i = 0; i < biasInvisibleLayer.length; i++) {
            biasInvisibleLayer[i] = biasInvisibleLayer[i] + deltaBiasInvisibleLayer[i];
            
        }
    }
    
    /**
     * Update W to Hidden Layer
     * @param bobotHiddenLayer
     * @param deltaBobotHidden
     * @return 
     */
    private void updateBobotHiddenLayer(double[][] bobotHiddenLayer, double[] deltaBobotHidden){
        for (int i = 0; i < bobotHiddenLayer.length; i++) {
            for (int j = 0; j < bobotHiddenLayer[i].length; j++) {
                bobotHiddenLayer[i][j] = bobotHiddenLayer[i][j] + deltaBobotHidden[j];
            }            
        }
        contextBackPropagationInterface.showLogData(
                        "Update Bobot Hidden Layer : " + String.valueOf(Arrays.stream(bobotHiddenLayer).toString())
                );
    }
    /**
    * A activation function to get output value with sigmoid binary
    * @params input
    */
    private double activationSigmoidBinary(double input){
         return 1 / (1 + (Math.exp(-input)));        
    }
    
    /**
    * A derivative activation function to get output value with sigmoid binary
    * @params input
    */
    private double derivativeActivationSigmoidBinary(double input){
        return activationSigmoidBinary(input) * (1 - activationSigmoidBinary(input));
    }
    
    /**
    * A activation function to get output value with sigmoid bipolar
    * @params input
    */
    private double activationSigmoidBipolar(double input){
        return (2 * activationSigmoidBinary(input)) - 1;
    }
    
    /**
    * A derivative activation function to get output value with sigmoid bipolar
    * @params input
    */
    private double derivativeActivationSigmoidBipolar(double input){
        return ((1 + activationSigmoidBipolar(input)) * 1 - activationSigmoidBipolar(input)) / 2;
    }
    
    /**
     * a function to check is the input is same with the target after activation
     * @param input
     * @return 
     */
    private String isSameWithTarget(double[] input){
        String value = "Unknown";
        for (int i = 0; i < 26; i++) {
            if (input == AlphabetLibrary.TARGET[i]) {
                value = AlphabetLibrary.ALPHABET_STATUS[i];
                break;
            }
        }
        return value;
    }
}
