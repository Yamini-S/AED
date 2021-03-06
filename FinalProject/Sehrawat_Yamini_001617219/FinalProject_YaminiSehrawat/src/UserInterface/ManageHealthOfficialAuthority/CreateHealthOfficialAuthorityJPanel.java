/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageHealthOfficialAuthority;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.HealthOfficialAuthority.HOAuthority;
import Business.Role.HOAuthorityRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class CreateHealthOfficialAuthorityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateHealthOfficialAuthorityJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    
    public CreateHealthOfficialAuthorityJPanel(JPanel upc, EcoSystem e) {
        initComponents();
        
        this.userProcessContainer = upc;
        this.ecoSystem = e;
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
        emailTxt = new javax.swing.JTextField();
        authorityNamejLabel = new javax.swing.JLabel();
        authNameTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        usernamejLabel = new javax.swing.JLabel();
        passwordjLabel = new javax.swing.JLabel();
        cityTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        backBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Create Health Official Authority");

        emailTxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        authorityNamejLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        authorityNamejLabel.setText("Authority Name : ");

        authNameTxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText(" ---------- Login Details ----------");

        usernamejLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        usernamejLabel.setText("Username");

        passwordjLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        passwordjLabel.setText("Password");

        cityTxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Address : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Email :");

        userNameTxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backBtn.setText(">> Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        createBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(authorityNamejLabel)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(authNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(usernamejLabel)
                        .addGap(77, 77, 77)
                        .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(passwordjLabel)
                        .addGap(52, 52, 52)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(564, 564, 564)
                        .addComponent(createBtn)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(authorityNamejLabel)
                    .addComponent(authNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(jLabel5)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernamejLabel)
                    .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordjLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addComponent(createBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cityTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTxtActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        String authName = authNameTxt.getText().trim();
        String userName = userNameTxt.getText().trim();
        String password = String.valueOf(passwordField.getPassword());
        String city = cityTxt.getText().trim();
        String emailId = emailTxt.getText().trim();
        String state = "MA";
        String street1 = "1 Symphony Road";
        String zip = "02115";
        
        /*String emailValidFormat = "\\^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}\\$";
        
        if(!emailId.matches(emailValidFormat)){
            JOptionPane.showMessageDialog(null, "Not a valid emial format, please enter correct email address!");
            return;
        }*/
        
        if (authName.equals("") || authName.equals(null) || userName.equals("") || userName.equals(null) || password.equals("") 
                || password.equals(null)|| city.equals("") || city.equals(null) || emailId.equals("") || emailId.equals(null)) {
            JOptionPane.showMessageDialog(null, "Some of the values missing, Please fill all the details!");
            return;
        }
        String userNameCheck = ecoSystem.getUserAccountCheckDirectory().validUserAccountCheck(userName);
        if (userNameCheck == (null)) {
            JOptionPane.showMessageDialog(null, "Username already exists, please enter another username.");
            return;
        }
        
        HOAuthority authority = ecoSystem.addAuthority(authName, emailId, city);
        Employee employee = authority.getPersonDirectory().getEmployeeDirectory().createEmployee(authName, street1, city, state, zip);
        UserAccount userAccount = authority.getUserAccountDirectory().createUserAccount(userName, password, employee, new HOAuthorityRole());
        ecoSystem.getUserAccountCheckDirectory().addUserAccountName(userName);
        JOptionPane.showMessageDialog(null, "Health Official Authority created successfully!");
    }//GEN-LAST:event_createBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField authNameTxt;
    private javax.swing.JLabel authorityNamejLabel;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField cityTxt;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordjLabel;
    private javax.swing.JTextField userNameTxt;
    private javax.swing.JLabel usernamejLabel;
    // End of variables declaration//GEN-END:variables
}
