/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganizationJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    
    public ManageOrganizationJPanel(JPanel upc, EcoSystem es, Enterprise ep) {
        initComponents();
        
        this.userProcessContainer = upc;
        this.ecoSystem = es;
        this.enterprise = ep;
        populateOrganizationTable();
        populateOrgComboBox();
    }

    
    private void populateOrganizationTable(){
        DefaultTableModel model = (DefaultTableModel) orgInfoTable.getModel();
        model.setRowCount(0);
        
        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
            Object row[] = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization;
            model.addRow(row);
        }
    }
    
    private void populateOrgComboBox(){
        orgComboBox.removeAllItems();
        for(Type type:Organization.Type.values()){
            if((type.equals(Type.Doctor)) || (type.equals(Type.Lab)) || (type.equals(Type.Nurse))){
                orgComboBox.addItem(type);
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
        orgInfoTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        addOrgBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        orgComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Manage Organization Panel");

        orgInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization ID", "Organization Name"
            }
        ));
        jScrollPane1.setViewportView(orgInfoTable);

        backBtn.setBackground(new java.awt.Color(255, 153, 153));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backBtn.setText(">> Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
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

        addOrgBtn.setBackground(new java.awt.Color(255, 153, 153));
        addOrgBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addOrgBtn.setText("Add Organization");
        addOrgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrgBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Organization Type: ");

        orgComboBox.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        orgComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteBtn)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(424, 424, 424)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addOrgBtn)
                            .addComponent(orgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(jLabel1)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(132, 132, 132)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(deleteBtn)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(orgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(addOrgBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(100, 100, 100))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addOrgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrgBtnActionPerformed
        Type type = (Type) orgComboBox.getSelectedItem();
        if(type==null){
            JOptionPane.showMessageDialog(null,"Please select a valid Organization!");
            return;
        }
        Boolean ifOrgPresent = enterprise.getOrganizationDirectory().searchIfPresent(type);
        if(ifOrgPresent == true){
           JOptionPane.showMessageDialog(null,"This organization already exists in the enterprise!");
            return; 
        }
        enterprise.getOrganizationDirectory().createOrganization(type);
        populateOrganizationTable();
        JOptionPane.showMessageDialog(null,"Organization added!");
        
    }//GEN-LAST:event_addOrgBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectedRow = orgInfoTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row to delete the organization!");
            return;
        }
        
        Organization org = (Organization) orgInfoTable.getValueAt(selectedRow,1);
        int flag= JOptionPane.showConfirmDialog(this, "Are you sure want to remove?","Warning", JOptionPane.YES_NO_OPTION);
        
        if(flag==0){
             enterprise.getOrganizationDirectory().getOrganizationList().remove(org);
             JOptionPane.showMessageDialog(null,"Organization deleted!");
        }
        else{
            JOptionPane.showMessageDialog(null,"Organization not deleted!");
        }
        populateOrganizationTable();
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrgBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox orgComboBox;
    private javax.swing.JTable orgInfoTable;
    // End of variables declaration//GEN-END:variables
}