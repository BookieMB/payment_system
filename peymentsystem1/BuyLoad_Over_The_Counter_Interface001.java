/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package peymentsystem1;

/**
 *
 * @author Lenovo
 */
public class BuyLoad_Over_The_Counter_Interface001 extends javax.swing.JFrame {

    /**
     * Creates new form BuyLoad_Over_The_Counter_Interface001
     */
    public BuyLoad_Over_The_Counter_Interface001() {
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
        Over_The_Counter_Alfa_Mart_Button = new javax.swing.JButton();
        Over_The_Counter_7_Eleven_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Buy_load_Title.setFont(new java.awt.Font("sansserif", 1, 30)); // NOI18N
        Buy_load_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Buy_load_Title.setText("Over The Counter");

        Type_Payment_Title.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        Type_Payment_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Type_Payment_Title.setText("Type Of Payment:");

        Over_The_Counter_Alfa_Mart_Button.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        Over_The_Counter_Alfa_Mart_Button.setText("Alfa Mart");
        Over_The_Counter_Alfa_Mart_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Over_The_Counter_Alfa_Mart_ButtonActionPerformed(evt);
            }
        });

        Over_The_Counter_7_Eleven_Button.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        Over_The_Counter_7_Eleven_Button.setText("7-Eleven");
        Over_The_Counter_7_Eleven_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Over_The_Counter_7_Eleven_ButtonActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Type_Payment_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(Over_The_Counter_7_Eleven_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Over_The_Counter_Alfa_Mart_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(Over_The_Counter_Alfa_Mart_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Over_The_Counter_7_Eleven_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Over_The_Counter_Alfa_Mart_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Over_The_Counter_Alfa_Mart_ButtonActionPerformed
        // TODO add your handling code here:
        BuyLoad_AlfaMart_Interface00001 AlfaMart_interface = new BuyLoad_AlfaMart_Interface00001();
        AlfaMart_interface.setVisible(true);
    }//GEN-LAST:event_Over_The_Counter_Alfa_Mart_ButtonActionPerformed

    private void Over_The_Counter_7_Eleven_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Over_The_Counter_7_Eleven_ButtonActionPerformed
        // TODO add your handling code here:
        BuyLoad_7Eleven_Interface00001 SevenEleven_interface = new BuyLoad_7Eleven_Interface00001();
        SevenEleven_interface.setVisible(true);
    }//GEN-LAST:event_Over_The_Counter_7_Eleven_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BuyLoad_Over_The_Counter_Interface001.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyLoad_Over_The_Counter_Interface001.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyLoad_Over_The_Counter_Interface001.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyLoad_Over_The_Counter_Interface001.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyLoad_Over_The_Counter_Interface001().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buy_load_Title;
    private javax.swing.JButton Over_The_Counter_7_Eleven_Button;
    private javax.swing.JButton Over_The_Counter_Alfa_Mart_Button;
    private javax.swing.JLabel Type_Payment_Title;
    // End of variables declaration//GEN-END:variables
}