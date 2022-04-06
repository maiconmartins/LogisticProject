/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logisticproject;

import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author user
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {

        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel_Transparent_ = new javax.swing.JPanel();
        jButton_Submit_3 = new javax.swing.JButton();
        user_field = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton_Reset_3 = new javax.swing.JButton();
        password_field = new javax.swing.JPasswordField();
        jLabel_Register_3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel1.setText("                                Logistic Project");

        jPanel_Transparent_.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton_Submit_3.setText("Submit");
        jButton_Submit_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Submit_ActionPerformed(evt);
            }
        });

        jLabel8.setText("User");

        jLabel9.setText("Password");

        jButton_Reset_3.setText("Reset");

        jLabel_Register_3.setText("Click here to Register");
        jLabel_Register_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Register_MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_Transparent_Layout = new javax.swing.GroupLayout(jPanel_Transparent_);
        jPanel_Transparent_.setLayout(jPanel_Transparent_Layout);
        jPanel_Transparent_Layout.setHorizontalGroup(
            jPanel_Transparent_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Transparent_Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel_Transparent_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(60, 60, 60)
                .addGroup(jPanel_Transparent_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel_Transparent_Layout.createSequentialGroup()
                        .addComponent(jButton_Submit_3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jButton_Reset_3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(user_field, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password_field, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Transparent_Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Register_3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        jPanel_Transparent_Layout.setVerticalGroup(
            jPanel_Transparent_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Transparent_Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel_Transparent_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel_Transparent_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel_Transparent_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Submit_3)
                    .addComponent(jButton_Reset_3))
                .addGap(41, 41, 41)
                .addComponent(jLabel_Register_3)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_Transparent_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_Transparent_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_Register_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Register_MouseClicked
        //   RegisterForm reg = new RegisterForm();
        //   reg.setVisible(true);


    }//GEN-LAST:event_jLabel_Register_MouseClicked

    private void jButton_Submit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Submit_ActionPerformed

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbServer = "jdbc:mysql://localhost:3306/logindb";
            String username = "root";
            String password = "";

            String sql = "Select * from logindatabase where username=? and password=?";
            java.sql.Connection conn = DriverManager.getConnection(dbServer, username, password);

            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, user_field.getText());
            pst.setString(2, password_field.getText());

            pst.executeQuery();
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                view.DashBoard dash = new view.DashBoard();

                JOptionPane.showMessageDialog(null, "Username and Password Matched");
                dash.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Username and Password dont match");
                user_field_.setText("");
                password_field_.setText("");

            }
            conn.close();

        } catch (Exception e) {

          //  JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton_Submit_ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Reset_;
    private javax.swing.JButton jButton_Reset_1;
    private javax.swing.JButton jButton_Reset_2;
    private javax.swing.JButton jButton_Reset_3;
    private javax.swing.JButton jButton_Submit_;
    private javax.swing.JButton jButton_Submit_1;
    private javax.swing.JButton jButton_Submit_2;
    private javax.swing.JButton jButton_Submit_3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Register_;
    private javax.swing.JLabel jLabel_Register_1;
    private javax.swing.JLabel jLabel_Register_2;
    private javax.swing.JLabel jLabel_Register_3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_Transparent_;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JPasswordField password_field_;
    private javax.swing.JPasswordField password_field_1;
    private javax.swing.JPasswordField password_field_2;
    private javax.swing.JTextField user_field;
    private javax.swing.JTextField user_field_;
    private javax.swing.JTextField user_field_1;
    private javax.swing.JTextField user_field_2;
    // End of variables declaration//GEN-END:variables
}
