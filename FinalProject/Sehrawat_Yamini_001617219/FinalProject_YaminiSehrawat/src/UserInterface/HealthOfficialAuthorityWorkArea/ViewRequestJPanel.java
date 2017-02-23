/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HealthOfficialAuthorityWorkArea;

import Business.Medication.Drug;
import Business.WorkQueue.DrugApprovalRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class ViewRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewRequestJPanel
     */
    
    private JPanel userProcessContainer;
    private DrugApprovalRequest request;
    private Drug drug;
    public ViewRequestJPanel(JPanel upc, DrugApprovalRequest dar, Drug drug) {
        initComponents();
        
        this.userProcessContainer = upc;
        this.request = dar;
        this.drug = drug;
        populateRequestData();
    }

    private void populateRequestData(){
        String id = String.valueOf(request.getRequestID());
        String drugName  = drug.getDrugName();
        String drugCode = drug.getDrugCode();
        String disease = drug.getDisease().getDiseaseName();
        String uses  = drug.getUses();
        String risks =  drug.getSideEffects();
        String senderName = request.getSender().getPerson().getName();
        String orgName = request.getePriseName();
        
        requestIDTxt.setText(id);
        medicineTxt.setText(drugName);
        medCodeTxt.setText(drugCode);
        diseaseCureTxt.setText(disease);
        usesTxt.setText(uses);
        risksTxt.setText(risks);
        senderTxt.setText(senderName);
        organizationTxt.setText(orgName);
        
        requestIDTxt.setEnabled(false);
        medicineTxt.setEnabled(false);
        medCodeTxt.setEnabled(false);
        diseaseCureTxt.setEnabled(false);
        usesTxt.setEnabled(false);
        risksTxt.setEnabled(false);
        senderTxt.setEnabled(false);
        organizationTxt.setEnabled(false);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        requestIDTxt = new javax.swing.JTextField();
        medicineTxt = new javax.swing.JTextField();
        medCodeTxt = new javax.swing.JTextField();
        diseaseCureTxt = new javax.swing.JTextField();
        usesTxt = new javax.swing.JTextField();
        risksTxt = new javax.swing.JTextField();
        senderTxt = new javax.swing.JTextField();
        organizationTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("View Request Panel");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jLabel2.setText("Request ID ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jLabel3.setText("Medicine ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jLabel4.setText("Medicine Code");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jLabel5.setText("Disease Cure");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jLabel6.setText("Uses");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jLabel7.setText("Risks");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jLabel8.setText("Sender Name");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jLabel9.setText("Organization Name");

        medicineTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineTxtActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(255, 153, 153));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        backBtn.setText(">> Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(diseaseCureTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usesTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(risksTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(senderTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(organizationTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(requestIDTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(medicineTxt)
                            .addComponent(medCodeTxt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(backBtn)))
                .addContainerGap(467, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(requestIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(medicineTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(medCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(diseaseCureTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(usesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(risksTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(senderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(organizationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(110, 110, 110))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void medicineTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicineTxtActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField diseaseCureTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField medCodeTxt;
    private javax.swing.JTextField medicineTxt;
    private javax.swing.JTextField organizationTxt;
    private javax.swing.JTextField requestIDTxt;
    private javax.swing.JTextField risksTxt;
    private javax.swing.JTextField senderTxt;
    private javax.swing.JTextField usesTxt;
    // End of variables declaration//GEN-END:variables
}
