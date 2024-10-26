/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package peymentsystem1;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class UserLogin extends javax.swing.JFrame {


    /**
     * Creates new form UserLogin
     */
    public UserLogin() {
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

        txtUsername_Login = new javax.swing.JTextField();
        txtPassword_Login = new javax.swing.JPasswordField();
        Username_label = new java.awt.Label();
        Password_label = new java.awt.Label();
        btnLogin = new javax.swing.JButton();
        btnCancelLogin = new javax.swing.JButton();
        btnRegister_Login = new javax.swing.JButton();
        LOGIN_TITLE = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtUsername_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsername_LoginActionPerformed(evt);
            }
        });

        txtPassword_Login.setToolTipText("");

        Username_label.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Username_label.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Username_label.setText("Username");

        Password_label.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Password_label.setText("Password");

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCancelLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelLogin.setText("Cancel");
        btnCancelLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelLoginActionPerformed(evt);
            }
        });

        btnRegister_Login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegister_Login.setText("Register New User");
        btnRegister_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister_LoginActionPerformed(evt);
            }
        });

        LOGIN_TITLE.setFont(new java.awt.Font("sansserif", 1, 30)); // NOI18N
        LOGIN_TITLE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGIN_TITLE.setText("(Insert Title Here)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Password_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Username_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtUsername_Login, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPassword_Login, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnCancelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(btnRegister_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LOGIN_TITLE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(LOGIN_TITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(Username_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnCancelLogin))
                .addGap(18, 18, 18)
                .addComponent(btnRegister_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsername_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsername_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsername_LoginActionPerformed

    private void btnRegister_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister_LoginActionPerformed
        // TODO add your handling code here:
        frmRegister1 regUser = new frmRegister1();
        regUser.setVisible(true);            
    }//GEN-LAST:event_btnRegister_LoginActionPerformed

    private void btnCancelLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelLoginActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCancelLoginActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:     
        String UID = txtUsername_Login.getText();
        String Pwd = txtPassword_Login.getText();

        try (java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/payment_finals", "root", "")) {
            // Prepare the SQL statement
            String sql = "SELECT * FROM user_detail_register WHERE Username = ? AND Password = ?";
                                                                                                  
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, UID);
            statement.setString(2, Pwd);
            
            // Execute the query
            ResultSet resultSet = statement.executeQuery();
            
            // Check if the login is successful
            if (resultSet.next()) {
                JOptionPane.showMessageDialog(null, "Login successful!");
                Payment_main_UI Main_menu = new Payment_main_UI();
                Main_menu.setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password.");
                }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "Database Connection Error" + e.getMessage());
        }
    

    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin().setVisible(true);
            }                
        });
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGIN_TITLE;
    private java.awt.Label Password_label;
    private java.awt.Label Username_label;
    private javax.swing.JButton btnCancelLogin;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister_Login;
    private javax.swing.JPasswordField txtPassword_Login;
    public javax.swing.JTextField txtUsername_Login;
    // End of variables declaration//GEN-END:variables
}
