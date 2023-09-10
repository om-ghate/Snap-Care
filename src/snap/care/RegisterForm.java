/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snap.care;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author FALAK GALA
 */
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void reset()
    {
        register_name.setText("");
        register_gender_female.setSelected(false);
        register_gender_male.setSelected(false);
        register_gender_other.setSelected(false);
        register_degree.setSelectedIndex(0);
        register_specializedin.setSelectedIndex(0);
        register_noofpatientscured.setText("");
        register_phoneno.setText("");
        register_hospitaladd.setText("");
        register_name.grabFocus();
    }        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Reg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        register_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        register_noofpatientscured = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        register_phoneno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        register_hospitaladd = new javax.swing.JTextField();
        register_degree = new javax.swing.JComboBox<>();
        register_gender_other = new javax.swing.JRadioButton();
        register_gender_female = new javax.swing.JRadioButton();
        register_gender_male = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        register_submit = new javax.swing.JButton();
        register_reset = new javax.swing.JButton();
        register_close = new javax.swing.JButton();
        register_specializedin = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register as a Doctor");

        Reg.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        Reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/registration_40px.png"))); // NOI18N
        Reg.setText("   Registration Form");

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/name_50px.png"))); // NOI18N
        jLabel1.setText("Name :");

        register_name.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/graduation_cap_52px.png"))); // NOI18N
        jLabel3.setText("Degree:  ");

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/being_sick_40px.png"))); // NOI18N
        jLabel4.setText("Specialized In :");

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hospital_48px.png"))); // NOI18N
        jLabel5.setText("NO. Patients Cured :");

        register_noofpatientscured.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        register_noofpatientscured.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                register_noofpatientscuredKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phone_50px.png"))); // NOI18N
        jLabel6.setText("Phone NO.");

        register_phoneno.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        register_phoneno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                register_phonenoKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doctors_bag_50px.png"))); // NOI18N
        jLabel7.setText("Hospital Address :");

        register_hospitaladd.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N

        register_degree.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        register_degree.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Degree", "MBBS- Bachelor Of Medicine,Bachelor Of Surgery", "BDS  -  Bachelor Of Dental Surgery", "BAMS- Bachelor Of Ayurvedic Medicine And Surgery", "BHMS- Bachelor Of Homeopathy Medicine And Surgery" }));

        register_gender_other.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        register_gender_other.setText("Other");
        register_gender_other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_gender_otherActionPerformed(evt);
            }
        });

        register_gender_female.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        register_gender_female.setText("Female");
        register_gender_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_gender_femaleActionPerformed(evt);
            }
        });

        register_gender_male.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        register_gender_male.setText("Male");
        register_gender_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_gender_maleActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gender_48px.png"))); // NOI18N
        jLabel8.setText("Gender:");

        register_submit.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        register_submit.setText("Submit");
        register_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_submitActionPerformed(evt);
            }
        });

        register_reset.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        register_reset.setText("Reset");
        register_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_resetActionPerformed(evt);
            }
        });

        register_close.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        register_close.setText("Close");
        register_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_closeActionPerformed(evt);
            }
        });

        register_specializedin.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        register_specializedin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select A Category--", "Heart", "Skin", "general_Checkup", "Diabetes", "orthopaedist", "Cough & Cold" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(register_noofpatientscured))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(register_phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(register_degree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(register_specializedin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(register_gender_male)
                                            .addGap(33, 33, 33)
                                            .addComponent(register_gender_female)
                                            .addGap(33, 33, 33)
                                            .addComponent(register_gender_other)
                                            .addGap(126, 126, 126))
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(register_name, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE)))))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(register_hospitaladd, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(register_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(register_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(register_close, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(Reg, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Reg, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register_name, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register_gender_other)
                    .addComponent(register_gender_female)
                    .addComponent(register_gender_male)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register_degree))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(register_specializedin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register_noofpatientscured, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register_phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register_hospitaladd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register_close, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void register_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_closeActionPerformed
        dispose();
    }//GEN-LAST:event_register_closeActionPerformed

    private void register_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_resetActionPerformed
       reset();
    }//GEN-LAST:event_register_resetActionPerformed

    private void register_gender_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_gender_femaleActionPerformed
        if(register_gender_female.isSelected())
        {
            register_gender_male.setSelected(false);
            register_gender_other.setSelected(false);
        }
    }//GEN-LAST:event_register_gender_femaleActionPerformed

    private void register_gender_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_gender_maleActionPerformed
        if(register_gender_male.isSelected())
        {
            register_gender_female.setSelected(false);
            register_gender_other.setSelected(false);
        }
    }//GEN-LAST:event_register_gender_maleActionPerformed

    private void register_gender_otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_gender_otherActionPerformed
     if(register_gender_other.isSelected())
        {
            register_gender_female.setSelected(false);
            register_gender_male.setSelected(false);
        }
    }//GEN-LAST:event_register_gender_otherActionPerformed

    private void register_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_submitActionPerformed
        String fname = register_name.getText();
        String edudegree = (String)register_degree.getSelectedItem();
        String specin = (String)register_specializedin.getSelectedItem();
        String curedno = register_noofpatientscured.getText();
        String phnno = register_phoneno.getText();
        String hosp = register_hospitaladd.getText();
        String gender = "Male";        
        
        if(register_gender_female.isSelected()){
             gender = "Female";
         }
        
        if(register_gender_other.isSelected()){
             gender = "Other";
         }
        
        PreparedStatement ps;
        ResultSet rs;
        String registerDoctorQuery = "INSERT INTO `doctors`(`Full_name`, `gender`, `degree`, `sp_in`, `patients_cured`, `phn_no`, `hospital_address`) VALUES (?,?,?,?,?,?,?)";
        
        try {
            ps = My_CNX_2.getConnection().prepareStatement(registerDoctorQuery);
            
            ps.setString(1, fname);
            ps.setString(2, gender);
            ps.setString(3, edudegree);
            ps.setString(4, specin);
            ps.setString(5, curedno);
            ps.setString(6, phnno);
            ps.setString(7, hosp);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Registered Successfully! Waiting for Admins approval");                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "error! Check your info!");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_register_submitActionPerformed

    private void register_phonenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_register_phonenoKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
           evt.consume();
       }
    }//GEN-LAST:event_register_phonenoKeyTyped

    private void register_noofpatientscuredKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_register_noofpatientscuredKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
           evt.consume();
       }
    }//GEN-LAST:event_register_noofpatientscuredKeyTyped

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Reg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton register_close;
    private javax.swing.JComboBox<String> register_degree;
    private javax.swing.JRadioButton register_gender_female;
    private javax.swing.JRadioButton register_gender_male;
    private javax.swing.JRadioButton register_gender_other;
    private javax.swing.JTextField register_hospitaladd;
    private javax.swing.JTextField register_name;
    private javax.swing.JTextField register_noofpatientscured;
    private javax.swing.JTextField register_phoneno;
    private javax.swing.JButton register_reset;
    private javax.swing.JComboBox<String> register_specializedin;
    private javax.swing.JButton register_submit;
    // End of variables declaration//GEN-END:variables
}