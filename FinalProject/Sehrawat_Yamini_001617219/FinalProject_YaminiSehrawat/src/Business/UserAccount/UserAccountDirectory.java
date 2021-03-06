/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Person.Person;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String userName , String password){
        for(UserAccount userAccount : userAccountList)
            if(userAccount.getUserName().equals(userName) && userAccount.getPassword().equals(password)){
                return userAccount;
            }
            return null;
        }
    
    public UserAccount createUserAccount(String username, String password, Person person, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        userAccount.setPerson(person);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount userAccount : userAccountList){
            if (userAccount.getUserName().equals(username))
                return false;
        }
        return true;
    }
    
}
