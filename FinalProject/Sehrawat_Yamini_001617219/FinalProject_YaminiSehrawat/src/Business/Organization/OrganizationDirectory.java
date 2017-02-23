/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory(){
        organizationList = new ArrayList<>();
    }
    
    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if(type.getValue().equals(type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(type.Nurse.getValue())){
            organization = new NurseOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(type.Patient.getValue())){
            organization = new PatientOrganization();
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Organization.Type.MedSafetyOfficer.getValue())) {
            organization = new MedicationSafetyOfficerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.SalesPerson.getValue())) {
            organization = new SalesPersonOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
    
    public boolean searchIfPresent(Type type) {
        for (Organization organization : organizationList) {
            if (organization.getName().equals(type.getValue())) {
                return true;
            }
        }
        return false;
    }
    
}
