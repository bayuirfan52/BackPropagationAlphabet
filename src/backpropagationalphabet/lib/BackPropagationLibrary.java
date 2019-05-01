/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backpropagationalphabet.lib;

import javax.swing.JOptionPane;

/**
 * A main library in Backpropagation application. 
 * This library is Require CoreVariable class to define more variable value in this class.
 * 
 * @author bayuirfan
 */
public class BackPropagationLibrary implements BackPropagationInterface.Presenter{
    private double[][] bobotInvisibleLayer, bobotOutputLayer;
    private double[] biasInvisibleLayer, biasOutputLayer, hiddenLayer, errOutputLayer, errHiddenLayer;
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
     * @param input[][]
     * @param target[][]
     */
    @Override
    public void learn(double[][] input, double[][] target){
        bobotInvisibleLayer = CoreVariable.getBobotInvisibleLayer();
        bobotOutputLayer = CoreVariable.getBobotOutputLayer();
        biasInvisibleLayer = CoreVariable.getBiasInvisibleLayer();
        biasOutputLayer = CoreVariable.getBiasOutputLayer();
        hiddenLayer = new double[biasInvisibleLayer.length];
        alpha = CoreVariable.ALPHA;
        try{            
            do{
                if (iteration == input.length) {
                    iteration = 0;
                    epoch++;
                    contextBackPropagationInterface.showEpochData(epoch);
                }
                
            }while(epoch != CoreVariable.EPOCH);
        }
        catch(IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    /**
     * Test your input is same with target (this function used after learning process)
     * @param input[]
     */
    @Override
    public void test(double[] input){
        try{
            
        }
        catch(Exception e){
            
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
            temp = input[i] * bobot[i];
        }        
        return bias + temp;
    }
    
    private double countErrorOutputLayer(){
        return 0;
    }
    
    private double countErrorHiddenLayer(){
        return 0;
    }
    
    /**
    * A activation function to get output value with sigmoid binary
    * @params input
    */
    private double activationSigmoidBinary(double input){
         return 1 / (1 + (Math.exp(input)));        
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
     * @param target
     * @return 
     */
    private boolean isSameWithTarget(double input, double target){
        if (input == target) {
            return true;
        }
        else {
            return false;
        }
    }
}
