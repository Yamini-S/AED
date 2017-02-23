/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminWorkArea;

import Business.EcoSystem;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private OrganizationDirectory organizationDirectory;
    
    public ManageUserAccountJPanel( JPanel upc,OrganizationDirectory od , EcoSystem es) {
        initComponents();
        
        this.userProcessContainer = upc;
        this.ecoSystem = es;
        this.organizationDirectory = od;
        populateOrgComboBox();
    }
    
    private void populateOrgComboBox(){
        orgComboBox.removeAllItems();
        for(Organization organization:organizationDirectory.getOrganizationList()){
           orgComboBox.addItem(organization);
        }
    }
    
    private void populateUserAccountTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) userAccountTable.getModel();
        model.setRowCount(0);
        
        for(UserAccount userAccount:organization.getUserAccountDirectory().getUserAccountList()){
            Object row[] = new Object[4];
            row[0] = userAccount;
            row[1] = userAccount.getRole();
            row[2] = userAccount.getUserName();
            row[3] = userAccount.getPassword();
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
        userAccountTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();
        orgComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Manage User Account Panel");

        userAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Name", "Role", "User Name", "Password"
            }
        ));
        jScrollPane1.setViewportView(userAccountTable);

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

        refreshBtn.setBackground(new java.awt.Color(255, 153, 153));
        refreshBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        createBtn.setBackground(new java.awt.Color(255, 153, 153));
        createBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        createBtn.setText("Create User Account");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        orgComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Organization Type : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(refreshBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(57, 57, 57)
                                    .addComponent(orgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(deleteBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(createBtn))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(backBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(jLabel1)))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(orgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(refreshBtn)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(createBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(67, 67, 67))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        CreateUserAccountJPanel panel = new CreateUserAccountJPanel(userProcessContainer, organizationDirectory, ecoSystem);
        userProcessContainer.add("CreateUserAccountJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createBtnActionPerformed

    private void orgComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgComboBoxActionPerformed
        Organization organization = (Organization) orgComboBox.getSelectedItem();
        if(organization!=null){
            populateUserAccountTable(organization);
        }
    }//GEN-LAST:event_orgComboBoxActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        Organization organization = (Organization) orgComboBox.getSelectedItem();
        if (organization != null){
        populateUserAccountTable(organization);
        }
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectedRow = userAccountTable.getSelectedRow();
        if(selectedRow<0){
           JOptionPane.showMessageDialog(null, "Please select a row first, to delete user account!");
            return; 
        }
        UserAccount userAccount = (UserAccount)userAccountTable.getValueAt(selectedRow, 0);
        
        int flag= JOptionPane.showConfirmDialog(this, "Are you sure want to remove this user account?","Warning", JOptionPane.YES_NO_OPTION);
        
        if(flag==0){
            for(Organization organization : organizationDirectory.getOrganizationList()){
                 organization.getUserAccountDirectory().getUserAccountList().remove(userAccount);
                 
            } 
        }else{
            JOptionPane.showMessageDialog(null, "User Account not deleted!");
        }
        JOptionPane.showMessageDialog(null, "User Account deleted successfully!");
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox orgComboBox;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTable userAccountTable;
    // End of variables declaration//GEN-END:variables
}
