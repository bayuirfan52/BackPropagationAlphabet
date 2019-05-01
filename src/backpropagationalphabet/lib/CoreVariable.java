/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backpropagationalphabet.lib;

/**
 *
 * @author bayuirfan
 */
public class CoreVariable {
    private static double[][] bobotInvisibleLayer = new double[26][63];
    private static double[][] bobotOutputLayer = new double[6][63];
    private static double[] biasInvisibleLayer = new double[63];
    private static double[] biasOutputLayer = new double[6];

    /**
     * Alpha main variable. a main value on Backpropagation algorithm
     */
    public static double ALPHA;
    /**
     * Theta or Tolerance main variable. a main value on Backpropagation algorithm
     */
    public static double THETA;
    /**
     * Epoch main variable. a main value on Backpropagation algorithm
     */
    public static double EPOCH;

    /**
     * this function make a random number on invisible weight layer
     * @return a 2D weight value
     */
    public static double[][] getBobotInvisibleLayer() {
        for (int i = 0; i < bobotInvisibleLayer.length; i++) {
            for (int j = 0; j < bobotInvisibleLayer[i].length; j++) {
                bobotInvisibleLayer[i][j] = Math.random();
            }            
        }
        return bobotInvisibleLayer;
    }

    /**
     * this function make a random number on output weight layer
     * @return a 2D weight value
     */
    public static double[][] getBobotOutputLayer() {
        for (int i = 0; i < bobotOutputLayer.length; i++) {
            for (int j = 0; j < bobotOutputLayer.length; j++) {
                bobotOutputLayer[i][j] = Math.random();                
            }            
        }
        return bobotOutputLayer;
    }

    /**
     * this function make a random number on invisible bias layer
     * @return array bias value
     */
    public static double[] getBiasInvisibleLayer() {
        for (int i = 0; i < bobotInvisibleLayer.length; i++) {
            biasInvisibleLayer[i] = Math.random();
        }
        return biasInvisibleLayer;
    }

    /**
     * this function make a random number on output bias layer
     * @return array bias value
     */
    public static double[] getBiasOutputLayer() {
        for (int i = 0; i < biasOutputLayer.length; i++) {
            biasOutputLayer[i] = Math.random();            
        }
        return biasOutputLayer;
    }   
}
