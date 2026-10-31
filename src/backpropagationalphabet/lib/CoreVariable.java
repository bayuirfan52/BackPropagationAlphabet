package backpropagationalphabet.lib;

/** Training settings supplied by the MainForm controls. */
public class CoreVariable {
    /** Learning rate used by online backpropagation. */
    public static double ALPHA;
    /** Mean squared error threshold for ending training before the epoch limit. */
    public static double THETA;
    /** Number of complete passes through all training patterns. */
    public static double EPOCH;

    private CoreVariable() {
        // Utility class.
    }
}
