/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author PC
 */
public abstract class Enterprise extends Organization {
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private int enterpriseId;
    private static int counter = 1;
    
    public Enterprise(String name, EnterpriseType type){
        super(name);
        this.enterpriseType = type;
        this.organizationDirectory = new OrganizationDirectory();
        
        counter++;
        enterpriseId = counter;
    }
    
    public enum EnterpriseType{
        Hospital ("Hospital"),
        Pharmaceutical("Pharmaceutical"),
        Pharmacy("Pharmacy");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value = value;
        }
        
        public String getValue(){
            return value;
        }
        
        @Override
        public String toString() {
            return value;
        }
    }

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    @Override
    public String toString() {
        return getName();
    }
}
