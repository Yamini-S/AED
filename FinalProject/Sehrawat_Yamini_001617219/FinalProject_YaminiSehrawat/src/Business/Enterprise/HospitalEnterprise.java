/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class HospitalEnterprise extends Enterprise{
    
    public HospitalEnterprise(String name , EnterpriseType enterpriseType,String street, 
             String state, String city, String zip){
        super(name, enterpriseType);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
