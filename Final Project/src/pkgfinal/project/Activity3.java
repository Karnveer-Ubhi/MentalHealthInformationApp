/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project;
import java.util.ArrayList;

/**
 * Karnveer Ubhi
 * Activity 3
 * November 11, 2020
 */
public class Activity3 extends javax.swing.JFrame {

    /**
     * Creates new form Activity3
     */
    public Activity3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblTitle2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        lblAnxiety = new javax.swing.JLabel();
        txtInput1 = new javax.swing.JTextField();
        lblDepression = new javax.swing.JLabel();
        txtInput3 = new javax.swing.JTextField();
        txtInput2 = new javax.swing.JTextField();
        lblBipolar = new javax.swing.JLabel();
        txtInput4 = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOutput2 = new javax.swing.JTextArea();
        lblScore = new javax.swing.JLabel();
        lblOutput3 = new javax.swing.JLabel();
        lblSchiz = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTitle.setText("Activity 3: Rarity of Disorders");

        lblTitle2.setText("What percentange of the population have the following disorders?");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblAnxiety.setText("Anxiety Disorder (%)");

        lblDepression.setText("Depression (%)");

        lblBipolar.setText("Bipolar Disorder (%)");

        btnNext.setText("Next Page");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setText("Previous Page");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        txtOutput1.setColumns(20);
        txtOutput1.setRows(5);
        jScrollPane1.setViewportView(txtOutput1);

        txtOutput2.setColumns(20);
        txtOutput2.setRows(5);
        jScrollPane2.setViewportView(txtOutput2);

        lblScore.setText("Score:");

        lblSchiz.setText("Schizophrenia (%)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrevious)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblTitle2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(txtInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblAnxiety, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSchiz)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(txtInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBipolar)
                                    .addComponent(lblDepression)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtInput4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtInput3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEnter)
                                    .addComponent(lblScore, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblOutput3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExit)
                        .addComponent(btnNext)
                        .addComponent(btnPrevious)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(lblTitle2)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblScore, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEnter)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDepression)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtInput3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAnxiety)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBipolar)
                            .addComponent(lblSchiz))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInput4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(lblOutput3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        
        // Variables and Array used in the program 
        
        int [] Percentage2 = new int[4];
        int AnxietyPercent, DepressionPercent, SchizoPercent, BipolarPercent;
        int counter1 = 0;
        int counter2 = 0;
             
        /* Try-Catch that is used for error handling which execuites the following code: First, it adds 1 to the counter and assignes the textbox
        values to 4 diffrent arrays (userinput) and adds them to the 4 index values of the array created. Next, its displays a sentence in the 
        textbox and calls the QuickSort method to sort array with all the values we added from the user. Then, it outputs the sorted array into
        a textbox we created. After, a if statement is used to check if the user has inputted the correct answers if they have it adds 1 to the 
        score counter and if not adds nothing. Finnaly, it outputs the correct answers in 1 textbox from least to greatest and your answer from 
        lowest to greatest in the other textbox we created. It also displays the score counter which will tell you your mark out of 4. If any
        errors are genereted throught the exectuition it displays a message to the user which will help them fix it. */
        
    try {
        
        counter1++;
        
        AnxietyPercent = (Integer.parseInt(txtInput1.getText()));
        DepressionPercent = (Integer.parseInt(txtInput3.getText()));
        SchizoPercent = (Integer.parseInt(txtInput2.getText()));
        BipolarPercent = (Integer.parseInt(txtInput4.getText()));

        Percentage2[0] = AnxietyPercent;
        Percentage2[1] = DepressionPercent;
        Percentage2[2] = SchizoPercent;
        Percentage2[3] = BipolarPercent;
        
        txtOutput2.append("Your Answers from Lowest to Graetest are: ");
        
        QuicksortAscending(Percentage2, 0, 4 - 1);
        
        for (int i = 0; i < 4; i++) {
                txtOutput2.append(Integer.toString(Percentage2[i]) + "% ");
                }
   
        if (AnxietyPercent == 25) {
            counter2++;
        }
        if (DepressionPercent == 13) {
            counter2++;
        }
        if (SchizoPercent == 1) {
            counter2++;
        }
        if (BipolarPercent == 1) {
            counter2++;
        } 
        
        if (counter1 >= 0) {
            txtOutput1.setText("The Correct Answers from Lowest to Greatest are: Bipolar Disorder: 1%, Schizophrenia: 1%, Depression: 13%, Anxiety Disorder: 25%");
            lblScore.setText("Score: " + counter2 + "/4");
            btnEnter.setVisible(false); 
        }
        
    } catch(Exception e){       
        lblOutput3.setText("Invalid input. Please make sure input values are integers and boxes have been filled");
        e.printStackTrace();
        } 
}

    public static void QuicksortAscending(int A[], int left, int right){
        
    /* Recursive method that calls itself in its own method, it sorts list recurivly and sends values to the partition method that
    finds the answer */
    if(left < right)
    {
        int q = partitionAscending(A, left, right);
        QuicksortAscending(A, left, q);
        QuicksortAscending(A, q + 1, right);
    }
}

public static int partitionAscending(int A[], int left, int right){
    
    /* Variables are declared to use in method. Pivot elemets is taken to sort array into 2 sub arrays, where the left side from the pivot
    value are numbers smaller than it, and the right side having the numbers greater than it, The sub-arrays are than reranged based on the
    order selected in this case ascedning and are sorted recursively.
    */
    int pivot = A[left];
    int i = left;
    for(int j = left + 1; j <= right; j++){
        if (A[j] < pivot){
            i = i + 1;
            int temp = A[i];
            A[i]= A[j];
            A[j]= temp;
        }
    }
    int temp = A[i];
    A[i] = A[left];
    A[left] = temp;

    return i;
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        
        // Closes the program
        System.exit(0);
        
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        
        // Makes Activity2 frame visible and makes this frame invisible
        new secondActivity4().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        
        // Makes Quiz frame visible and this frame invisible   
        new quizPT1().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnNextActionPerformed

    /**
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Activity3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Activity3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Activity3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Activity3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Activity3().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAnxiety;
    private javax.swing.JLabel lblBipolar;
    private javax.swing.JLabel lblDepression;
    private javax.swing.JLabel lblOutput3;
    private javax.swing.JLabel lblSchiz;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JTextField txtInput1;
    private javax.swing.JTextField txtInput2;
    private javax.swing.JTextField txtInput3;
    private javax.swing.JTextField txtInput4;
    private javax.swing.JTextArea txtOutput1;
    private javax.swing.JTextArea txtOutput2;
    // End of variables declaration//GEN-END:variables
}
