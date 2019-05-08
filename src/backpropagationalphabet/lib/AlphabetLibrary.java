/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backpropagationalphabet.lib;

/**
 * a class with a final value of data training and data target to learn this program to know the alphabetic data
 * @author bayuirfan
 */
public class AlphabetLibrary {

    /**
     * a library to save all alphabetic value for learning and default button on MainForm
     * save your own alphabet pattern with 2 dimensional array with 1 for black value and -1 for white value
     */
    public static final double[][] ALPHABET_TRAINING = {
//        //----- A -----
//        {
//            -1,-1,-1, 1,-1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1,
//            -1,-1, 1, 1, 1,-1,-1,
//            -1,-1, 1,-1, 1,-1,-1,
//            -1, 1, 1, 1, 1, 1,-1,
//            -1, 1,-1,-1,-1, 1,-1,
//            -1, 1,-1,-1,-1, 1,-1,
//            -1, 1,-1,-1,-1, 1,-1,
//             1, 1, 1,-1, 1, 1, 1
//        },
//        //----- B -----
//        {
//             1, 1, 1, 1, 1, 1,-1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1, 1, 1, 1, 1, 1,-1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1, 1, 1, 1, 1, 1,-1,
//        },
//        //----- C -----
//        {
//            -1,-1, 1, 1, 1,-1,-1,
//            -1, 1,-1,-1,-1, 1,-1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1, 1,
//            -1, 1,-1,-1,-1, 1,-1,
//            -1,-1, 1, 1, 1,-1,-1,
//        },
//        //----- D -----
//        {
//             1, 1, 1, 1, 1,-1,-1,
//             1,-1,-1,-1,-1, 1,-1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1, 1,-1,
//             1, 1, 1, 1, 1,-1,-1
//        },
//        //----- E -----
//        {
//            -1, 1, 1, 1, 1, 1, 1,
//             1,-1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//             1, 1, 1, 1, 1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//            -1, 1, 1, 1, 1, 1, 1
//        },
//        //----- F -----
//        {
//             1, 1, 1, 1, 1, 1, 1,
//             1,-1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//             1, 1, 1, 1, 1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1
//        },
//        //----- G -----
//        {
//            -1,-1, 1, 1, 1, 1,-1,
//            -1, 1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//             1,-1,-1, 1, 1, 1,-1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//            -1, 1,-1,-1,-1, 1,-1,
//            -1,-1, 1, 1, 1,-1,-1
//        },
//        //----- H -----
//        {
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1, 1, 1, 1, 1, 1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1
//        },
//        //----- I -----
//        {
//            -1,-1,-1, 1,-1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1
//        },
//        //----- J -----
//        {
//            -1,-1,-1,-1, 1, 1, 1,
//            -1,-1,-1,-1,-1,-1, 1,
//            -1,-1,-1,-1,-1,-1, 1,
//            -1,-1,-1,-1,-1,-1, 1,
//            -1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//            -1, 1,-1,-1,-1, 1,-1,
//            -1,-1, 1, 1, 1,-1,-1
//        },
//        //----- K -----
//        {
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1, 1,-1,
//             1,-1,-1,-1, 1,-1,-1,
//             1,-1,-1, 1,-1,-1,-1,
//             1, 1, 1,-1,-1,-1,-1,
//             1,-1,-1, 1,-1,-1,-1,
//             1,-1,-1,-1, 1,-1,-1,
//             1,-1,-1,-1,-1, 1,-1,
//             1,-1,-1,-1,-1,-1, 1
//        },
//        //----- L -----
//        {
//             1,-1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//             1, 1, 1, 1, 1, 1, 1
//        },
//        //----- M -----
//        {
//             1,-1,-1,-1,-1,-1, 1,
//             1, 1,-1,-1,-1, 1, 1,
//             1,-1, 1,-1, 1,-1, 1,
//             1,-1,-1, 1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1
//        },
//        //----- N -----
//        {
//             1,-1,-1,-1,-1,-1, 1,
//             1, 1,-1,-1,-1,-1, 1,
//             1,-1, 1,-1,-1,-1, 1,
//             1,-1,-1, 1,-1,-1, 1,
//             1,-1,-1,-1, 1,-1, 1,
//             1,-1,-1,-1,-1, 1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1
//        },
        //----- O -----
        {
            -1,-1, 1, 1, 1,-1,-1,
            -1, 1,-1,-1,-1, 1,-1,
             1,-1,-1,-1,-1,-1, 1,
             1,-1,-1,-1,-1,-1, 1,
             1,-1,-1,-1,-1,-1, 1,
             1,-1,-1,-1,-1,-1, 1,
             1,-1,-1,-1,-1,-1, 1,
            -1, 1,-1,-1,-1, 1,-1,
            -1,-1, 1, 1, 1,-1,-1
        },
        //----- P -----
        {
             1, 1, 1, 1, 1, 1,-1,
             1,-1,-1,-1,-1,-1, 1,
             1,-1,-1,-1,-1,-1, 1,
             1,-1,-1,-1,-1,-1, 1,
             1, 1, 1, 1, 1, 1,-1,
             1,-1,-1,-1,-1,-1,-1,
             1,-1,-1,-1,-1,-1,-1,
             1,-1,-1,-1,-1,-1,-1,
             1,-1,-1,-1,-1,-1,-1
        },
        //----- Q -----
        {
            -1,-1, 1, 1, 1,-1,-1,
            -1, 1,-1,-1,-1, 1,-1,
             1,-1,-1,-1,-1,-1, 1,
             1,-1,-1,-1,-1,-1, 1,
             1,-1,-1,-1,-1,-1, 1,
             1,-1,-1,-1,-1,-1, 1,
             1,-1,-1,-1, 1,-1, 1,
            -1, 1,-1,-1,-1, 1,-1,
            -1,-1, 1, 1, 1,-1, 1
        },
        //----- R -----
        {
             1, 1, 1, 1, 1, 1,-1,
             1,-1,-1,-1,-1,-1, 1,
             1,-1,-1,-1,-1,-1, 1,
             1,-1,-1,-1,-1,-1, 1,
             1, 1, 1, 1, 1, 1,-1,
             1,-1,-1, 1,-1,-1,-1,
             1,-1,-1,-1, 1,-1,-1,
             1,-1,-1,-1,-1, 1,-1,
             1,-1,-1,-1,-1,-1, 1
        }
//            ,
//        //----- S -----
//        {
//            -1, 1, 1, 1, 1, 1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//            -1, 1, 1, 1, 1, 1,-1,
//            -1,-1,-1,-1,-1,-1, 1,
//            -1,-1,-1,-1,-1,-1, 1,
//            -1,-1,-1,-1,-1,-1, 1,
//            -1, 1, 1, 1, 1, 1,-1
//        },
//        //----- T -----
//        {
//             1, 1, 1, 1, 1, 1, 1,
//            -1,-1,-1, 1,-1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1
//        },
//        //----- U -----
//        {
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//            -1, 1, 1, 1, 1, 1,-1
//        },
//        //----- V -----
//        {
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//            -1, 1,-1,-1,-1, 1,-1,
//            -1,-1, 1,-1, 1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1
//        },
//        //----- W -----
//        {
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1, 1,-1,-1, 1,
//             1,-1, 1,-1, 1,-1, 1,
//             1, 1,-1,-1,-1, 1, 1,
//             1,-1,-1,-1,-1,-1, 1
//        },
//        //----- X -----
//        {
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//            -1, 1,-1,-1,-1, 1,-1,
//            -1,-1, 1,-1, 1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1,
//            -1,-1, 1,-1, 1,-1,-1,
//            -1, 1,-1,-1,-1, 1,-1,
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1
//        },
//        //----- Y -----
//        {
//             1,-1,-1,-1,-1,-1, 1,
//             1,-1,-1,-1,-1,-1, 1,
//            -1, 1,-1,-1,-1, 1,-1,
//            -1,-1, 1,-1, 1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1
//        },
//        //----- Z -----
//        {
//             1, 1, 1, 1, 1, 1, 1,
//            -1,-1,-1,-1,-1,-1, 1,
//            -1,-1,-1,-1,-1, 1,-1,
//            -1,-1,-1,-1, 1,-1,-1,
//            -1,-1,-1, 1,-1,-1,-1,
//            -1,-1, 1,-1,-1,-1,-1,
//            -1, 1,-1,-1,-1,-1,-1,
//             1,-1,-1,-1,-1,-1,-1,
//             1, 1, 1, 1, 1, 1, 1
//        }
    };
    
