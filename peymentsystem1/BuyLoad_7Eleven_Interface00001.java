/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package peymentsystem1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class BuyLoad_7Eleven_Interface00001 extends javax.swing.JFrame {

    /**
     * Creates new form BuyLoad_AlfaMart_Interface00001
     */
    public BuyLoad_7Eleven_Interface00001() {
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

        SEVENELEVEN_LABEL = new javax.swing.JLabel();
        SevenEleven_Amount_Text = new javax.swing.JTextField();
        SevenEleven_Amount_Title = new javax.swing.JLabel();
        SevenEleven_Account_Text = new javax.swing.JTextField();
        SevenEleven_Account_Title = new javax.swing.JLabel();
        SevenEleven_Email_Title = new javax.swing.JLabel();
        SevenEleven_Email_Text = new javax.swing.JTextField();
        SevenEleven_Pay_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SEVENELEVEN_LABEL.setFont(new java.awt.Font("sansserif", 1, 30)); // NOI18N
        SEVENELEVEN_LABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SEVENELEVEN_LABEL.setText("7-Eleven");

        SevenEleven_Amount_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SevenEleven_Amount_TextActionPerformed(evt);
            }
        });

        SevenEleven_Amount_Title.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        SevenEleven_Amount_Title.setText("Amount");

        SevenEleven_Account_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SevenEleven_Account_TextActionPerformed(evt);
            }
        });

        SevenEleven_Account_Title.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        SevenEleven_Account_Title.setText("Account Name");

        SevenEleven_Email_Title.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        SevenEleven_Email_Title.setText("Account No.");

        SevenEleven_Email_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SevenEleven_Email_TextActionPerformed(evt);
            }
        });

        SevenEleven_Pay_Button.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        SevenEleven_Pay_Button.setText("PAY");
        SevenEleven_Pay_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SevenEleven_Pay_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SEVENELEVEN_LABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SevenEleven_Email_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SevenEleven_Email_Title)
                            .addComponent(SevenEleven_Account_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SevenEleven_Amount_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SevenEleven_Amount_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SevenEleven_Account_Title)
                            .addComponent(SevenEleven_Pay_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SEVENELEVEN_LABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SevenEleven_Amount_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SevenEleven_Amount_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SevenEleven_Account_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SevenEleven_Account_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SevenEleven_Email_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SevenEleven_Email_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(SevenEleven_Pay_Button)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SevenEleven_Amount_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SevenEleven_Amount_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SevenEleven_Amount_TextActionPerformed

    private void SevenEleven_Pay_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SevenEleven_Pay_ButtonActionPerformed
        // TODO add your handling code here:
                String Amt = SevenEleven_Amount_Text.getText();
                String Acc = SevenEleven_Account_Text.getText();
                String Email = SevenEleven_Email_Text.getText();
                
                try (java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/payment_finals", "root", "")) 
                {
                    System.out.println(connection);
            // Prepare the SQL statement
            String sql = "INSERT INTO buy_and_pay (Amount, Account_name, Account_number) VALUES (?, ?, ?)";
                                                                                                  
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, Amt);
            statement.setString(2, Acc);
            statement.setString(3, Email);
            
            // Execute the query
                    int resultSet = statement.executeUpdate();
                    int rowsAffected = resultSet;
                    
            
            // Check if the login is successful
            if (rowsAffected > 0) 
            {
                JOptionPane.showMessageDialog(null, "Payment successful!");
                System.out.println(rowsAffected);
                Payment_main_UI Main_menu = new Payment_main_UI();
                Main_menu.setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "Payment Failure");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "Database Connection Error" + e.getMessage());
        }

    }//GEN-LAST:event_SevenEleven_Pay_ButtonActionPerformed

    private void SevenEleven_Email_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SevenEleven_Email_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SevenEleven_Email_TextActionPerformed

    private void SevenEleven_Account_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SevenEleven_Account_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SevenEleven_Account_TextActionPerformed

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
            java.util.logging.Logger.getLogger(BuyLoad_7Eleven_Interface00001.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyLoad_7Eleven_Interface00001.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyLoad_7Eleven_Interface00001.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyLoad_7Eleven_Interface00001.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyLoad_7Eleven_Interface00001().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SEVENELEVEN_LABEL;
    private javax.swing.JTextField SevenEleven_Account_Text;
    private javax.swing.JLabel SevenEleven_Account_Title;
    private javax.swing.JTextField SevenEleven_Amount_Text;
    private javax.swing.JLabel SevenEleven_Amount_Title;
    private javax.swing.JTextField SevenEleven_Email_Text;
    private javax.swing.JLabel SevenEleven_Email_Title;
    private javax.swing.JButton SevenEleven_Pay_Button;
    // End of variables declaration//GEN-END:variables
}
