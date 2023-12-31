/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snap.care;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Atharva
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration_try
     */
    public Registration() {
        initComponents();
        this.setLocationRelativeTo(null);
        jTextField_Fullname.setBackground(new java.awt.Color(0,0,0,1));
        jTextField_Username.setBackground(new java.awt.Color(0,0,0,1));
        jTextField_Email.setBackground(new java.awt.Color(0,0,0,1));
        jPasswordField_1.setBackground(new java.awt.Color(0,0,0,1));
        jPasswordField_2.setBackground(new java.awt.Color(0,0,0,1));
        jRadioButton_Male.setBackground(new java.awt.Color(0,0,0,1));
        jRadioButton_Female.setBackground(new java.awt.Color(0,0,0,1));
        jDateChooser_BDATE.setBackground(new java.awt.Color(0,0,0,1));
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton_Male);
        bg.add(jRadioButton_Female);

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
        login = new javax.swing.JLabel();
        have_a_acc = new javax.swing.JLabel();
        jLabel_register = new javax.swing.JLabel();
        jTextField_Fullname = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jRadioButton_Female = new javax.swing.JRadioButton();
        jRadioButton_Male = new javax.swing.JRadioButton();
        jTextField_Username = new javax.swing.JTextField();
        jPasswordField_2 = new javax.swing.JPasswordField();
        jPasswordField_1 = new javax.swing.JPasswordField();
        jDateChooser_BDATE = new com.toedter.calendar.JDateChooser();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        login.setText("<html><u>Login!</u></html>");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, -1, -1));

        have_a_acc.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        have_a_acc.setForeground(new java.awt.Color(255, 255, 255));
        have_a_acc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        have_a_acc.setText("Have a account already?");
        jPanel1.add(have_a_acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, -1, -1));

        jLabel_register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Group 3.png"))); // NOI18N
        jLabel_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_registerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_registerMouseExited(evt);
            }
        });
        jPanel1.add(jLabel_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 290, 100));

        jTextField_Fullname.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jTextField_Fullname.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Fullname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Fullname.setBorder(null);
        jTextField_Fullname.setSelectedTextColor(new java.awt.Color(255, 0, 0));
        jTextField_Fullname.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextField_Fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 260, 30));

        jTextField_Email.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jTextField_Email.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Email.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Email.setBorder(null);
        jTextField_Email.setSelectedTextColor(new java.awt.Color(255, 0, 0));
        jTextField_Email.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextField_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 175, 260, 30));

        jRadioButton_Female.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jRadioButton_Female.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_Female.setText("Female");
        jRadioButton_Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_FemaleActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton_Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        jRadioButton_Male.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jRadioButton_Male.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_Male.setSelected(true);
        jRadioButton_Male.setText("Male");
        jRadioButton_Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_MaleActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton_Male, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        jTextField_Username.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jTextField_Username.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Username.setBorder(null);
        jTextField_Username.setSelectedTextColor(new java.awt.Color(255, 0, 0));
        jTextField_Username.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextField_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 260, 30));

        jPasswordField_2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jPasswordField_2.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField_2.setBorder(null);
        jPasswordField_2.setSelectedTextColor(new java.awt.Color(255, 0, 0));
        jPasswordField_2.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(jPasswordField_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 260, 30));

        jPasswordField_1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jPasswordField_1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField_1.setBorder(null);
        jPasswordField_1.setSelectedTextColor(new java.awt.Color(255, 0, 0));
        jPasswordField_1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(jPasswordField_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 260, 30));

        jDateChooser_BDATE.setForeground(new java.awt.Color(255, 255, 255));
        jDateChooser_BDATE.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(jDateChooser_BDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 150, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Registration Form cnfrm – 1.png"))); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton_MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_MaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_MaleActionPerformed

    private void jRadioButton_FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_FemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_FemaleActionPerformed

    private void jLabel_registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_registerMouseEntered
        jLabel_register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Group 4.png")));
    }//GEN-LAST:event_jLabel_registerMouseEntered

    private void jLabel_registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_registerMouseExited
        jLabel_register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Group 3.png")));
    }//GEN-LAST:event_jLabel_registerMouseExited

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
               
    }//GEN-LAST:event_loginMouseEntered

    private void jLabel_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_registerMouseClicked
          
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String bdate = dateformat.format(jDateChooser_BDATE.getDate());
        String fname = jTextField_Fullname.getText();
        String username = jTextField_Username.getText();
        String email = jTextField_Email.getText();
        String pass1 = String.valueOf(jPasswordField_1.getPassword());
        String pass2 = String.valueOf(jPasswordField_2.getPassword());
        String gender = "Male";
        
        if(jRadioButton_Female.isSelected()){
             gender = "Female";
         }
        
        if(verifyFields())
        {
            if(!checkUsername(username))
            {
                PreparedStatement ps;
                ResultSet rs;
                String registerUserQuery = "INSERT INTO `users_db`(`Full_name`, `username`, `Email`, `password`, `u_bdate`, `gender`) VALUES (?,?,?,?,?,?)";
                
                try {
                    ps = My_CNX.getConnection().prepareStatement(registerUserQuery);
                    ps.setString(1, fname);
                    ps.setString(2, username);
                    ps.setString(3, email);
                    ps.setString(4, pass1);
                    ps.setString(5, bdate);
                    ps.setString(6, gender);
                    if(ps.executeUpdate() != 0)
                    {
                             JOptionPane.showMessageDialog(null, "Your Account Has Been Created");
                         }
                    else
                    {
                             JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                         }
                    
                    
                    
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
        }
    }//GEN-LAST:event_jLabel_registerMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
                Login_form lf= new Login_form();
                lf.setVisible(true);
                lf.pack();
                lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
    }//GEN-LAST:event_loginMouseClicked

    public boolean verifyFields()
    {
        String fname = jTextField_Fullname.getText();
        String uname = jTextField_Username.getText();
        String email = jTextField_Email.getText();
        String pass1 = String.valueOf(jPasswordField_1.getPassword());
        String pass2 = String.valueOf(jPasswordField_2.getPassword());
        
        if(fname.trim().equals("") || uname.trim().equals("") || email.trim().equals("") || pass1.trim().equals("") || pass2.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "One or More Fields are Empty!", "Empty Fields", 2);
            return false;
        }
        
        else if(!pass1.equals(pass2))
        {
            JOptionPane.showMessageDialog(null, "Password Doesn't Match!","COnfirm Password!", 2);
            return false;
        }
        
        else{
                return true;
        }
        
    }
            
    
    public boolean checkUsername(String username){
        
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        
        String query = "SELECT * FROM `users_db` WHERE `username` = ?";
        
        try {
            
            st = My_CNX.getConnection().prepareStatement(query);
            st.setString(1, username);
            rs = st.executeQuery();
        
            if(rs.next())
            {
                username_exist = true;
                JOptionPane.showMessageDialog(null, "This Username is Already Taken, Choose Another One", "Username Failed", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return username_exist;
    }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Registration().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel have_a_acc;
    private com.toedter.calendar.JDateChooser jDateChooser_BDATE;
    private javax.swing.JLabel jLabel_register;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_1;
    private javax.swing.JPasswordField jPasswordField_2;
    private javax.swing.JRadioButton jRadioButton_Female;
    private javax.swing.JRadioButton jRadioButton_Male;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_Fullname;
    private javax.swing.JTextField jTextField_Username;
    private javax.swing.JLabel login;
    // End of variables declaration//GEN-END:variables
}
