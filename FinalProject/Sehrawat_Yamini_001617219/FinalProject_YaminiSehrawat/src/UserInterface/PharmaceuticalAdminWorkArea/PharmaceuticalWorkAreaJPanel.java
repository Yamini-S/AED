/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PharmaceuticalAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import UserInterface.AdminWorkArea.ManageEmployeeJPanel;
import UserInterface.AdminWorkArea.ManageUserAccountJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class PharmaceuticalWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmaceuticalAdminWorkArea
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private EcoSystem ecoSystem;
    
    public PharmaceuticalWorkAreaJPanel(JPanel upc, Enterprise ep, EcoSystem es) {
        initComponents();
        
        this.userProcessContainer = upc;
        this.enterprise = ep;
        this.ecoSystem = es;
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
        manageOrgBtn = new javax.swing.JButton();
        manageEmpBtn = new javax.swing.JButton();
        manageUserAccBtn = new javax.swing.JButton();
        manageMedBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Pharmaceutical Work Area");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/phar.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        manageOrgBtn.setBackground(new java.awt.Color(255, 204, 204));
        manageOrgBtn.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        manageOrgBtn.setText("Manage Organization");
        manageOrgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrgBtnActionPerformed(evt);
            }
        });

        manageEmpBtn.setBackground(new java.awt.Color(255, 204, 204));
        manageEmpBtn.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        manageEmpBtn.setText("Manage Employees");
        manageEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmpBtnActionPerformed(evt);
            }
        });

        manageUserAccBtn.setBackground(new java.awt.Color(255, 204, 204));
        manageUserAccBtn.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        manageUserAccBtn.setText("Manage UserAcount");
        manageUserAccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserAccBtnActionPerformed(evt);
            }
        });

        manageMedBtn.setBackground(new java.awt.Color(255, 204, 204));
        manageMedBtn.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        manageMedBtn.setText("Manage Medicines");
        manageMedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMedBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(manageOrgBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageEmpBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageUserAccBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageMedBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(manageOrgBtn)
                        .addGap(70, 70, 70)
                        .addComponent(manageEmpBtn)
                        .addGap(72, 72, 72)
                        .addComponent(manageUserAccBtn)
                        .addGap(84, 84, 84)
                        .addComponent(manageMedBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)))
                .addContainerGap(266, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrgBtnActionPerformed
        ManagePharOrganizationJPanel panel = new ManagePharOrganizationJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManagePharOrganizationJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrgBtnActionPerformed

    private void manageEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmpBtnActionPerformed
        ManageEmployeeJPanel panel = new ManageEmployeeJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageEmployeeJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmpBtnActionPerformed

    private void manageUserAccBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserAccBtnActionPerformed
        ManageUserAccountJPanel panel = new ManageUserAccountJPanel(userProcessContainer, enterprise.getOrganizationDirectory(), ecoSystem);
        userProcessContainer.add("ManageUserAccountJPanel", panel);
        CardLayout layout =  (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageUserAccBtnActionPerformed

    private void manageMedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMedBtnActionPerformed
        ManageMedicineJPanel panel = new ManageMedicineJPanel(userProcessContainer, enterprise, ecoSystem);
        userProcessContainer.add("ManageMedicineJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageMedBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageEmpBtn;
    private javax.swing.JButton manageMedBtn;
    private javax.swing.JButton manageOrgBtn;
    private javax.swing.JButton manageUserAccBtn;
    // End of variables declaration//GEN-END:variables
}
