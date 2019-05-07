/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backpropagationalphabet.form;

import backpropagationalphabet.lib.AlphabetLibrary;
import backpropagationalphabet.lib.BackPropagationInterface;
import backpropagationalphabet.lib.BackPropagationLibrary;
import backpropagationalphabet.lib.CoreVariable;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author bayuirfan
 */
public class MainForm extends javax.swing.JFrame implements BackPropagationInterface.View{

    /**
     * Creates new form MainForm
     */
    public MainForm() {        
        initComponents();
        setButtonArrayInitializer();
        setButtonActions();
        setDefaultPatterns();
        this.setPresenter(presenter);
    }    
    
    private static JFrame frame = new MainForm();
    private BackPropagationInterface.Presenter presenter = new BackPropagationLibrary(this);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aButton;
    private javax.swing.JTextField alphaField;
    private javax.swing.JButton bButton;
    private javax.swing.JButton cButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton dButton;
    private javax.swing.JButton eButton;
    private javax.swing.JTextField epochField;
    private javax.swing.JLabel epochValue;
    private javax.swing.JLabel errorValue;
    private javax.swing.JButton fButton;
    private javax.swing.JButton gButton;
    private javax.swing.JButton hButton;
    private javax.swing.JButton iButton;
    private javax.swing.JButton jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton kButton;
    private javax.swing.JButton lButton;
    private javax.swing.JTextArea logDataField;
    private javax.swing.JButton mButton;
    private javax.swing.JButton nButton;
    private javax.swing.JButton oButton;
    private javax.swing.JButton pButton;
    private javax.swing.JButton pattern11;
    private javax.swing.JButton pattern12;
    private javax.swing.JButton pattern13;
    private javax.swing.JButton pattern14;
    private javax.swing.JButton pattern15;
    private javax.swing.JButton pattern16;
    private javax.swing.JButton pattern17;
    private javax.swing.JButton pattern21;
    private javax.swing.JButton pattern22;
    private javax.swing.JButton pattern23;
    private javax.swing.JButton pattern24;
    private javax.swing.JButton pattern25;
    private javax.swing.JButton pattern26;
    private javax.swing.JButton pattern27;
    private javax.swing.JButton pattern31;
    private javax.swing.JButton pattern32;
    private javax.swing.JButton pattern33;
    private javax.swing.JButton pattern34;
    private javax.swing.JButton pattern35;
    private javax.swing.JButton pattern36;
    private javax.swing.JButton pattern37;
    private javax.swing.JButton pattern41;
    private javax.swing.JButton pattern42;
    private javax.swing.JButton pattern43;
    private javax.swing.JButton pattern44;
    private javax.swing.JButton pattern45;
    private javax.swing.JButton pattern46;
    private javax.swing.JButton pattern47;
    private javax.swing.JButton pattern51;
    private javax.swing.JButton pattern52;
    private javax.swing.JButton pattern53;
    private javax.swing.JButton pattern54;
    private javax.swing.JButton pattern55;
    private javax.swing.JButton pattern56;
    private javax.swing.JButton pattern57;
    private javax.swing.JButton pattern61;
    private javax.swing.JButton pattern62;
    private javax.swing.JButton pattern63;
    private javax.swing.JButton pattern64;
    private javax.swing.JButton pattern65;
    private javax.swing.JButton pattern66;
    private javax.swing.JButton pattern67;
    private javax.swing.JButton pattern71;
    private javax.swing.JButton pattern72;
    private javax.swing.JButton pattern73;
    private javax.swing.JButton pattern74;
    private javax.swing.JButton pattern75;
    private javax.swing.JButton pattern76;
    private javax.swing.JButton pattern77;
    private javax.swing.JButton pattern81;
    private javax.swing.JButton pattern82;
    private javax.swing.JButton pattern83;
    private javax.swing.JButton pattern84;
    private javax.swing.JButton pattern85;
    private javax.swing.JButton pattern86;
    private javax.swing.JButton pattern87;
    private javax.swing.JButton pattern91;
    private javax.swing.JButton pattern92;
    private javax.swing.JButton pattern93;
    private javax.swing.JButton pattern94;
    private javax.swing.JButton pattern95;
    private javax.swing.JButton pattern96;
    private javax.swing.JButton pattern97;
    private javax.swing.JButton qButton;
    private javax.swing.JButton rButton;
    private javax.swing.JButton sButton;
    private javax.swing.JButton stopButton;
    private javax.swing.JButton tButton;
    private javax.swing.JButton testButton;
    private javax.swing.JTextField toleranceField;
    private javax.swing.JButton trainButton;
    private javax.swing.JButton uButton;
    private javax.swing.JButton vButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JButton wButton;
    private javax.swing.JButton xButton;
    private javax.swing.JButton yButton;
    private javax.swing.JButton zButton;
    // End of variables declaration//GEN-END:variables
    /**
     * Array of all pattern button. This array variable for change pattern button to default alphabet value
     */
    private JButton[] button;   
    
