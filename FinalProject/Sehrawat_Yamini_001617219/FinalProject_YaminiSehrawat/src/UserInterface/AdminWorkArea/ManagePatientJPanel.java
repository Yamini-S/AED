/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Patient;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AskforPatientDetailRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class ManagePatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePatientJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    private Patient patient;
    private AskforPatientDetailRequest request;
    
    public ManagePatientJPanel(JPanel userProcessContainer,EcoSystem ecoSystem,Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.enterprise = enterprise;
        populatePatientTable();
    }

    private void populatePatientTable(){
        DefaultTableModel model = (DefaultTableModel)patientTable.getModel();
        model.setRowCount(0);
        
        for(Patient patient:enterprise.getPersonDirectory().getPatientDirectory().getPatientList()){
            Object row[] = new Object[8];
            row[0] = patient.getPatientId();
            row[1] = patient;
            row[2] = patient.getGender();
            row[3] = patient.getAge();
            row[4] = patient.getDob();
            row[5] = patient.getAddress().getCity();
            for(UserAccount userAccount:enterprise.getUserAccountDirectory().getUserAccountList()){
                if (userAccount.getPerson().getName().equals(patient.getName())) {
                row[6] = userAccount.getUserName();
                row[7] = userAccount.getPassword();
               }
            }
           model.addRow(row);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Manage Patient Panel");

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PatientID", "Patient Name", "Gender", "Age", "Date Of Birth", "Place", "User Name", "Password"
            }
        ));
        jScrollPane1.setViewportView(patientTable);

        updateBtn.setBackground(new java.awt.Color(255, 153, 153));
        updateBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 153, 153));
        deleteBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        createBtn.setBackground(new java.awt.Color(255, 153, 153));
        createBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        createBtn.setText("Create Patient");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(255, 153, 153));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backBtn.setText(">> Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        refreshBtn.setBackground(new java.awt.Color(255, 153, 153));
        refreshBtn.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(refreshBtn)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(471, 471, 471)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(updateBtn)
                            .addGap(56, 56, 56)
                            .addComponent(deleteBtn)
                            .addGap(71, 71, 71)
                            .addComponent(createBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(refreshBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(updateBtn)
                    .addComponent(createBtn))
                .addGap(288, 288, 288)
                .addComponent(backBtn)
                .addGap(73, 73, 73))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        CreatePatientJPanel panel = new CreatePatientJPanel(userProcessContainer, ecoSystem, enterprise);
        userProcessContainer.add("CreatePatientJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        int selectedRow = patientTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first!");
            return;
        }
        Patient patient = (Patient) patientTable.getValueAt(selectedRow, 1);

        UpdatePatientJPanel panel = new UpdatePatientJPanel(userProcessContainer, patient);
        userProcessContainer.add("UpdatePatientJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectedRow = patientTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row first!");
        }
        Patient patient = (Patient) patientTable.getValueAt(selectedRow,1);
        
        int flag= JOptionPane.showConfirmDialog(this, "Are you sure want to remove patient?","Warning", JOptionPane.YES_NO_OPTION);
        
        if(flag==0){
            enterprise.getPersonDirectory().getPatientDirectory().getPatientList().remove(patient);
            ecoSystem.getPersonDirectory().getPatientDirectory().getPatientList().remove(patient);
            JOptionPane.showMessageDialog(null, "Record deleted successfully!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Record not deleted!");
        }
        populatePatientTable();
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        populatePatientTable();
    }//GEN-LAST:event_refreshBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientTable;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
