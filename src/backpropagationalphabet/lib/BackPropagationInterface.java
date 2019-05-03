/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backpropagationalphabet.lib;

/**
 * Interface for Form Class. Set your form field data with this interface with MVP pattern
 * @author bayuirfan
 */
public interface BackPropagationInterface {

    /**
     * This interface implemented on your Form.
     */
    interface View {

        /**
         * Show your epoch data to your form
         * @param epoch
         */
        void showEpochData(int epoch);

        /**
         * Show your error data on backpropagation processing
         * @param errLog
         */
        void showErrorData(double errLog);

        /**
         * Show your all backpropagation process to your textarea in Java Swing Form
         * @param logData
         */
        void showLogData(String logData);
        
        /**
         * Show result into your label form
         * @param result 
         */
        void showResult(String result);

        /**
         * Set your presenter in your Form
         * @param presenter
         */
        void setPresenter(BackPropagationInterface.Presenter presenter);
    }
    
    /**
     * This interface implemented on your Presenter
     */
    interface Presenter{

        /**
         * Learn your pattern data with your target
         * @param input
         * @param target
         */
        void learn(double[][] input, double[][] target);

        /**
         * Test your pattern. Is your program know your input pattern
         * @param input
         */
        void test(double[] input);
    }
}
