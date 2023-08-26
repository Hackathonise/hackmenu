/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Harris Chou
 * Date: August 22,2023
 * Final Project Skincare Shop portion
 */
import java.text.DecimalFormat;//Importing the decmialformat
public class frmSkinCareShop extends javax.swing.JFrame 
{
    
    //Declaring the DecimalFormat for two decmial places
    DecimalFormat df2 = new DecimalFormat ("0.00"); 
    //Declaring the final tax constant to store it
    
    /**
     * Creates new form frmSkinCareShop
     */
    public frmSkinCareShop() {
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

        jLabel1 = new javax.swing.JLabel();
        lblTaxes = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        lblGrandTotal = new javax.swing.JLabel();
        lblLotion = new javax.swing.JLabel();
        txtLotion = new javax.swing.JTextField();
        lblMoisturizer = new javax.swing.JLabel();
        txtMoisturizer = new javax.swing.JTextField();
        lblCleanser = new javax.swing.JLabel();
        txtCleanser = new javax.swing.JTextField();
        lblSunscreen = new javax.swing.JLabel();
        lblSheetMask = new javax.swing.JLabel();
        txtSunscreen = new javax.swing.JTextField();
        txtSheetMask = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JToggleButton();
        btnGoBack = new javax.swing.JToggleButton();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Skincare Shop");

        lblTaxes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTaxes.setText("Taxes (13%):");

        lblSubtotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSubtotal.setText("Subtotal:");

        lblGrandTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGrandTotal.setText("Grand Total:");

        lblLotion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLotion.setText("Lotion ($10.99):");

        lblMoisturizer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMoisturizer.setText("Moisturizer ($15.99):");

        lblCleanser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCleanser.setText("Cleanser ($12.99):");

        lblSunscreen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSunscreen.setText("Sunscreen ($8.99):");

        lblSheetMask.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSheetMask.setText("Sheet Mask ($19.99):");

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Skin Care.jpg"))); // NOI18N

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGoBack)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImage)))
                .addGap(179, 179, 179))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLotion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblMoisturizer, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCleanser, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLotion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCleanser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMoisturizer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(lblSheetMask, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(lblSunscreen, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtSheetMask, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSunscreen, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(lblTaxes, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGrandTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSubtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(btnCalculate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnGoBack))
                .addGap(18, 18, 18)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLotion)
                    .addComponent(txtMoisturizer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTaxes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtCleanser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMoisturizer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCleanser)
                    .addComponent(txtLotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubtotal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSunscreen)
                    .addComponent(txtSunscreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSheetMask)
                    .addComponent(txtSheetMask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGrandTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalculate))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        new frmSelectShop().setVisible(true);//This will open the frmSelectShop GUi
        this.dispose();//This will close the frmSkinCareShop GUI
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
        if (!txtLotion.getText().isEmpty())//if lotion textbox is empty
        {
            intNum1 = Integer.parseInt(txtLotion.getText());//intNum1 will equal to 0
        }
        if (!txtMoisturizer.getText().isEmpty())//if moisturizer textbox is empty
        {
            intNum2 = Integer.parseInt(txtMoisturizer.getText());//intNum2 will equal to 0
        }
        if (!txtCleanser.getText().isEmpty())//if cleanser textbox is empty
        {
            intNum3 = Integer.parseInt(txtCleanser.getText());//intNum3 will equal to 0
        }
        if (!txtSunscreen.getText().isEmpty())//if sunscreen textbox is empty
        {
            intNum4 = Integer.parseInt(txtSunscreen.getText());//intNum4 will equal to 0
        }
        if (!txtSheetMask.getText().isEmpty())//if sheetmask textbox is empty
        {
            intNum5 = Integer.parseInt(txtSheetMask.getText());//intNum5 will equal to 0
        }

        //Check for negative numbers
        if (intNum1 < 0 || intNum2 < 0 || intNum3 < 0 || intNum4 < 0 || intNum5 < 0) 
        {
            lblError.setText("Please do not include negative numbers!");
            //Reset input fields and labels after negative numbers checked
            txtLotion.setText("");
            txtMoisturizer.setText("");
            txtCleanser.setText("");
            txtSunscreen.setText("");
            txtSheetMask.setText("");            
            return;//Return the negative numbers
        }

        //Calculation for the Subtotal
        answer = (intNum1 * 10.99) + (intNum2 * 15.99) + (intNum3 * 12.99) + (intNum4 * 8.99) + (intNum5 * 19.99);

        // Display the Subtotal
        lblSubtotal.setText("Subtotal: $" + df2.format(answer));
        //Calculating the tax from the subtotal
        double dblTax = answer * dblTaxes;
        lblTaxes.setText("Taxes(13%): $" + df2.format(dblTax));
        //Calculating the GrandTotal by adding both the answer and dblTax
        lblGrandTotal.setText("Grand Total: $" + df2.format(answer + dblTax));
        
        //Reset input fields and labels after calculation
        txtLotion.setText("");
        txtMoisturizer.setText("");
        txtCleanser.setText("");
        txtSunscreen.setText("");
        txtSheetMask.setText("");
        lblError.setText("");//Clear error message
        
    } catch (NumberFormatException e) 
    {
        //Let them know not to add anything other than numbers
        lblError.setText("Don't add anything other than numbers!");
        //Handle the exception outputting no value
        lblSubtotal.setText("Subtotal: $0.00");
        lblTaxes.setText("Taxes(13%): $0.00");
        lblGrandTotal.setText("Grand Total: $0.00");
        //Reset input fields and labels after NumberFormatError
        txtLotion.setText("");
        txtMoisturizer.setText("");
        txtCleanser.setText("");
        txtSunscreen.setText("");
        txtSheetMask.setText("");
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
            java.util.logging.Logger.getLogger(frmSkinCareShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSkinCareShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSkinCareShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSkinCareShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSkinCareShop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCalculate;
    private javax.swing.JToggleButton btnGoBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCleanser;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblGrandTotal;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLotion;
    private javax.swing.JLabel lblMoisturizer;
    private javax.swing.JLabel lblSheetMask;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblSunscreen;
    private javax.swing.JLabel lblTaxes;
    private javax.swing.JTextField txtCleanser;
    private javax.swing.JTextField txtLotion;
    private javax.swing.JTextField txtMoisturizer;
    private javax.swing.JTextField txtSheetMask;
    private javax.swing.JTextField txtSunscreen;
    // End of variables declaration//GEN-END:variables
}
