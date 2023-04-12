/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first.java;

/**
 *
 * @author M M Salah
 */
public class ChooseAction extends javax.swing.JFrame {

    /**
     * Creates new form ChooseAction
     */
    public ChooseAction() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Action = new javax.swing.JPanel();
        MemberB = new javax.swing.JButton();
        PaymentB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logOut = new javax.swing.JButton();
        TrainersB = new javax.swing.JButton();
        AdminsB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Choose an Action");

        Action.setBackground(new java.awt.Color(152, 186, 231));
        Action.setToolTipText("");

        MemberB.setBackground(new java.awt.Color(114, 103, 203));
        MemberB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MemberB.setIcon(new javax.swing.ImageIcon("C:\\Users\\m0ham\\Downloads\\icons8-member-50.png")); // NOI18N
        MemberB.setText("New Member");
        MemberB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MemberBMousePressed(evt);
            }
        });
        MemberB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberBActionPerformed(evt);
            }
        });

        PaymentB.setBackground(new java.awt.Color(114, 103, 203));
        PaymentB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PaymentB.setIcon(new javax.swing.ImageIcon("C:\\Users\\m0ham\\Downloads\\icons8-payment-check-24.png")); // NOI18N
        PaymentB.setText("Payment");
        PaymentB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentBActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(110, 60, 188));
        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 40)); // NOI18N
        jLabel1.setText("Please Choose an action :");

        logOut.setBackground(new java.awt.Color(255, 0, 0));
        logOut.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        logOut.setIcon(new javax.swing.ImageIcon("C:\\Users\\m0ham\\Downloads\\icons8-logout-16.png")); // NOI18N
        logOut.setText("LogOut");
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logOutMousePressed(evt);
            }
        });
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        TrainersB.setBackground(new java.awt.Color(114, 103, 203));
        TrainersB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TrainersB.setIcon(new javax.swing.ImageIcon("C:\\Users\\m0ham\\Downloads\\icons8-coach-30.png")); // NOI18N
        TrainersB.setText("New Trainer");
        TrainersB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrainersBActionPerformed(evt);
            }
        });

        AdminsB.setBackground(new java.awt.Color(114, 103, 203));
        AdminsB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AdminsB.setIcon(new javax.swing.ImageIcon("C:\\Users\\m0ham\\Downloads\\icons8-administrator-64.png")); // NOI18N
        AdminsB.setText("New Admin");
        AdminsB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminsBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ActionLayout = new javax.swing.GroupLayout(Action);
        Action.setLayout(ActionLayout);
        ActionLayout.setHorizontalGroup(
            ActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActionLayout.createSequentialGroup()
                .addGroup(ActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ActionLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 110, Short.MAX_VALUE))
                    .addGroup(ActionLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ActionLayout.createSequentialGroup()
                                .addGroup(ActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(MemberB, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AdminsB))
                                .addGap(119, 119, 119)
                                .addGroup(ActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PaymentB, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TrainersB))
                                .addGap(144, 144, 144))
                            .addComponent(logOut))))
                .addContainerGap())
        );
        ActionLayout.setVerticalGroup(
            ActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActionLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(ActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminsB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TrainersB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(ActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MemberB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaymentB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Action, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Action, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PaymentBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentBActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new APayment().setVisible(true);
    }//GEN-LAST:event_PaymentBActionPerformed

    private void MemberBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberBActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new NewMember().setVisible(true);
    }//GEN-LAST:event_MemberBActionPerformed

    private void MemberBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MemberBMousePressed
        // TODO add your handling code here:
        new NewMember().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MemberBMousePressed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logOutActionPerformed

    private void logOutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMousePressed
        // TODO add your handling code here:
        new City_Club().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutMousePressed

    private void TrainersBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrainersBActionPerformed
        this.dispose();
        new NewTrainer().setVisible(true);
    }//GEN-LAST:event_TrainersBActionPerformed

    private void AdminsBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminsBActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new NewAdmin().setVisible(true);
    }//GEN-LAST:event_AdminsBActionPerformed

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
            java.util.logging.Logger.getLogger(ChooseAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseAction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Action;
    private javax.swing.JButton AdminsB;
    private javax.swing.JButton MemberB;
    private javax.swing.JButton PaymentB;
    private javax.swing.JButton TrainersB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logOut;
    // End of variables declaration//GEN-END:variables
}