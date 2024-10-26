/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package peymentsystem1;



/**
 *
 * @author Lenovo
 */
public class Payment_main_UI extends javax.swing.JFrame {

    /**
     * Creates new form Payment_main_UI
     */
    public Payment_main_UI() {
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

        jLabel2 = new javax.swing.JLabel();
        PAYMENT_TITLE_UI = new javax.swing.JLabel();
        Balance_menu_name = new javax.swing.JLabel();
        Load_Menu_Button = new javax.swing.JButton();
        Bills_Menu_Button = new javax.swing.JButton();
        Inbox_Menu_Button = new javax.swing.JButton();
        BALANCE_ACCOUNT = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PAYMENT_TITLE_UI.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        PAYMENT_TITLE_UI.setText("(Insert Title Here)");

        Balance_menu_name.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        Balance_menu_name.setText("Balance:");

        Load_Menu_Button.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        Load_Menu_Button.setText("Load");
        Load_Menu_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Load_Menu_ButtonActionPerformed(evt);
            }
        });

        Bills_Menu_Button.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        Bills_Menu_Button.setText("Bills");
        Bills_Menu_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bills_Menu_ButtonActionPerformed(evt);
            }
        });

        Inbox_Menu_Button.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        Inbox_Menu_Button.setText("Inbox");
        Inbox_Menu_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inbox_Menu_ButtonActionPerformed(evt);
            }
        });

        BALANCE_ACCOUNT.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        BALANCE_ACCOUNT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BALANCE_ACCOUNT.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                BALANCE_ACCOUNTComponentShown(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Inbox_Menu_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Load_Menu_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bills_Menu_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Balance_menu_name)
                        .addGap(18, 18, 18)
                        .addComponent(BALANCE_ACCOUNT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(PAYMENT_TITLE_UI))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(PAYMENT_TITLE_UI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Balance_menu_name, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(BALANCE_ACCOUNT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Load_Menu_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(Bills_Menu_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Inbox_Menu_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Load_Menu_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Load_Menu_ButtonActionPerformed
        // TODO add your handling code here:
        Load_Interface load_interface = new Load_Interface();
        load_interface.setVisible(true);
    }//GEN-LAST:event_Load_Menu_ButtonActionPerformed

    private void Bills_Menu_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bills_Menu_ButtonActionPerformed
        // TODO add your handling code here:
        Bills_Interface bills_interface = new Bills_Interface();
        bills_interface.setVisible(true);
    }//GEN-LAST:event_Bills_Menu_ButtonActionPerformed

    private void Inbox_Menu_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inbox_Menu_ButtonActionPerformed
        // TODO add your handling code here:
        Inbox_Interface inbox_interface = new Inbox_Interface();
        inbox_interface.setVisible(true);
    }//GEN-LAST:event_Inbox_Menu_ButtonActionPerformed

    private void BALANCE_ACCOUNTComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BALANCE_ACCOUNTComponentShown
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_BALANCE_ACCOUNTComponentShown

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
            java.util.logging.Logger.getLogger(Payment_main_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment_main_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment_main_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment_main_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment_main_UI().setVisible(true);
                                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BALANCE_ACCOUNT;
    private javax.swing.JLabel Balance_menu_name;
    private javax.swing.JButton Bills_Menu_Button;
    private javax.swing.JButton Inbox_Menu_Button;
    private javax.swing.JButton Load_Menu_Button;
    private javax.swing.JLabel PAYMENT_TITLE_UI;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
