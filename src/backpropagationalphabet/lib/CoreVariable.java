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
    private static double[][] bobotInvisibleLayer = new double[63][63];
    private static double[][] bobotOutputLayer = new double[63][6];
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
     * this function make a random number on weight invisible layer
     * @return a 2D weight value
     */
    public static double[][] getBobotInvisibleLayer() {
        for (int i = 0; i < bobotInvisibleLayer.length; i++) {
            System.out.println("Bobot Pola ke " + i);
            for (int j = 0; j < bobotInvisibleLayer[i].length; j++) {
                bobotInvisibleLayer[i][j] = Math.random();
                System.out.print(bobotInvisibleLayer[i][j] + " ");
            }            
            System.out.println("");
        }
        return bobotInvisibleLayer;
    }

    /**
     * this function make a random number on output weight layer
     * @return a 2D weight value
     */
    public static double[][] getBobotOutputLayer() {
        for (int i = 0; i < bobotOutputLayer.length; i++) {
            System.out.println("Bobot Pola ke " + i);
            for (int j = 0; j < bobotOutputLayer[i].length; j++) {
                bobotOutputLayer[i][j] = Math.random();
                System.out.print(bobotOutputLayer[i][j]);
            }
            System.out.println("");            
        }
        return bobotOutputLayer;
    }

    /**
     * this function make a random number on invisible bias layer
     * @return array bias value
     */
    public static double[] getBiasInvisibleLayer() {
        for (int i = 0; i < bobotInvisibleLayer.length; i++) {
            System.out.print("Bias Pola ke " + i + " : ");
            biasInvisibleLayer[i] = Math.random();
            System.out.println(biasInvisibleLayer[i]);
        }
        return biasInvisibleLayer;
    }

    /**
     * this function make a random number on output bias layer
     * @return array bias value
     */
    public static double[] getBiasOutputLayer() {
        for (int i = 0; i < biasOutputLayer.length; i++) {            
            System.out.print("Bias Pola ke " + i + " : ");            
            biasOutputLayer[i] = Math.random(); 
            System.out.println(biasOutputLayer[i]);
        }
        return biasOutputLayer;
    }   
}
