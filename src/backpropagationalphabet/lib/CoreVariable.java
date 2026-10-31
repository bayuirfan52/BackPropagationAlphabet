package backpropagationalphabet.lib;

/** Training settings supplied by the MainForm controls. */
public class CoreVariable {
    /** Learning rate used by online backpropagation. */
    public static double ALPHA;
    /** Kept for the existing tolerance control; training currently runs all epochs. */
    public static double THETA;
    /** Number of complete passes through all training patterns. */
    public static double EPOCH;

    private CoreVariable() {
        // Utility class.
    }
}
