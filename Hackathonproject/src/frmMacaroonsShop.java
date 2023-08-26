/**
 *
 * @author Harris Chou
 * Date: August 22, 2023
 * Final Project Macaroons Shop portion
 */
import java.text.DecimalFormat;//Importing the decimalformat
public class frmMacaroonsShop extends javax.swing.JFrame 
{

    //Declaring the DecimalFormat for two decmial places
    DecimalFormat df2 = new DecimalFormat ("0.00"); 
    //Declaring the final tax constant to store it
    
    /**
     * Creates new form frmMarkingPurchase
     */
    public frmMacaroonsShop() {
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

        lblTaxes = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        txtSportsDrink = new javax.swing.JTextField();
        txtWaterBottle = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        lblGrandTotal = new javax.swing.JLabel();
        lblSportsDrink = new javax.swing.JLabel();
        lblWaterBottle = new javax.swing.JLabel();
        lblFries = new javax.swing.JLabel();
        lblPoutine = new javax.swing.JLabel();
        lblRiceChicken = new javax.swing.JLabel();
        txtFries = new javax.swing.JTextField();
        txtPoutine = new javax.swing.JTextField();
        txtRiceChicken = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnPoutineImage = new javax.swing.JButton();
        btnGoBack = new javax.swing.JToggleButton();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTaxes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTaxes.setText("Taxes (13%):");

        lblSubtotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSubtotal.setText("Subtotal:");

        txtSportsDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSportsDrinkActionPerformed(evt);
            }
        });

        txtWaterBottle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWaterBottleActionPerformed(evt);
            }
        });

        btnCalculate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        lblGrandTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGrandTotal.setText("Grand Total:");

        lblSportsDrink.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSportsDrink.setText("Lemon Macaroons ($1.99):");

        lblWaterBottle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblWaterBottle.setText("Blueberry Macaroons ($1.79):");

        lblFries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFries.setText("Raspberry Macaroons ($1.99):");

        lblPoutine.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPoutine.setText("Lime Macaroons ($1.79):");

        lblRiceChicken.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRiceChicken.setText("Banana Macaroons ($2.29):");

        txtFries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFriesActionPerformed(evt);
            }
        });

        txtRiceChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRiceChickenActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 102));
        lblTitle.setText("Macaroons Shop");

        btnPoutineImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Macaroons.jpg"))); // NOI18N

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFries)
                            .addComponent(lblWaterBottle)
                            .addComponent(lblPoutine)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRiceChicken)
                                .addGap(1, 1, 1)))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSportsDrink)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtPoutine, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(txtFries, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtWaterBottle, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSportsDrink, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRiceChicken))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSubtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTaxes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGrandTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGoBack)
                        .addGap(73, 73, 73)
                        .addComponent(lblTitle)))
                .addGap(0, 205, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(btnPoutineImage, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(btnCalculate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGoBack)
                    .addComponent(lblTitle))
                .addGap(27, 27, 27)
                .addComponent(btnPoutineImage, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSportsDrink)
                            .addComponent(txtSportsDrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWaterBottle)
                            .addComponent(txtWaterBottle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFries)
                            .addComponent(txtFries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPoutine)
                            .addComponent(txtPoutine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRiceChicken)
                            .addComponent(txtRiceChicken, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTaxes)
                        .addGap(62, 62, 62)
                        .addComponent(lblSubtotal)
                        .addGap(62, 62, 62)
                        .addComponent(lblGrandTotal)))
                .addGap(18, 18, 18)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalculate)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
    // Declare Variables for each item
    int intNum1 = 0;
    int intNum2 = 0;
    int intNum3 = 0;
    int intNum4 = 0;
    int intNum5 = 0;
    double answer;
    final double dblTaxes = 0.13; // Declaring the final tax constant to store it

    try 
    {
        // Receive the values from each item if the fields are not empty
        if (!txtSportsDrink.getText().isEmpty())//if Sports drink textbox is empty
        {
            intNum1 = Integer.parseInt(txtSportsDrink.getText());//intNum1 will equal to 0
        }
        if (!txtWaterBottle.getText().isEmpty())//if waterbottle textbox is empty
        {
            intNum2 = Integer.parseInt(txtWaterBottle.getText());//intNum2 will equal to 0
        }
        if (!txtFries.getText().isEmpty())//if fries textbox is empty
        {
            intNum3 = Integer.parseInt(txtFries.getText());//intNum3 will equal to 0
        }
        if (!txtPoutine.getText().isEmpty())//if poutine textbox is empty 
        {
            intNum4 = Integer.parseInt(txtPoutine.getText());//intNum4 will equal to 0
        }
        if (!txtRiceChicken.getText().isEmpty())//if rice chicken text box is empty 
        {
            intNum5 = Integer.parseInt(txtRiceChicken.getText());//intNum5 will equal to 0
        }

        // Check for negative numbers
        if (intNum1 < 0 || intNum2 < 0 || intNum3 < 0 || intNum4 < 0 || intNum5 < 0) 
        {
            lblError.setText("Please do not include negative numbers!");
            //Reset input fields and labels after negative numbers checked
            txtSportsDrink.setText("");
            txtWaterBottle.setText("");
            txtFries.setText("");
            txtPoutine.setText("");
            txtRiceChicken.setText("");
            return;//Return the negative numbers
        }

        // Calculation for the Subtotal
        answer = (intNum1 * 1.99) + (intNum2 * 1.79) + (intNum3 * 1.99) + (intNum4 * 1.79) + (intNum5 * 2.29);

        // Display the Subtotal
        lblSubtotal.setText("Subtotal: $" + df2.format(answer));
        // Calculating the tax from the subtotal
        double dblTax = answer * dblTaxes;
        lblTaxes.setText("Taxes(13%): $" + df2.format(dblTax));
        // Calculating the GrandTotal by adding both the answer and dblTax
        lblGrandTotal.setText("Grand Total: $" + df2.format(answer + dblTax));
        
        //Reset input fields and labels after calculation
        txtSportsDrink.setText("");
        txtWaterBottle.setText("");
        txtFries.setText("");
        txtPoutine.setText("");
        txtRiceChicken.setText("");
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
        txtSportsDrink.setText("");
        txtWaterBottle.setText("");
        txtFries.setText("");
        txtPoutine.setText("");
        txtRiceChicken.setText("");
    }
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void txtSportsDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSportsDrinkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSportsDrinkActionPerformed

    private void txtWaterBottleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWaterBottleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWaterBottleActionPerformed

    private void txtRiceChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRiceChickenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRiceChickenActionPerformed

    private void txtFriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFriesActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        new frmSelectShop().setVisible(true);//This will open the frmSelectShop GUI
        this.dispose();//This will close the frmMacaroonsShop GUI
    }//GEN-LAST:event_btnGoBackActionPerformed

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
            java.util.logging.Logger.getLogger(frmMacaroonsShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMacaroonsShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMacaroonsShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMacaroonsShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMacaroonsShop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JToggleButton btnGoBack;
    private javax.swing.JButton btnPoutineImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblFries;
    private javax.swing.JLabel lblGrandTotal;
    private javax.swing.JLabel lblPoutine;
    private javax.swing.JLabel lblRiceChicken;
    private javax.swing.JLabel lblSportsDrink;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTaxes;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWaterBottle;
    private javax.swing.JTextField txtFries;
    private javax.swing.JTextField txtPoutine;
    private javax.swing.JTextField txtRiceChicken;
    private javax.swing.JTextField txtSportsDrink;
    private javax.swing.JTextField txtWaterBottle;
    // End of variables declaration//GEN-END:variables
}
