/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package first.java;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author M M Salah
 */
public class NewTrainer extends javax.swing.JFrame {

    /**
     * Creates new form NewTrainer
     */
    public NewTrainer() {
        initComponents();
        setResizable(false);
        try {
            int Job_ID=1;
            String str1=String.valueOf(Job_ID);
            JOBID_.setText(str1);
            Connection con= CONO.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select max(Job_ID) from coaches");
            while(rs.next()){
               Job_ID =rs.getInt(1);
               Job_ID=Job_ID+1;
               String str =String.valueOf(Job_ID);
               JOBID_.setText(str);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JOBID_ = new javax.swing.JLabel();
        DW = new javax.swing.JComboBox<>();
        FI = new javax.swing.JComboBox<>();
        Tname = new javax.swing.JTextField();
        TPHONE = new javax.swing.JTextField();
        DOB = new javax.swing.JTextField();
        Gen = new javax.swing.JComboBox<>();
        Salary = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add New Trainer");

        jPanel1.setBackground(new java.awt.Color(152, 186, 231));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 30)); // NOI18N
        jLabel1.setText("Add New Trainer");

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("JobID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Facility");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("WorkDays");

        JOBID_.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        JOBID_.setText("0000");

        DW.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DW.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sat-Mon-Wed", "Sun-Tue-Thu", "All weak" }));

        FI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gym", "Football", "Swimming pool" }));

        Tname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Tname.setForeground(new java.awt.Color(153, 153, 153));
        Tname.setText("Name");
        Tname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TnameFocusLost(evt);
            }
        });

        TPHONE.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TPHONE.setForeground(new java.awt.Color(153, 153, 153));
        TPHONE.setText("PhoneNum");
        TPHONE.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TPHONEFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TPHONEFocusLost(evt);
            }
        });
        TPHONE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TPHONEKeyTyped(evt);
            }
        });

        DOB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        DOB.setForeground(new java.awt.Color(153, 153, 153));
        DOB.setText("00-00-0000");
        DOB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DOBFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DOBFocusLost(evt);
            }
        });

        Gen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Gen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        Salary.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Salary.setForeground(new java.awt.Color(153, 153, 153));
        Salary.setText("$$$$");
        Salary.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SalaryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SalaryFocusLost(evt);
            }
        });
        Salary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SalaryKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("PhoneNum");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("DOB");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Salary");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Gender");

        jButton2.setBackground(new java.awt.Color(114, 103, 203));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton2.setText("Add");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(114, 103, 203));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(114, 103, 203));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton4.setText("View Trainers");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(JOBID_, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(DW, 0, 123, Short.MAX_VALUE)
                                .addComponent(FI, 0, 1, Short.MAX_VALUE)
                                .addComponent(Tname))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(57, 57, 57)
                                .addComponent(jButton3)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Gen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Salary, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TPHONE)
                                .addComponent(DOB, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))
                        .addGap(122, 122, 122))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButton4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JOBID_)
                    .addComponent(TPHONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Tname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(DW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(0, 33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TnameFocusGained
        if (Tname.getText().equals("Name")) {
            Tname.setText("");
            Tname.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_TnameFocusGained

    private void TnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TnameFocusLost
       if (Tname.getText().equals("")) {
            Tname.setText("Name");
            Tname.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_TnameFocusLost

    private void TPHONEFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TPHONEFocusGained
        if (TPHONE.getText().equals("PhoneNum")) {
            TPHONE.setText("");
            TPHONE.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_TPHONEFocusGained

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
        new ViewTrainers().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Tname.setText("");
        TPHONE.setText("");
        DOB.setText("");
        Salary.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TPHONEFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TPHONEFocusLost
       if (TPHONE.getText().equals("")) {
            TPHONE.setText("PhoneNum");
            TPHONE.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_TPHONEFocusLost

    private void SalaryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SalaryFocusGained
    if (Salary.getText().equals("$$$$")) {
            Salary.setText("");
            Salary.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_SalaryFocusGained

    private void SalaryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SalaryFocusLost
        if (Salary.getText().equals("")) {
            Salary.setText("$$$$");
            Salary.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_SalaryFocusLost

    private void TPHONEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TPHONEKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_TPHONEKeyTyped

    private void SalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SalaryKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_SalaryKeyTyped

    private void DOBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DOBFocusGained
         if (DOB.getText().equals("00-00-0000")) {
            DOB.setText("");
            DOB.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_DOBFocusGained

    private void DOBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DOBFocusLost
        // TODO add your handling code here:
         if (DOB.getText().equals("")) {
            DOB.setText("00-00-0000");
            DOB.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_DOBFocusLost

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        String id=JOBID_.getText();
        String nam=Tname.getText();
        String fi=(String)FI.getSelectedItem();
        String dw=(String)DW.getSelectedItem();
        String pho=TPHONE.getText();
        String db=DOB.getText();
        String sal=Salary.getText();
        String Gen=(String)this.Gen.getSelectedItem();
        try {
            Connection con=CONO.getCon();
        PreparedStatement ps=con.prepareStatement("insert into coaches value (?,?,?,?,?,?,?,?)");
        ps.setString(1, nam);
        ps.setString(2, id);
        ps.setString(3, fi);
        ps.setString(4, dw);
        ps.setString(5, pho);
        ps.setString(6, db);
        ps.setString(7, sal);
        ps.setString(8, Gen);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Saved Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ChooseAction().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewTrainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewTrainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewTrainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewTrainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewTrainer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DOB;
    private javax.swing.JComboBox<String> DW;
    private javax.swing.JComboBox<String> FI;
    private javax.swing.JComboBox<String> Gen;
    private javax.swing.JLabel JOBID_;
    private javax.swing.JTextField Salary;
    private javax.swing.JTextField TPHONE;
    private javax.swing.JTextField Tname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
