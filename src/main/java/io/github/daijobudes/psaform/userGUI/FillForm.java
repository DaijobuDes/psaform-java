/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.daijobudes.psaform.userGUI;

import java.sql.ResultSet;

import io.github.daijobudes.psaform.SQLConnect;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Kate Aubrey Cellan
 */
public class FillForm extends javax.swing.JFrame {

    /**
     * Creates new form FillForm
     */

    SQLConnect dbcon = new SQLConnect();
    public FillForm() {
        initComponents();
        try {
            dbcon.connectDB();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(FillForm.class.getName()).log(java.util.logging.Level.SEVERE, "Error: {0} with stacktrace {1}", new Object[]{ex.getMessage(), ex.getStackTrace()});
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        middleNameText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        birthD = new javax.swing.JTextField();
        birthY = new javax.swing.JTextField();
        addressText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        birthM = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        countryText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lastFNameText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        middleFNameText = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        firstFNameText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lastMNameText = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        middleMNameText = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        firstMNameText = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        menuBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("OWNER'S PERSONAL INFORMATION");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel1.setRequestFocusEnabled(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Name");

        lastNameText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lastNameText.setToolTipText("Input last name.");
        lastNameText.setName(""); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setText("First Name");

        middleNameText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        middleNameText.setToolTipText("Input middle name.");
        middleNameText.setName(""); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setText("Last Name");

        firstNameText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        firstNameText.setToolTipText("Input first name.");
        firstNameText.setName(""); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setText("Middle Name");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Date of Birth");

        birthD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        birthD.setToolTipText("");
        birthD.setName(""); // NOI18N

        birthY.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        birthY.setToolTipText("");
        birthY.setName(""); // NOI18N

        addressText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addressText.setToolTipText("");
        addressText.setName(""); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel7.setText("DD");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel8.setText("MM");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel9.setText("YYYY");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Place of Birth");

        birthM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        birthM.setToolTipText("");
        birthM.setName(""); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Country");

        countryText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        countryText.setToolTipText("");
        countryText.setName(""); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Name of Father");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Name");

        lastFNameText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lastFNameText.setToolTipText("Input last name.");
        lastFNameText.setName(""); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel14.setText("First Name");

        middleFNameText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        middleFNameText.setToolTipText("Input middle name.");
        middleFNameText.setName(""); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel15.setText("Last Name");

        firstFNameText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        firstFNameText.setToolTipText("Input first name.");
        firstFNameText.setName(""); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel16.setText("Middle Name");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Maiden Name of Mother");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Name");

        lastMNameText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lastMNameText.setToolTipText("Input last name.");
        lastMNameText.setName(""); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel19.setText("First Name");

        middleMNameText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        middleMNameText.setToolTipText("Input middle name.");
        middleMNameText.setName(""); // NOI18N

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel20.setText("Last Name");

        firstMNameText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        firstMNameText.setToolTipText("Input first name.");
        firstMNameText.setName(""); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel21.setText("Middle Name");

        submitBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        clearBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clearBtn.setText("Clear all fields");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        menuBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuBtn.setText("Back To Menu");
        menuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(330, 330, 330))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel4)
                        .addGap(234, 234, 234)
                        .addComponent(jLabel3)
                        .addGap(220, 220, 220)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel8)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel7)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(birthM, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(birthD, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(birthY, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(42, 42, 42)
                                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(middleNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(countryText)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(jLabel15)
                                        .addGap(234, 234, 234)
                                        .addComponent(jLabel14)
                                        .addGap(220, 220, 220)
                                        .addComponent(jLabel16))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lastFNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(firstFNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(middleFNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel17)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lastMNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(firstMNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(middleMNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(jLabel20)
                                        .addGap(234, 234, 234)
                                        .addComponent(jLabel19)
                                        .addGap(220, 220, 220)
                                        .addComponent(jLabel21))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(submitBtn)
                                        .addGap(151, 151, 151)
                                        .addComponent(clearBtn)
                                        .addGap(155, 155, 155)
                                        .addComponent(menuBtn)))))))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middleNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(birthD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(countryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jLabel12)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastFNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstFNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middleFNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastMNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstMNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middleMNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn)
                    .addComponent(clearBtn)
                    .addComponent(menuBtn))
                .addGap(41, 41, 41))
        );

        lastNameText.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        ResultSet rs = dbcon.displayRecords();
        int count = 0;
        try {
            while (rs.next()) {
                count++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FillForm.class.getName()).log(Level.SEVERE, null, ex);
        }


        // Row 1 : Name
        String lastname = lastNameText.getText().toUpperCase();
        String firstname = firstNameText.getText().toUpperCase();
        String middlename = middleNameText.getText().toUpperCase();

        // Row 2 : Date of Birth
        int month = Integer.parseInt(birthM.getText());
        int day = Integer.parseInt(birthD.getText());
        int year = Integer.parseInt(birthY.getText());

        // Row 3 : Address and Country
        String address = addressText.getText().toUpperCase();
        String country = countryText.getText().toUpperCase();

        // Row 4 : Name of Father
        String lFName = lastFNameText.getText().toUpperCase();
        String fFName = firstFNameText.getText().toUpperCase();
        String mFName = middleFNameText.getText().toUpperCase();

        // Row 5 : Name of Mother
        String lMName = lastMNameText.getText().toUpperCase();
        String fMName = firstMNameText.getText().toUpperCase();
        String mMName = middleMNameText.getText().toUpperCase();

        boolean status = dbcon.insertFillFormRecord(count+1, lastname, firstname, middlename, month, day, year, address, country, lFName, fFName, mFName, lMName, fMName, mMName);

        if (status) {
            java.util.logging.Logger.getLogger(FillForm.class.getName()).log(java.util.logging.Level.INFO, "Record inserted successfully.");
        }
        else {
            java.util.logging.Logger.getLogger(FillForm.class.getName()).log(java.util.logging.Level.SEVERE, "Failed to insert data.");
        }


    }//GEN-LAST:event_submitBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        String t = "";
        // Row 1 : Name
        lastNameText.setText(t);
        firstNameText.setText(t);
        middleNameText.setText(t);

        // Row 2 : Date of Birth
        birthM.setText(t);
        birthD.setText(t);
        birthY.setText(t);

        // Row 3 : Address and Country
        addressText.setText(t);
        countryText.setText(t);

        // Row 4 : Name of Father
        lastFNameText.setText(t);
        firstFNameText.setText(t);
        middleFNameText.setText(t);

        // Row 5 : Name of Mother
        lastMNameText.setText(t);
        firstMNameText.setText(t);
        middleMNameText.setText(t);



    }//GEN-LAST:event_clearBtnActionPerformed

    private void menuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtnActionPerformed
        // TODO add your handling code here:
        MenuForm mf = new MenuForm();
        mf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuBtnActionPerformed

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
            java.util.logging.Logger.getLogger(FillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FillForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressText;
    private javax.swing.JTextField birthD;
    private javax.swing.JTextField birthM;
    private javax.swing.JTextField birthY;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField countryText;
    private javax.swing.JTextField firstFNameText;
    private javax.swing.JTextField firstMNameText;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastFNameText;
    private javax.swing.JTextField lastMNameText;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JButton menuBtn;
    private javax.swing.JTextField middleFNameText;
    private javax.swing.JTextField middleMNameText;
    private javax.swing.JTextField middleNameText;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}