    /**
     * Main data test value. Default value is -1. This is mean all pattern are white or nothing alphabetic pattern inside
     */
    private double[] data =
            {
                    -1,-1,-1,-1,-1,-1,-1,
                    -1,-1,-1,-1,-1,-1,-1,
                    -1,-1,-1,-1,-1,-1,-1,
                    -1,-1,-1,-1,-1,-1,-1,
                    -1,-1,-1,-1,-1,-1,-1,
                    -1,-1,-1,-1,-1,-1,-1,
                    -1,-1,-1,-1,-1,-1,-1,
                    -1,-1,-1,-1,-1,-1,-1,
                    -1,-1,-1,-1,-1,-1,-1
            };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        clearButton = new javax.swing.JButton();
        testButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        pattern11 = new javax.swing.JButton();
        pattern12 = new javax.swing.JButton();
        pattern13 = new javax.swing.JButton();
        pattern14 = new javax.swing.JButton();
        pattern15 = new javax.swing.JButton();
        pattern16 = new javax.swing.JButton();
        pattern21 = new javax.swing.JButton();
        pattern22 = new javax.swing.JButton();
        pattern23 = new javax.swing.JButton();
        pattern24 = new javax.swing.JButton();
        pattern25 = new javax.swing.JButton();
        pattern26 = new javax.swing.JButton();
        pattern31 = new javax.swing.JButton();
        pattern32 = new javax.swing.JButton();
        pattern33 = new javax.swing.JButton();
        pattern34 = new javax.swing.JButton();
        pattern35 = new javax.swing.JButton();
        pattern36 = new javax.swing.JButton();
        pattern41 = new javax.swing.JButton();
        pattern42 = new javax.swing.JButton();
        pattern43 = new javax.swing.JButton();
        pattern44 = new javax.swing.JButton();
        pattern45 = new javax.swing.JButton();
        pattern46 = new javax.swing.JButton();
        pattern51 = new javax.swing.JButton();
        pattern52 = new javax.swing.JButton();
        pattern53 = new javax.swing.JButton();
        pattern54 = new javax.swing.JButton();
        pattern55 = new javax.swing.JButton();
        pattern56 = new javax.swing.JButton();
        pattern61 = new javax.swing.JButton();
        pattern62 = new javax.swing.JButton();
        pattern63 = new javax.swing.JButton();
        pattern64 = new javax.swing.JButton();
        pattern65 = new javax.swing.JButton();
        pattern66 = new javax.swing.JButton();
        pattern71 = new javax.swing.JButton();
        pattern72 = new javax.swing.JButton();
        pattern73 = new javax.swing.JButton();
        pattern74 = new javax.swing.JButton();
        pattern75 = new javax.swing.JButton();
        pattern76 = new javax.swing.JButton();
        pattern81 = new javax.swing.JButton();
        pattern82 = new javax.swing.JButton();
        pattern83 = new javax.swing.JButton();
        pattern84 = new javax.swing.JButton();
        pattern85 = new javax.swing.JButton();
        pattern86 = new javax.swing.JButton();
        pattern91 = new javax.swing.JButton();
        pattern92 = new javax.swing.JButton();
        pattern93 = new javax.swing.JButton();
        pattern94 = new javax.swing.JButton();
        pattern95 = new javax.swing.JButton();
        pattern96 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        aButton = new javax.swing.JButton();
        bButton = new javax.swing.JButton();
        cButton = new javax.swing.JButton();
        dButton = new javax.swing.JButton();
        eButton = new javax.swing.JButton();
        fButton = new javax.swing.JButton();
        gButton = new javax.swing.JButton();
        hButton = new javax.swing.JButton();
        iButton = new javax.swing.JButton();
        jButton = new javax.swing.JButton();
        kButton = new javax.swing.JButton();
        lButton = new javax.swing.JButton();
        mButton = new javax.swing.JButton();
        nButton = new javax.swing.JButton();
        oButton = new javax.swing.JButton();
        pButton = new javax.swing.JButton();
        qButton = new javax.swing.JButton();
        rButton = new javax.swing.JButton();
        sButton = new javax.swing.JButton();
        tButton = new javax.swing.JButton();
        uButton = new javax.swing.JButton();
        vButton = new javax.swing.JButton();
        wButton = new javax.swing.JButton();
        xButton = new javax.swing.JButton();
        yButton = new javax.swing.JButton();
        zButton = new javax.swing.JButton();
        pattern97 = new javax.swing.JButton();
        pattern87 = new javax.swing.JButton();
        pattern77 = new javax.swing.JButton();
        pattern67 = new javax.swing.JButton();
        pattern57 = new javax.swing.JButton();
        pattern47 = new javax.swing.JButton();
        pattern37 = new javax.swing.JButton();
        pattern27 = new javax.swing.JButton();
        pattern17 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        logDataField = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        alphaField = new javax.swing.JTextField();
        toleranceField = new javax.swing.JTextField();
        epochField = new javax.swing.JTextField();
        trainButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        errorValue = new javax.swing.JLabel();
        epochValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Backpropagation Alphabet");

