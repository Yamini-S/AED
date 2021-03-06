/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    
    public DoctorWorkAreaJPanel(JPanel upc, EcoSystem ecoSystem, UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = upc;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
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
        patientCheckupBtn = new javax.swing.JButton();
        referredPatientBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        drugResponseBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Doctor Work Area Panel");

        patientCheckupBtn.setBackground(new java.awt.Color(255, 153, 153));
        patientCheckupBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        patientCheckupBtn.setText("Patient Checkup ");
        patientCheckupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientCheckupBtnActionPerformed(evt);
            }
        });

        referredPatientBtn.setBackground(new java.awt.Color(255, 153, 153));
        referredPatientBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        referredPatientBtn.setText("Referred Patient Request");
        referredPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referredPatientBtnActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/doctor.jpe"))); // NOI18N

        drugResponseBtn.setBackground(new java.awt.Color(255, 153, 153));
        drugResponseBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        drugResponseBtn.setText("Medication Feedback");
        drugResponseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugResponseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel3)
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(drugResponseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patientCheckupBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(referredPatientBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE))))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(patientCheckupBtn)
                        .addGap(74, 74, 74)
                        .addComponent(referredPatientBtn)))
                .addGap(39, 39, 39)
                .addComponent(drugResponseBtn)
                .addContainerGap(543, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
/**/
    private void patientCheckupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientCheckupBtnActionPerformed
        PatientCheckUpJPanel panel = new PatientCheckUpJPanel(userProcessContainer, userAccount, organization, enterprise, ecoSystem);
        userProcessContainer.add("PatientCheckUpJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_patientCheckupBtnActionPerformed
/**/
    private void referredPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referredPatientBtnActionPerformed
        ReferredPatientRequestJPanel panel = new ReferredPatientRequestJPanel(userProcessContainer, userAccount, enterprise, ecoSystem);
        userProcessContainer.add("ReferredPatientRequestJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_referredPatientBtnActionPerformed

    private void drugResponseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugResponseBtnActionPerformed
        MedicationFeedbackJPanel panel = new MedicationFeedbackJPanel(userProcessContainer,userAccount, enterprise, ecoSystem);
        userProcessContainer.add("MedicationFeedbackJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_drugResponseBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton drugResponseBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton patientCheckupBtn;
    private javax.swing.JButton referredPatientBtn;
    // End of variables declaration//GEN-END:variables
}
