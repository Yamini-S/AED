/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Address.Address;
import Business.Enterprise.Enterprise.EnterpriseType;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public void createAndAddEnterprise(String name , Enterprise.EnterpriseType enterpriseType,
        String street, String state, String city, String zip){
        Enterprise enterprise = null;
        Address add = null;
        
        if (enterpriseType.equals(Enterprise.EnterpriseType.Hospital)){
            enterprise = new HospitalEnterprise(name, enterpriseType, street, state, city, zip);
            add = new Address();
            add.setStreet(street);
            add.setCity(city);
            add.setState(state);
            add.setZipCode(zip);
            enterprise.setAddress(add);
            enterpriseList.add(enterprise);
        }else if (enterpriseType.equals(Enterprise.EnterpriseType.Pharmaceutical)) {
            enterprise = new PharmaceuticalEnterprise(name, enterpriseType, street, state, city, zip);
            add = new Address();
            add.setStreet(street);
            add.setState(state);
            add.setCity(city);
            add.setZipCode(zip);
            enterprise.setAddress(add);
            enterpriseList.add(enterprise);
        } else if (enterpriseType.equals(Enterprise.EnterpriseType.Pharmacy)) {
            enterprise = new PharmacyEnterprise(name, enterpriseType, street, state, city, zip);
            add = new Address();
            add.setStreet(street);
            add.setState(state);
            add.setCity(city);
            add.setZipCode(zip);
            enterprise.setAddress(add);
            enterpriseList.add(enterprise);
        }
        
    }
    
    public Enterprise searchEnterprise(int ePriseID){
    
        for (Enterprise enterprise : enterpriseList){
            
            if (enterprise.getEnterpriseId() == ePriseID){
                return enterprise;
            }
        }
        return null;
    }
    
    public boolean searchIfEnterpriseExist(EnterpriseType type) {
        for (Enterprise enterprise : enterpriseList) {
            if (enterprise.getName().equals(type.getValue())) {
                return true;
            }
        }
        return false;
    }
    
}