    /**
     * a library to save all target value for learning and default button on MainForm
     * save your own target pattern with 2 dimensional array with 1 and -1
     */
    public static final double[][] TARGET = {
        //----- A -----
//        {
//            -1,-1,-1,-1,-1, 1
//        },
//        //----- B -----
//        {
//             1,-1,-1,-1,-1, 1
//        },
//        //----- C -----
//        {
//            -1, 1,-1,-1,-1, 1
//        },
//        //----- D -----
//        {
//            -1,-1, 1,-1,-1, 1
//        },
//        //----- E -----
//        {
//            -1,-1,-1, 1,-1, 1
//        },
//        //----- F -----
//        {
//            -1,-1,-1,-1, 1, 1
//        },
//        //----- G -----
//        {
//             1, 1,-1,-1,-1, 1
//        },
//        //----- H -----
//        {
//            -1, 1, 1,-1,-1, 1
//        },
//        //----- I -----
//        {
//            -1,-1, 1, 1,-1, 1
//        },
//        //----- J -----
//        {
//            -1,-1,-1, 1, 1, 1
//        },
//        //----- K -----
//        {
//             1,-1, 1,-1,-1, 1
//        },
//        //----- L -----
//        {
//             1,-1,-1, 1,-1, 1
//        },
//        //----- M -----
//        {
//             1,-1,-1,-1, 1, 1
//        },
//        //----- N -----
//        {
//            -1, 1,-1,-1, 1, 1
//        },
        //----- O -----
        {
            -1,-1, 1,-1, 1, 1
        },
        //----- P -----
        {
             1, 1, 1,-1,-1, 1
        },
        //----- Q -----
        {
            -1, 1, 1, 1,-1, 1
        },
        //----- R -----
        {
            -1,-1, 1, 1, 1, 1
        }
//            ,
//        //----- S -----
//        {
//             1,-1, 1, 1,-1, 1
//        },
//        //----- T -----
//        {
//             1,-1,-1, 1, 1, 1
//        },
//        //----- U -----
//        {
//            -1, 1,-1, 1, 1, 1
//        },
//        //----- V -----
//        {
//             1, 1, 1, 1,-1, 1
//        },
//        //----- W -----
//        {
//            -1, 1, 1, 1, 1, 1
//        },
//        //----- X -----
//        {
//             1,-1, 1, 1, 1, 1
//        },
//        //----- Y -----
//        {
//             1, 1, 1, 1, 1, 1
//        },
//        //----- Z -----
//        {            
//            -1,-1,-1,-1,-1,-1
//        }
    };
    
    /**
     * A Array Variable to set Status if the program know at the alphabet pattern
     */
    public static final String[] ALPHABET_STATUS = {
//        "A","B","C","D","E",
//        "F","G","H","I","J",
//        "K","L","M","N",
        "O",
        "P","Q","R",
//        "S","T",
//        "U","V","W","X","Y",
//        "Z"
    };
}
