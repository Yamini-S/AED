/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MedicationSafetyOfficerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class MedicationSafetyOfficerOrganization extends Organization{
    
    public MedicationSafetyOfficerOrganization(){
        super(Type.MedSafetyOfficer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MedicationSafetyOfficerRole());
        return roles;
    }
}
