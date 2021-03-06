/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    private UserAccount userAccount;
    
    public PatientWorkAreaJPanel(JPanel upc, Enterprise enterprise, EcoSystem ecoSystem, UserAccount ua) {
        initComponents();
        
        this.userProcessContainer = upc;
        this.ecoSystem = ecoSystem;
        this.enterprise = enterprise;
        this.userAccount = ua;
        
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
        medicalRecordBtn = new javax.swing.JButton();
        medicattionBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Patient Work Area");

        medicalRecordBtn.setBackground(new java.awt.Color(255, 153, 153));
        medicalRecordBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        medicalRecordBtn.setText("My Medical Record");
        medicalRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalRecordBtnActionPerformed(evt);
            }
        });

        medicattionBtn.setBackground(new java.awt.Color(255, 153, 153));
        medicattionBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        medicattionBtn.setText("Medication Response");
        medicattionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicattionBtnActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/patient.jpe"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(medicattionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(medicalRecordBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(447, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(medicalRecordBtn)
                        .addGap(73, 73, 73)
                        .addComponent(medicattionBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(522, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void medicalRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalRecordBtnActionPerformed
        MedicalRecordJPanel panel = new MedicalRecordJPanel(userProcessContainer, ecoSystem,userAccount, ecoSystem, enterprise);
        userProcessContainer.add("MedicalRecordJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_medicalRecordBtnActionPerformed

    private void medicattionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicattionBtnActionPerformed
        MedicationResponseJPanel panel = new MedicationResponseJPanel(userProcessContainer, userAccount, enterprise, ecoSystem);
        userProcessContainer.add("MedicationResponseJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_medicattionBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton medicalRecordBtn;
    private javax.swing.JButton medicattionBtn;
    // End of variables declaration//GEN-END:variables
}
