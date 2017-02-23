/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.HealthOfficialAuthority.HOAuthority;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.PharmacyAdminWorkArea.SalesPersonWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class SalesPersonRole extends Role{
    
    public SalesPersonRole() {
        super(RoleType.SalesPerson.getValue());
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecosystem, HOAuthority authority) {
        return new SalesPersonWorkAreaJPanel(userProcessContainer, account, organization, enterprise, ecosystem);
    }
    
}
