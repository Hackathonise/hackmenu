/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Harris Chou
 * Date: August 22,2023
 * Final Project Clothing Shop portion
 */
import java.text.DecimalFormat;//importing the decimalformat
public class frmClothingShop extends javax.swing.JFrame 
{
    
    //Declaring the DecimalFormat for two decmial places
    DecimalFormat df2 = new DecimalFormat ("0.00"); 
    //Declaring the final tax constant to store it

    /**
     * Creates new form frmClothingShop
     */
    public frmClothingShop() 
    {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        lblTitle = new javax.swing.JLabel();
        lblShirt = new javax.swing.JLabel();
        lblJeans = new javax.swing.JLabel();
        lblCap = new javax.swing.JLabel();
        lblShoes = new javax.swing.JLabel();
        lblSocks = new javax.swing.JLabel();
        txtShirt = new javax.swing.JTextField();
        txtJeans = new javax.swing.JTextField();
        txtCap = new javax.swing.JTextField();
        txtShoes = new javax.swing.JTextField();
        txtSocks = new javax.swing.JTextField();
        lblTaxes = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        lblGrandTotal = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JToggleButton();
        btnGoBack = new javax.swing.JToggleButton();
        lblError = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setText("Clothing Shop");

        lblShirt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblShirt.setText("White T-Shirt ($18.99):");

        lblJeans.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblJeans.setText("Blue Jeans ($14.99):");

        lblCap.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCap.setText("Red Cap ($9.99):");

        lblShoes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblShoes.setText("Shoes ($59.99):");

        lblSocks.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSocks.setText("White Socks ($6.99):");

        txtShirt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShirtActionPerformed(evt);
            }
        });

        lblTaxes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTaxes.setText("Taxes (13%):");

        lblSubtotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSubtotal.setText("Subtotal:");

        lblGrandTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGrandTotal.setText("Grand Total:");

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/T-Shirt.jpg"))); // NOI18N

        btnCalculate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnGoBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGoBack.setText("Back To Menu");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        lblError.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblError.setText("Please enter the quantity of items u would like to purchase");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnGoBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(9, 9, 9)))
                .addGap(211, 211, 211))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSocks)
                                        .addGap(49, 49, 49)
                                        .addComponent(txtSocks, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtShoes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCap, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblJeans)
                                    .addComponent(lblShirt)
                                    .addComponent(lblCap)
                                    .addComponent(lblShoes))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtJeans, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(txtShirt))))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 44, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lblSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblTaxes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(btnCalculate)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(18, 18, 18)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(lblTaxes))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGoBack)
                        .addGap(245, 245, 245)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblShirt)
                            .addComponent(txtShirt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblJeans)
                            .addComponent(txtJeans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCap)
                            .addComponent(txtCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSubtotal))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblShoes)
                    .addComponent(txtShoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSocks)
                    .addComponent(txtSocks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGrandTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalculate)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtShirtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShirtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtShirtActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        new frmSelectShop().setVisible(true);//This will open the frmSelectShop GUI
        this.dispose();//This will close the frmClothingShop GUI
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
    //Declare Variables for each item
    int intNum1 = 0;
    int intNum2 = 0;
    int intNum3 = 0;
    int intNum4 = 0;
    int intNum5 = 0;
    double answer;
    final double dblTaxes = 0.13;//Declaring the final tax constant to store it

    try 
    {
        //Receive the values from each item if the fields are not empty
        if (!txtShirt.getText().isEmpty())//If shirt textbox is empty 
        {
            intNum1 = Integer.parseInt(txtShirt.getText());//intNum1 will equal to 0
        }
        if (!txtJeans.getText().isEmpty())//If Jeans textbox is empty
        {
            intNum2 = Integer.parseInt(txtJeans.getText());//intNum2 will equal to 0
        }
        if (!txtCap.getText().isEmpty()) //If Cap textbox is empty
        {
            intNum3 = Integer.parseInt(txtCap.getText());//intNum3 will equal to 0
        }
        if (!txtShoes.getText().isEmpty())//If Shoes textbox is empty
        {
            intNum4 = Integer.parseInt(txtShoes.getText());//intNum4 will equal to 0
        }
        if (!txtSocks.getText().isEmpty())//If Socks textbox is empty
        {
            intNum5 = Integer.parseInt(txtSocks.getText());//intNum5 will equal to 0
        }

        //Checking all int for negative numbers
        if (intNum1 < 0 || intNum2 < 0 || intNum3 < 0 || intNum4 < 0 || intNum5 < 0) 
        {
            //Let them know not to add negative numbers to the text
            lblError.setText("Please do not include negative numbers!");
            //Reset input fields and labels after negative numbers checked
            txtShirt.setText("");
            txtJeans.setText("");
            txtCap.setText("");
            txtShoes.setText("");
            txtSocks.setText("");
            return;//Return the negative numbers
        }

        //Calculation for the Subtotal
        answer = (intNum1 * 18.99) + (intNum2 * 14.99) + (intNum3 * 9.99) + (intNum4 * 59.99) + (intNum5 * 6.99);

        //Display the Subtotal
        lblSubtotal.setText("Subtotal: $" + df2.format(answer));
        //Calculating the tax from the subtotal
        double dblTax = answer * dblTaxes;
        lblTaxes.setText("Taxes(13%): $" + df2.format(dblTax));
        //Calculating the GrandTotal by adding both the answer and dblTax
        lblGrandTotal.setText("Grand Total: $" + df2.format(answer + dblTax));
        
        //Reset input fields and labels after calculation
        txtShirt.setText("");
        txtJeans.setText("");
        txtCap.setText("");
        txtShoes.setText("");
        txtSocks.setText("");
        lblError.setText("");//Clear error message
        
    } catch (NumberFormatException e)//Using numberformat to catch the error if there is no integer 
    {
        //Let them know not to add anything other than numbers
        lblError.setText("Don't add anything other than numbers!");
        //Handle the exception outputting no value
        lblSubtotal.setText("Subtotal: $0.00");
        lblTaxes.setText("Taxes(13%): $0.00");
        lblGrandTotal.setText("Grand Total: $0.00");
        //Reset input fields and labels after NumberFormatError
        txtShirt.setText("");
        txtJeans.setText("");
        txtCap.setText("");
        txtShoes.setText("");
        txtSocks.setText("");
    }
    }//GEN-LAST:event_btnCalculateActionPerformed

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
            java.util.logging.Logger.getLogger(frmClothingShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmClothingShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmClothingShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmClothingShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmClothingShop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCalculate;
    private javax.swing.JToggleButton btnGoBack;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCap;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblGrandTotal;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblJeans;
    private javax.swing.JLabel lblShirt;
    private javax.swing.JLabel lblShoes;
    private javax.swing.JLabel lblSocks;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTaxes;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCap;
    private javax.swing.JTextField txtJeans;
    private javax.swing.JTextField txtShirt;
    private javax.swing.JTextField txtShoes;
    private javax.swing.JTextField txtSocks;
    // End of variables declaration//GEN-END:variables
}