        jPanel1.setBackground(java.awt.Color.white);

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        testButton.setText("TEST");
        testButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Hasil :");

        valueLabel.setText("Unknown");

        pattern11.setBackground(java.awt.Color.white);

        pattern12.setBackground(java.awt.Color.white);

        pattern13.setBackground(java.awt.Color.white);

        pattern14.setBackground(java.awt.Color.white);

        pattern15.setBackground(java.awt.Color.white);

        pattern16.setBackground(java.awt.Color.white);

        pattern21.setBackground(java.awt.Color.white);

        pattern22.setBackground(java.awt.Color.white);

        pattern23.setBackground(java.awt.Color.white);

        pattern24.setBackground(java.awt.Color.white);

        pattern25.setBackground(java.awt.Color.white);

        pattern26.setBackground(java.awt.Color.white);

        pattern31.setBackground(java.awt.Color.white);

        pattern32.setBackground(java.awt.Color.white);

        pattern33.setBackground(java.awt.Color.white);

        pattern34.setBackground(java.awt.Color.white);

        pattern35.setBackground(java.awt.Color.white);

        pattern36.setBackground(java.awt.Color.white);

        pattern41.setBackground(java.awt.Color.white);

        pattern42.setBackground(java.awt.Color.white);

        pattern43.setBackground(java.awt.Color.white);

        pattern44.setBackground(java.awt.Color.white);

        pattern45.setBackground(java.awt.Color.white);

        pattern46.setBackground(java.awt.Color.white);

        pattern51.setBackground(java.awt.Color.white);

        pattern52.setBackground(java.awt.Color.white);

        pattern53.setBackground(java.awt.Color.white);

        pattern54.setBackground(java.awt.Color.white);

        pattern55.setBackground(java.awt.Color.white);

        pattern56.setBackground(java.awt.Color.white);

        pattern61.setBackground(java.awt.Color.white);

        pattern62.setBackground(java.awt.Color.white);

