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
import UserInterface.PharmaceuticalAdminWorkArea.PharmaceuticalWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class PharmaceuticalAdminRole extends Role{
    
    public PharmaceuticalAdminRole() {
        super(null);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,
            Organization organization, Enterprise enterprise, EcoSystem ecoSystem, HOAuthority authority) {
        return new PharmaceuticalWorkAreaJPanel(userProcessContainer, enterprise, ecoSystem);
    }
    
}
