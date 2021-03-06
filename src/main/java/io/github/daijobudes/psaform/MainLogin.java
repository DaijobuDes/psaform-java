/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.daijobudes.psaform;

import io.github.daijobudes.psaform.adminGUI.AdminLogin;
import io.github.daijobudes.psaform.userGUI.UserLogin;

/**
 *
 * @author DaijobuDes
 */
public class MainLogin extends javax.swing.JFrame {

    /**
     * Creates new form MainLogin
     */

    SQLConnect dbcon = new SQLConnect();

    public MainLogin() {
        initComponents();
        try {
            dbcon.connectDB();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, "Error: {0} with stacktrace {1}", new Object[]{ex.getMessage(), ex.getStackTrace()});
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

        userLoginBtn = new javax.swing.JButton();
        adminLoginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        userLoginBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        userLoginBtn.setText("Login as User");
        userLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userLoginBtnActionPerformed(evt);
            }
        });

        adminLoginBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        adminLoginBtn.setText("Login as Admin");
        adminLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("User/Admin Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(adminLoginBtn)
                    .addComponent(userLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(291, 291, 291))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(126, 126, 126)
                .addComponent(userLoginBtn)
                .addGap(119, 119, 119)
                .addComponent(adminLoginBtn)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userLoginBtnActionPerformed
        // TODO add your handling code here:
        UserLogin ul = new UserLogin();
        ul.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userLoginBtnActionPerformed

    private void adminLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginBtnActionPerformed
        // TODO add your handling code here:
        AdminLogin al = new AdminLogin();
        al.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adminLoginBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminLoginBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton userLoginBtn;
    // End of variables declaration//GEN-END:variables
}