        pattern63.setBackground(java.awt.Color.white);

        pattern64.setBackground(java.awt.Color.white);

        pattern65.setBackground(java.awt.Color.white);

        pattern66.setBackground(java.awt.Color.white);

        pattern71.setBackground(java.awt.Color.white);

        pattern72.setBackground(java.awt.Color.white);

        pattern73.setBackground(java.awt.Color.white);

        pattern74.setBackground(java.awt.Color.white);

        pattern75.setBackground(java.awt.Color.white);

        pattern76.setBackground(java.awt.Color.white);

        pattern81.setBackground(java.awt.Color.white);

        pattern82.setBackground(java.awt.Color.white);

        pattern83.setBackground(java.awt.Color.white);

        pattern84.setBackground(java.awt.Color.white);

        pattern85.setBackground(java.awt.Color.white);

        pattern86.setBackground(java.awt.Color.white);

        pattern91.setBackground(java.awt.Color.white);

        pattern92.setBackground(java.awt.Color.white);

        pattern93.setBackground(java.awt.Color.white);

        pattern94.setBackground(java.awt.Color.white);

        pattern95.setBackground(java.awt.Color.white);

        pattern96.setBackground(java.awt.Color.white);

        jLabel5.setText("Test Default Pattern");

        aButton.setText("A");

        bButton.setText("B");

        cButton.setText("C");

        dButton.setText("D");

        eButton.setText("E");

        fButton.setText("F");

        gButton.setText("G");

        hButton.setText("H");

        iButton.setText("I");

        jButton.setText("J");

        kButton.setText("K");

        lButton.setText("L");

        mButton.setText("M");

        nButton.setText("N");

        oButton.setText("O");

        pButton.setText("P");

        qButton.setText("Q");

        rButton.setText("R");

        sButton.setText("S");

        tButton.setText("T");

        uButton.setText("U");

        vButton.setText("V");

        wButton.setText("W");

        xButton.setText("X");

        yButton.setText("Y");

        zButton.setText("Z");

        pattern97.setBackground(java.awt.Color.white);

        pattern87.setBackground(java.awt.Color.white);

        pattern77.setBackground(java.awt.Color.white);

        pattern67.setBackground(java.awt.Color.white);

        pattern57.setBackground(java.awt.Color.white);

        pattern47.setBackground(java.awt.Color.white);

        pattern37.setBackground(java.awt.Color.white);

        pattern27.setBackground(java.awt.Color.white);

