/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminWorkArea;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.WorkQueue.AskforPatientDetailRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */

public class ViewPatientDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPatientDetailJPanel
     */
    
    private JPanel userProcessContainer; 
    private Patient patient;
    private Enterprise enterprise;
    private AskforPatientDetailRequest request;
    
    public ViewPatientDetailJPanel(JPanel userProcessContainer, Patient patient) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.patient = patient;
        populatePatientTable();
        
    }
    
    public ViewPatientDetailJPanel(JPanel upc, Patient p, AskforPatientDetailRequest afp, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = upc;
        this.patient = p;
        this.request = afp;
        this.enterprise = enterprise;
        populatePatientTable();
    }
    
    private void populatePatientTable() {
        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[8];
        row[0] = patient.getPatientId();
        row[1] = patient;
        row[2] = patient.getGender();
        row[3] = patient.getAge();
        row[4] = patient.getDob();
        row[5] = patient.getAddress().getCity();
        row[6] = patient.getPrimaryDoc();
        row[7] = patient.getPrimaryDocId();
        model.addRow(row); 
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sendToDocBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PatientID", "Patient Name", "Sex", "Age", "Date Of Birth", "Place", "Primary Doctor", "Primary DoctorID"
            }
        ));
        jScrollPane1.setViewportView(patientTable);

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backBtn.setText(">> Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("View Patient  Detail Panel ");

        sendToDocBtn.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        sendToDocBtn.setText("Send To Doctor");
        sendToDocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToDocBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backBtn)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(361, 361, 361)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addComponent(sendToDocBtn)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(92, 92, 92)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(sendToDocBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(104, 104, 104))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void sendToDocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToDocBtnActionPerformed
        request.setPatient(patient);
        int selectedRow = patientTable.getSelectedRow();
        Patient patient = (Patient) patientTable.getValueAt(selectedRow, 0);
        Employee empDoctor = null;
        for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
            empDoctor = org.getPersonDirectory().getEmployeeDirectory().searchEmp(patient.getPrimaryDocId());
            if(empDoctor!=null){
                break;
            }
        }
        empDoctor.getWorkQueue().getWorkRequestList().add(request);
        JOptionPane.showMessageDialog(null, "Request has been sent to " + empDoctor.getName());
    }//GEN-LAST:event_sendToDocBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientTable;
    private javax.swing.JButton sendToDocBtn;
    // End of variables declaration//GEN-END:variables
}