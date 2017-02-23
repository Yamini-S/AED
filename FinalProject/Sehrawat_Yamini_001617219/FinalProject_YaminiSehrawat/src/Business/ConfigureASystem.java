/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author PC
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
    
        EcoSystem ecoSystem = EcoSystem.getInstance();
    
        Employee employee = ecoSystem.getPersonDirectory().getEmployeeDirectory().createEmployee("Jack",
                "1Symphony Road", "Boston", "MA", "02115");
        UserAccount ua = ecoSystem.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin",
                employee, new SystemAdminRole());
        ecoSystem.getUserAccountCheckDirectory().addUserAccountName("sysadmin");
       
        return ecoSystem;
   }   
    
}
