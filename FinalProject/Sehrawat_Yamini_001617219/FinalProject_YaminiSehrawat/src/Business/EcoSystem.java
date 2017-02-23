/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Address.Address;
import Business.Enterprise.Enterprise;
import Business.HealthOfficialAuthority.HOAuthority;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AdminRole;
import Business.Role.PharmaceuticalAdminRole;
import Business.Role.PharmacyAdminRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccountCheck.UserAccountCheckDirectory;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem ecoSystem;
    private ArrayList<Network> networkList;
    private HOAuthority authority;
    private UserAccountCheckDirectory userAccountCheckDirectory;
    
     private EcoSystem(){
        super(null);
        this.networkList = new ArrayList<>();
        this.authority = new HOAuthority();
        this.userAccountCheckDirectory = new UserAccountCheckDirectory();
    }
    
    
    public static EcoSystem getInstance(){
        if(ecoSystem == null){
            ecoSystem = new EcoSystem();
        }
        return ecoSystem;
    }
    

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public HOAuthority getAuthority() {
        return authority;
    }

    public void setAuthority(HOAuthority authority) {
        this.authority = authority;
    }

    public UserAccountCheckDirectory getUserAccountCheckDirectory() {
        return userAccountCheckDirectory;
    }

    public void setUserAccountCheckDirectory(UserAccountCheckDirectory userAccountCheckDirectory) {
        this.userAccountCheckDirectory = userAccountCheckDirectory;
    }
    
    
    
     public Network createAndAddNetwork(String city){
         Network network = new Network();
         network.setName(city);
         networkList.add(network);
         return network;
     }
   
    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

        for (Network network : networkList) {
        }

        return true;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SystemAdminRole());
        return roles;
//        for (Network network : ecoSystem.getNetworkList()) {
//            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
//                for (Enterprise.EnterpriseType enterpriseType : Enterprise.EnterpriseType.values()) {
//                    if (enterpriseType.equals("Hospital")){
//                        roles.add(new AdminRole());
//                    } else if (enterpriseType.equals("Pharmacy")) {
//                        roles.add(new PharmacyAdminRole());
//                    } else {
//                        roles.add(new PharmaceuticalAdminRole());
//                    }
//                }
//            }
//        }
//        return roles;
//        

    }
    
    public HOAuthority addAuthority(String authorityName, String emailId, String city) {
        authority.setName(authorityName);
        authority.setEmailId(emailId);
        Address add = new Address();
        add.setCity(city);
        authority.setAddress(add);
        return authority;
    }
    
    public boolean searchIfPresent(String city) {
        for (Network network : networkList) {
            if (network.getName().equals(city)) {
                return true;
            }
        }
        return false;
    }
}
