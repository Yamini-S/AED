/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccountCheck;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class UserAccountCheckDirectory {
    
    private ArrayList<UserAccountCheck> userAccountCheckList;
    
    public UserAccountCheckDirectory(){
        userAccountCheckList= new ArrayList<>();
    }

    public ArrayList<UserAccountCheck> getUserAccountCheckList() {
        return userAccountCheckList;
    }

    public void setUserAccountCheckList(ArrayList<UserAccountCheck> userAccountCheckList) {
        this.userAccountCheckList = userAccountCheckList;
    }
    
    public void addUserAccountName(String userName){
        UserAccountCheck userAccountCheck = new UserAccountCheck();
        userAccountCheck.setUserName(userName);
        userAccountCheckList.add(userAccountCheck);
    }
    
    public String validUserAccountCheck(String userName){
        for (UserAccountCheck userAccountCheck : userAccountCheckList) {
            if (userAccountCheck.getUserName().equals(userName)) {
                return null;
            }
         } 
        return userName;
    }  
}
