/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package peymentsystem1;

/**
 *
 * @author Lenovo
 */
public class BuyLoad_Interface extends javax.swing.JFrame {

    /**
     * Creates new form BuyLoad_Interface01
     */
    public BuyLoad_Interface() {
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

        Buy_load_Title = new javax.swing.JLabel();
        Type_Payment_Title = new javax.swing.JLabel();
        Over_The_Counter_Button = new javax.swing.JButton();
        Online_Bank_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Buy_load_Title.setFont(new java.awt.Font("sansserif", 1, 30)); // NOI18N
        Buy_load_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Buy_load_Title.setText("Load Cash");

        Type_Payment_Title.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        Type_Payment_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Type_Payment_Title.setText("Type Of Payment:");

        Over_The_Counter_Button.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        Over_The_Counter_Button.setText("Over The Counter");
        Over_The_Counter_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Over_The_Counter_ButtonActionPerformed(evt);
            }
        });

        Online_Bank_Button.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        Online_Bank_Button.setText("Online Bank");
        Online_Bank_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Online_Bank_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Buy_load_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Type_Payment_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(Over_The_Counter_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Online_Bank_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Buy_load_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Type_Payment_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Over_The_Counter_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Online_Bank_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Over_The_Counter_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Over_The_Counter_ButtonActionPerformed
        // TODO add your handling code here:
        BuyLoad_Over_The_Counter_Interface001 OverTheCounter001 = new BuyLoad_Over_The_Counter_Interface001();
        OverTheCounter001.setVisible(true);
    }//GEN-LAST:event_Over_The_Counter_ButtonActionPerformed

    private void Online_Bank_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Online_Bank_ButtonActionPerformed
        // TODO add your handling code here:
        BuyLoad_Online_Bank_Interface001 OnlineBank001 = new BuyLoad_Online_Bank_Interface001();
        OnlineBank001.setVisible(true);
    }//GEN-LAST:event_Online_Bank_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BuyLoad_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyLoad_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyLoad_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyLoad_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyLoad_Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buy_load_Title;
    private javax.swing.JButton Online_Bank_Button;
    private javax.swing.JButton Over_The_Counter_Button;
    private javax.swing.JLabel Type_Payment_Title;
    // End of variables declaration//GEN-END:variables
}
