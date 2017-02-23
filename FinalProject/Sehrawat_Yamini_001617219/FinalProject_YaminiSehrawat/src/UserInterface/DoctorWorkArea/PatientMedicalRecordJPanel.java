/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.HealthIssues.Disease;
import Business.Medication.Drug;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.PatientHealthRecord.PatientVitalSign;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SalesWorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class PatientMedicalRecordJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientMedicalRecordJPanel
     */
    
    private JPanel userProcessContainer;
    private Patient patient;
    private Organization organization;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private EcoSystem ecoSystem;
    private Date checkupDate;
    private Network network;
    
    public PatientMedicalRecordJPanel(JPanel upc, Patient p, Organization org, UserAccount ua, Enterprise ep, EcoSystem es) {
        initComponents();
        
        this.userProcessContainer = upc;
        this.patient = p;
        this.organization = org;
        this.userAccount = ua;
        this.enterprise = ep;
        this.ecoSystem = es;
        populatePatientMedicalRecordTable();
        populateDiseaseComboBox();
        pDoctorTxt.setText(patient.getPrimaryDoc());
        pDoctorTxt.setEnabled(false);
        populatePharmacyComboBox();
    }
    
    public PatientMedicalRecordJPanel(JPanel upc, Patient p,UserAccount ua, Enterprise ep, EcoSystem es) {
        initComponents();
        
        this.userProcessContainer = upc;
        this.patient = p;
        this.userAccount = ua;
        this.enterprise = ep;
        this.ecoSystem = es;
        populatePatientMedicalRecordTable();
        populateDiseaseComboBox();
        pDoctorTxt.setText(patient.getPrimaryDoc());
        pDoctorTxt.setEnabled(false);
        populatePharmacyComboBox();
    }
    
    private void populateDrugComboBox(String disease){
        drugComboBox.removeAllItems();
        
        for (Drug drug : ecoSystem.getDrugCatalog().getDrugCatalog()) {       
            if(drug.getStatus() == null) {
            } else if (drug.getDisease().getDiseaseName().equals(disease)) {
                if (drug.getStatus().equals("Approved")) {
                    drugComboBox.addItem(drug);
                }
            }
        }
    }
    
    public void populateDiseaseComboBox(){
        diseaseComboBox.removeAllItems();
        diseaseComboBox.addItem(Disease.Asthma);
        diseaseComboBox.addItem((Disease.Cancer));
        diseaseComboBox.addItem(Disease.Cholera);
        diseaseComboBox.addItem(Disease.Diabetes);
        diseaseComboBox.addItem(Disease.Leprosy);
        diseaseComboBox.addItem(Disease.Other);
        diseaseComboBox.addItem(Disease.NoDisease);
    }
    
    private void populatePharmacyComboBox(){
        pharmacyCombo.removeAllItems();
         for(Network network:ecoSystem.getNetworkList()){
            for(Enterprise ep:network.getEnterpriseDirectory().getEnterpriseList()){
                if(ep.getEnterpriseType().getValue().equals("Pharmacy")){
                    if(ep.getAddress().getCity().equals(enterprise.getAddress().getCity())){
                        pharmacyCombo.addItem(ep);
                    }
                }
            }
        }
       
    }
    
    private void populatePatientMedicalRecordTable(){
        DefaultTableModel model = (DefaultTableModel) medicalRecordTable.getModel();
        model.setRowCount(0);
        
        for(PatientVitalSign patientVS : patient.getPatientVitalSignHistory().getPatientVitalSignList()){
            Object[] row  = new Object[9];
            row[0] = patientVS;
            if( patientVS.getDisease() !=null ) {
                row[1] = patientVS.getDisease().getDiseaseName() == null ? ("N/A") : patientVS.getDisease().getDiseaseName();
                row[2] = patientVS.getDisease().getSymptoms()  == null? ("N/A") : patientVS.getDisease().getSymptoms();
            } else{
               row[1] = "No Disease";
               row[2] = "No symptoms";
            }
            row[3] = patientVS.getDrug();
            row[4] = patientVS.getDateAttended()  == null? ("N/A") :patientVS.getDateAttended();
            row[5] = patientVS.getHospitalName()  == null? ("N/A") :patientVS.getHospitalName();
            row[6] = patientVS.getStatus();
            row[7] = patient.getPrimaryDoc();
            row[8] = patient.getPrimaryDocId();
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
        medicalRecordTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        referOtherDocBtn = new javax.swing.JButton();
        assignNurseBtn = new javax.swing.JButton();
        labReportBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        diseaseComboBox = new javax.swing.JComboBox();
        symptomTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pDoctorTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        statusTxt = new javax.swing.JTextField();
        drugComboBox = new javax.swing.JComboBox();
        addCheckupBtn = new javax.swing.JButton();
        deleteRecordBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        medDosageTxt = new javax.swing.JTextField();
        assignMedBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        pharmacyCombo = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Patient Medical Record Panel");

        medicalRecordTable.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        medicalRecordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vital Id", "Disease", "Symptoms", "Medication", "Date Attended", "Hospital", "Status", "Primary Doctor", "Primary DoctorID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        medicalRecordTable.setRowHeight(26);
        jScrollPane1.setViewportView(medicalRecordTable);

        backBtn.setBackground(new java.awt.Color(255, 153, 153));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backBtn.setText(">> Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        referOtherDocBtn.setBackground(new java.awt.Color(255, 153, 153));
        referOtherDocBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        referOtherDocBtn.setText("Refer to Other Doctor");
        referOtherDocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referOtherDocBtnActionPerformed(evt);
            }
        });

        assignNurseBtn.setBackground(new java.awt.Color(255, 153, 153));
        assignNurseBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        assignNurseBtn.setText("Assign Nurse");
        assignNurseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignNurseBtnActionPerformed(evt);
            }
        });

        labReportBtn.setBackground(new java.awt.Color(255, 153, 153));
        labReportBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labReportBtn.setText("Report from Lab");
        labReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labReportBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Disease : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Status :");

        diseaseComboBox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        diseaseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diseaseComboBoxActionPerformed(evt);
            }
        });

        symptomTxt.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Primary Doctor :");

        pDoctorTxt.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Drug : ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Symptoms:");

        statusTxt.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N

        drugComboBox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        addCheckupBtn.setBackground(new java.awt.Color(255, 153, 153));
        addCheckupBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addCheckupBtn.setText("Add CheckUp");
        addCheckupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCheckupBtnActionPerformed(evt);
            }
        });

        deleteRecordBtn.setBackground(new java.awt.Color(255, 153, 153));
        deleteRecordBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deleteRecordBtn.setText("Delete Record");
        deleteRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRecordBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jLabel9.setText("Pharmacy");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jLabel10.setText("Dosage");

        medDosageTxt.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N

        assignMedBtn.setBackground(new java.awt.Color(255, 153, 153));
        assignMedBtn.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        assignMedBtn.setText("Pick Medication");
        assignMedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignMedBtnActionPerformed(evt);
            }
        });

        refreshBtn.setBackground(new java.awt.Color(255, 153, 153));
        refreshBtn.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        refreshBtn.setForeground(new java.awt.Color(51, 0, 51));
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        pharmacyCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacyComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addGap(68, 68, 68)
                                .addComponent(deleteRecordBtn))
                            .addComponent(addCheckupBtn))
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(referOtherDocBtn)
                                .addGap(118, 118, 118)
                                .addComponent(assignNurseBtn)
                                .addGap(126, 126, 126)
                                .addComponent(labReportBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(statusTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(symptomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(151, 151, 151)
                                        .addComponent(jLabel9)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pharmacyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(medDosageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(assignMedBtn)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(429, 429, 429)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshBtn)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diseaseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drugComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(46, 46, 46)
                        .addComponent(pDoctorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(refreshBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(referOtherDocBtn)
                    .addComponent(assignNurseBtn)
                    .addComponent(labReportBtn)
                    .addComponent(deleteRecordBtn))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pharmacyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(pDoctorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(diseaseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(symptomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drugComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(statusTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(medDosageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCheckupBtn)
                    .addComponent(assignMedBtn))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addCheckupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCheckupBtnActionPerformed
        String diseaseName = (String)diseaseComboBox.getSelectedItem();
        Drug drug = (Drug)drugComboBox.getSelectedItem();
        String symptom = symptomTxt.getText();
        String status = statusTxt.getText();
        String attName = userAccount.getPerson().getName();
        int attId = userAccount.getPerson().getPersonId();
        String hospitalName = enterprise.getName();
        String attendantName = userAccount.getPerson().getName();
        int attendantId = userAccount.getPerson().getPersonId();
        checkupDate = new Date();
        
        if (symptom.equals("") || status.equals("")) {
            JOptionPane.showMessageDialog(null, " Symptoms and status are mandatory fields.Please fill the complete Details! ");
            return;
        }
        
        // patient.setDisease;
        int selectedRow = medicalRecordTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to delete a Record!");
            return;
        }
        PatientVitalSign selectedVS = (PatientVitalSign)medicalRecordTable.getValueAt(selectedRow,0);
        if (selectedVS == null){
            patient.getPatientVitalSignHistory().addVitalSign(diseaseName,symptom, drug, checkupDate, status, attName, attId, hospitalName);
        } else {
            patient.getPatientVitalSignHistory().deleteVitalSign(selectedVS);
            patient.getPatientVitalSignHistory().updateVitalSign(selectedVS,diseaseName,symptom, drug, checkupDate, status, attName, attId, hospitalName);
        }
        populatePatientMedicalRecordTable();
    }//GEN-LAST:event_addCheckupBtnActionPerformed

    private void deleteRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRecordBtnActionPerformed
        int selectedRow = medicalRecordTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to delete a Record!");
            return;
        }
        PatientVitalSign pvs = (PatientVitalSign)medicalRecordTable.getValueAt(selectedRow,0);
        patient.getPatientVitalSignHistory().deleteVitalSign(pvs);
        populatePatientMedicalRecordTable();
    }//GEN-LAST:event_deleteRecordBtnActionPerformed

    private void labReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labReportBtnActionPerformed
        LabReportRequestJPanel panel = new LabReportRequestJPanel(userProcessContainer, patient, userAccount, enterprise);
        userProcessContainer.add("LabReportRequestJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_labReportBtnActionPerformed

    private void referOtherDocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referOtherDocBtnActionPerformed
        ReferToOtherDoctorJPanel panel = new ReferToOtherDoctorJPanel(userProcessContainer, patient, userAccount, enterprise,ecoSystem);
        userProcessContainer.add("ReferToOtherDoctorJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_referOtherDocBtnActionPerformed

    private void assignNurseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignNurseBtnActionPerformed
        ViewNurseTaskReportJPanel panel = new ViewNurseTaskReportJPanel(userProcessContainer, patient, userAccount, enterprise);
        userProcessContainer.add("ViewNurseTaskReportJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_assignNurseBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void diseaseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diseaseComboBoxActionPerformed
        String disease = (String) diseaseComboBox.getSelectedItem();
        populateDrugComboBox(disease);
    }//GEN-LAST:event_diseaseComboBoxActionPerformed

    private void assignMedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignMedBtnActionPerformed
        int medicineDosLevel = 0;
        try {
            medicineDosLevel = Integer.parseInt(medDosageTxt.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter correct dosage of the medicine to pick from Pharmacy.");
            return;
        }
        if (medicineDosLevel < 0) {
            JOptionPane.showMessageDialog(null, "Please enter valid medicine dosage.");
            return;
        }
        
        int selectedRow = medicalRecordTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first to assign medicine!");
            return;
        }
        
        PatientVitalSign pvs = (PatientVitalSign) medicalRecordTable.getValueAt(selectedRow,0); 
        Enterprise enterprise1 = (Enterprise) pharmacyCombo.getSelectedItem();
        Drug dr = (Drug) medicalRecordTable.getValueAt(selectedRow, 3);
        SalesWorkRequest saleRequest = new SalesWorkRequest();
        saleRequest.setDrug(dr);
        saleRequest.setPatient(patient);
        saleRequest.setHospitalName(enterprise.getName());
        saleRequest.setHospitalID(enterprise.getEnterpriseId());
        saleRequest.setPrescribedBy(userAccount.getPerson().getName());
        saleRequest.setQuantity(medicineDosLevel);
        saleRequest.setDisease(pvs.getDisease().getDiseaseName());
        enterprise1.getWorkQueue().getWorkRequestList().add(saleRequest);
        JOptionPane.showMessageDialog(this, "Patient Prescription has been sent to the Pharmacy :"
                + enterprise1 + ". Patient " + patient.getName()
                + " can now pick the product from the pharmacy!" , "Information" , JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_assignMedBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        populatePatientMedicalRecordTable();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void pharmacyComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacyComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pharmacyComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCheckupBtn;
    private javax.swing.JButton assignMedBtn;
    private javax.swing.JButton assignNurseBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteRecordBtn;
    private javax.swing.JComboBox diseaseComboBox;
    private javax.swing.JComboBox drugComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton labReportBtn;
    private javax.swing.JTextField medDosageTxt;
    private javax.swing.JTable medicalRecordTable;
    private javax.swing.JTextField pDoctorTxt;
    private javax.swing.JComboBox pharmacyCombo;
    private javax.swing.JButton referOtherDocBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTextField statusTxt;
    private javax.swing.JTextField symptomTxt;
    // End of variables declaration//GEN-END:variables
}
