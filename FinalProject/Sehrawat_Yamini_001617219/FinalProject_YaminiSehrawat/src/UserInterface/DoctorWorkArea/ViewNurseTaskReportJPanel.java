/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorWorkArea;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorToNurseRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class ViewNurseTaskReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewNurseTaskReportJPanel
     */
    
    private JPanel userProcessContainer;
    private Patient patient;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Date date;
    public ViewNurseTaskReportJPanel(JPanel upc, Patient p, UserAccount ua, Enterprise ep) {
        initComponents();
        
        this.userProcessContainer = upc;
        this.patient = p;
        this.userAccount = ua;
        this.enterprise = ep;
        populateNurseTaskReportTable();
    }

    private void populateNurseTaskReportTable(){
        DefaultTableModel model = (DefaultTableModel) nurseTaskTable.getModel();
        model.setRowCount(0);
        
        for (WorkRequest workRequest : patient.getWorkQueue().getWorkRequestList()) {
            if (workRequest instanceof DoctorToNurseRequest) {
                DoctorToNurseRequest nurseRequest = (DoctorToNurseRequest) workRequest;
                Object[] row = new Object[6];
                row[0] = nurseRequest.getMessageDoc();
                row[1] = nurseRequest.getPatient();
                row[2] = nurseRequest.getSender().getPerson().getName();
                row[3] = nurseRequest.getReceiver() == null ? ("N/A") : nurseRequest.getReceiver().getPerson().getName();
                row[4] = nurseRequest;
                row[5] = nurseRequest.getDate();
                model.addRow(row);
            }
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
        nurseTaskTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        viewDetailBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        msgTextArea = new javax.swing.JTextArea();
        sendRequestBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Nurse Task Report Panel");

        nurseTaskTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Patient Name", "Primary Doctor", "Receiver", "Status", "Timestamp"
            }
        ));
        jScrollPane1.setViewportView(nurseTaskTable);

        backBtn.setBackground(new java.awt.Color(255, 153, 153));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backBtn.setText(">> Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        viewDetailBtn.setBackground(new java.awt.Color(255, 153, 153));
        viewDetailBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        viewDetailBtn.setText("View Detail ");
        viewDetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Message :");

        msgTextArea.setColumns(20);
        msgTextArea.setRows(5);
        jScrollPane2.setViewportView(msgTextArea);

        sendRequestBtn.setBackground(new java.awt.Color(255, 153, 153));
        sendRequestBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sendRequestBtn.setText("Send Request");
        sendRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendRequestBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(396, 396, 396)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(viewDetailBtn)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(backBtn)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sendRequestBtn)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewDetailBtn)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(sendRequestBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(425, 425, 425))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendRequestBtnActionPerformed
        String msg = msgTextArea.getText().trim();
        if((msg.equals(""))||(msg.equals(null))){
            JOptionPane.showMessageDialog(null, "Please enter the message!");
            return;
        }
        
        DoctorToNurseRequest nurseRequest = new DoctorToNurseRequest();
        date = new Date();
        nurseRequest.setPatient(patient);
        nurseRequest.setSender(userAccount);
        nurseRequest.setStatus("sent");
        nurseRequest.setMessageDoc(msg);
        nurseRequest.setDate(date);
        
        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
            if(Organization.Type.Nurse.getValue() == "Nurse Organization"){
                organization.getWorkQueue().getWorkRequestList().add(nurseRequest);
            }
        }
        patient.getWorkQueue().getWorkRequestList().add(nurseRequest);
        populateNurseTaskReportTable();
        
    }//GEN-LAST:event_sendRequestBtnActionPerformed

    private void viewDetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailBtnActionPerformed
        int selectedRow = nurseTaskTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row first to proceed!");
            return;
        }
        DoctorToNurseRequest request = (DoctorToNurseRequest) nurseTaskTable.getValueAt(selectedRow, 4);
        ViewNurseReportJPanel panel = new ViewNurseReportJPanel(userProcessContainer, request);
        userProcessContainer.add("ViewNurseReportJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewDetailBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea msgTextArea;
    private javax.swing.JTable nurseTaskTable;
    private javax.swing.JButton sendRequestBtn;
    private javax.swing.JButton viewDetailBtn;
    // End of variables declaration//GEN-END:variables
}