        pattern17.setBackground(java.awt.Color.white);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(pattern41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pattern42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pattern43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(pattern31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pattern32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pattern33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(pattern21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(pattern22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(pattern23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(pattern11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(pattern12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(pattern13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pattern51, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pattern52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pattern53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pattern54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pattern55, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pattern24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pattern25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pattern14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pattern15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pattern34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pattern35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pattern44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pattern45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pattern26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pattern16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pattern36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pattern46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pattern56, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pattern17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pattern27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pattern37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pattern47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pattern57, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(pattern81, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pattern82, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pattern83, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(pattern71, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pattern72, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pattern73, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(pattern61, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pattern62, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pattern63, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pattern91, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pattern92, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pattern93, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pattern94, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pattern95, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pattern64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pattern65, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pattern74, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pattern75, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pattern84, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pattern85, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pattern96, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pattern66, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pattern76, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pattern86, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pattern97, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pattern77, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pattern87, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pattern67, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(testButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(clearButton)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(yButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(zButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(sButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(wButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(xButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(gButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(aButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(clearButton))
                            .addComponent(testButton)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(valueLabel)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pattern16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aButton)
                            .addComponent(bButton)
                            .addComponent(cButton)
                            .addComponent(dButton)
                            .addComponent(eButton)
                            .addComponent(fButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gButton)
                            .addComponent(hButton)
                            .addComponent(iButton)
                            .addComponent(jButton)
                            .addComponent(kButton)
                            .addComponent(lButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mButton)
                            .addComponent(nButton)
                            .addComponent(oButton)
                            .addComponent(pButton)
                            .addComponent(qButton)
                            .addComponent(rButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sButton)
                            .addComponent(tButton)
                            .addComponent(uButton)
                            .addComponent(vButton)
                            .addComponent(wButton)
                            .addComponent(xButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yButton)
                            .addComponent(zButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pattern11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pattern21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pattern31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pattern41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pattern51, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern55, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern56, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pattern17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pattern27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pattern37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pattern47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pattern57, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pattern61, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern62, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern63, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern65, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pattern71, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern72, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern73, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern74, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern75, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pattern81, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern82, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern83, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern84, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern85, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pattern91, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern92, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern93, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern94, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pattern95, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pattern66, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pattern76, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pattern86, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pattern96, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pattern67, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pattern77, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pattern87, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pattern97, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Testing", jPanel1);

        logDataField.setColumns(20);
        logDataField.setRows(1000);
        jScrollPane1.setViewportView(logDataField);

        jLabel2.setText("Alpha");

        jLabel3.setText("Tolerance");

        jLabel4.setText("Epoch");

        alphaField.setText("0.1");

        toleranceField.setText("0.1");

        epochField.setText("1000");

        trainButton.setBackground(java.awt.Color.green);
        trainButton.setText("Train");
        trainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainButtonActionPerformed(evt);
            }
        });

        stopButton.setBackground(java.awt.Color.red);
        stopButton.setForeground(java.awt.Color.darkGray);
        stopButton.setText("Stop");

        jLabel6.setText("Training Process Log");

        jLabel7.setText("Max Error Value");

        jLabel8.setText("Epoch on Training");

        errorValue.setText("0");

        epochValue.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(alphaField)
                                .addComponent(toleranceField)
                                .addComponent(epochField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorValue)
                            .addComponent(epochValue))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(127, 127, 127))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(alphaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(toleranceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(epochField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(trainButton)
                            .addComponent(stopButton))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(errorValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(epochValue))
                        .addGap(0, 122, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Training", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Clear All button pattern to white
     * @param evt 
     */
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        resetAll();
    }//GEN-LAST:event_clearButtonActionPerformed

    /**
     * Action on Training button
     * @param evt 
     */
    private void trainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainButtonActionPerformed
        CoreVariable.EPOCH = Double.valueOf(epochField.getText());
        CoreVariable.ALPHA = Double.valueOf(alphaField.getText());
        CoreVariable.THETA = Double.valueOf(toleranceField.getText());
        logDataField.setText("Application training in progress...");
        presenter.learn(AlphabetLibrary.ALPHABET_TRAINING, AlphabetLibrary.TARGET);
    }//GEN-LAST:event_trainButtonActionPerformed

    /**
     * Test pattern button
     * @param evt 
     */
    private void testButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButtonActionPerformed
        presenter.test(data);
    }//GEN-LAST:event_testButtonActionPerformed

    /**
     * a main function in this application
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            HintDialogForm.runForm();            
        });
    }
    
    /**
     * Initialize button[] value with all pattern button
     */
    private void setButtonArrayInitializer(){
        button = new JButton[]{
            pattern11, pattern12, pattern13, pattern14, pattern15, pattern16, pattern17, 
            pattern21, pattern22, pattern23, pattern24, pattern25, pattern26, pattern27, 
            pattern31, pattern32, pattern33, pattern34, pattern35, pattern36, pattern37, 
            pattern41, pattern42, pattern43, pattern44, pattern45, pattern46, pattern47, 
            pattern51, pattern52, pattern53, pattern54, pattern55, pattern56, pattern57, 
            pattern61, pattern62, pattern63, pattern64, pattern65, pattern66, pattern67, 
            pattern71, pattern72, pattern73, pattern74, pattern75, pattern76, pattern77, 
            pattern81, pattern82, pattern83, pattern84, pattern85, pattern86, pattern87, 
            pattern91, pattern92, pattern93, pattern94, pattern95, pattern96, pattern97
        };
    }
    
    /**
     * Add pattern button action
     */
    private void setButtonActions(){
        //Baris 1
        pattern11.addActionListener(v -> data[0] = changeColor(pattern11));
        pattern12.addActionListener(v -> data[1] = changeColor(pattern12));
        pattern13.addActionListener(v -> data[2] = changeColor(pattern13));
        pattern14.addActionListener(v -> data[3] = changeColor(pattern14));
        pattern15.addActionListener(v -> data[4] = changeColor(pattern15));
        pattern16.addActionListener(v -> data[5] = changeColor(pattern16));
        pattern17.addActionListener(v -> data[6] = changeColor(pattern17));

        //Baris 2
        pattern21.addActionListener(v -> data[7] = changeColor(pattern21));
        pattern22.addActionListener(v -> data[8] = changeColor(pattern22));
        pattern23.addActionListener(v -> data[9] = changeColor(pattern23));
        pattern24.addActionListener(v -> data[10] = changeColor(pattern24));
        pattern25.addActionListener(v -> data[11] = changeColor(pattern25));
        pattern26.addActionListener(v -> data[12] = changeColor(pattern26));
        pattern27.addActionListener(v -> data[13] = changeColor(pattern27));

        //Baris 3
        pattern31.addActionListener(v -> data[14] = changeColor(pattern31));
        pattern32.addActionListener(v -> data[15] = changeColor(pattern32));
        pattern33.addActionListener(v -> data[16] = changeColor(pattern33));
        pattern34.addActionListener(v -> data[17] = changeColor(pattern34));
        pattern35.addActionListener(v -> data[18] = changeColor(pattern35));
        pattern36.addActionListener(v -> data[19] = changeColor(pattern36));
        pattern37.addActionListener(v -> data[20] = changeColor(pattern37));

        //Baris 4
        pattern41.addActionListener(v -> data[21] = changeColor(pattern41));
        pattern42.addActionListener(v -> data[22] = changeColor(pattern42));
        pattern43.addActionListener(v -> data[23] = changeColor(pattern43));
        pattern44.addActionListener(v -> data[24] = changeColor(pattern44));
        pattern45.addActionListener(v -> data[25] = changeColor(pattern45));
        pattern46.addActionListener(v -> data[26] = changeColor(pattern46));
        pattern47.addActionListener(v -> data[27] = changeColor(pattern47));

        //Baris 5
        pattern51.addActionListener(v -> data[28] = changeColor(pattern51));
        pattern52.addActionListener(v -> data[29] = changeColor(pattern52));
        pattern53.addActionListener(v -> data[30] = changeColor(pattern53));
        pattern54.addActionListener(v -> data[31] = changeColor(pattern54));
        pattern55.addActionListener(v -> data[32] = changeColor(pattern55));
        pattern56.addActionListener(v -> data[33] = changeColor(pattern56));
        pattern57.addActionListener(v -> data[34] = changeColor(pattern57));

        //Baris 6
        pattern61.addActionListener(v -> data[35] = changeColor(pattern61));
        pattern62.addActionListener(v -> data[36] = changeColor(pattern62));
        pattern63.addActionListener(v -> data[37] = changeColor(pattern63));
        pattern64.addActionListener(v -> data[38] = changeColor(pattern64));
        pattern65.addActionListener(v -> data[39] = changeColor(pattern65));
        pattern66.addActionListener(v -> data[40] = changeColor(pattern66));
        pattern67.addActionListener(v -> data[41] = changeColor(pattern67));

        //Baris 7
        pattern71.addActionListener(v -> data[42] = changeColor(pattern71));
        pattern72.addActionListener(v -> data[43] = changeColor(pattern72));
        pattern73.addActionListener(v -> data[44] = changeColor(pattern73));
        pattern74.addActionListener(v -> data[45] = changeColor(pattern74));
        pattern75.addActionListener(v -> data[46] = changeColor(pattern75));
        pattern76.addActionListener(v -> data[47] = changeColor(pattern76));
        pattern77.addActionListener(v -> data[48] = changeColor(pattern77));

        //Baris 8
        pattern81.addActionListener(v -> data[49] = changeColor(pattern81));
        pattern82.addActionListener(v -> data[50] = changeColor(pattern82));
        pattern83.addActionListener(v -> data[51] = changeColor(pattern83));
        pattern84.addActionListener(v -> data[52] = changeColor(pattern84));
        pattern85.addActionListener(v -> data[53] = changeColor(pattern85));
        pattern86.addActionListener(v -> data[54] = changeColor(pattern86));
        pattern87.addActionListener(v -> data[55] = changeColor(pattern87));

        //Baris 9
        pattern91.addActionListener(v -> data[56] = changeColor(pattern91));
        pattern92.addActionListener(v -> data[57] = changeColor(pattern92));
        pattern93.addActionListener(v -> data[58] = changeColor(pattern93));
        pattern94.addActionListener(v -> data[59] = changeColor(pattern94));
        pattern95.addActionListener(v -> data[60] = changeColor(pattern95));
        pattern96.addActionListener(v -> data[61] = changeColor(pattern96));
        pattern97.addActionListener(v -> data[62] = changeColor(pattern97));        
    }
    
    private void setDefaultPatterns(){
        aButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[0]);
        });
        
        bButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[1]);
        });
        
        cButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[2]);
        });
        
        dButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[3]);
        });
        
        eButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[4]);
        });
        
        fButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[5]);
        });
        
        gButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[6]);
        });
        
        hButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[7]);
        });
        
        iButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[8]);
        });
        
        jButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[9]);
        });
        
        kButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[10]);
        });
        
        lButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[11]);
        });
        
        mButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[12]);
        });
        
        nButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[13]);
        });
        
        oButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[14]);
        });
        
        pButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[15]);
        });
        
        qButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[16]);
        });
        
        rButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[17]);
        });
        
        sButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[18]);
        });
        
        tButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[19]);
        });
        
        uButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[20]);
        });
        
        vButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[21]);
        });
        
        wButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[22]);
        });
        
        xButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[23]);
        });
        
        yButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[24]);
        });
        
        zButton.addActionListener(v -> {
            changeColorwithPattern(AlphabetLibrary.ALPHABET_TRAINING[25]);
        });
    }
    
    /**
     *
     * @param epoch
     */
    @Override
    public void showEpochData(int epoch) {
        epochValue.setText(String.valueOf(epoch));
    }

    /**
     *
     * @param errLog
     */
    @Override
    public void showErrorData(double errLog) {
        errorValue.setText(String.valueOf(errLog));
    }

    /**
     *
     * @param logData
     */
    @Override
    public void showLogData(String logData) {
        logDataField.append(logData);
    }
    
    /**
     * Change your button color and data on your button
     * @param button
     * @return 
     */
    private int changeColor(JButton button){
        if (button.getBackground() == Color.WHITE) {
            button.setBackground(Color.BLACK);
            return 1;
        }
        else {
            button.setBackground(Color.WHITE);
            return -1;
        }
    }
    
    /**
     * Change your all pattern button with some array pattern.
     * Use 1 or -1 on your array value
     * @param pattern 
     */
    private void changeColorwithPattern(double[] pattern){
        for (int i = 0; i < pattern.length; i++) {
            if (pattern[i] == 1) {
                button[i].setBackground(Color.BLACK);
            }
            else{
                button[i].setBackground(Color.WHITE);
            }
            data[i] = pattern[i];
        }
    }
    
    /**
     * reset all background and data value on your pattern button
     */
    private void resetAll(){
        for (int i = 0; i < button.length; i++) {
            button[i].setBackground(Color.WHITE);
            data[i] = -1;
        }
    }

    /**
     *
     * @param presenter
     */
    @Override
    public void setPresenter(BackPropagationInterface.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void showResult(String result) {
        valueLabel.setText(result);
    }
}
