/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HealthOfficialAuthority;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class HOAuthority extends Organization{
    private int authorityCode;
    private static int Counter = 0;
    
    public HOAuthority() {
        super(null);
        Counter++;
        authorityCode = Counter;
    }

    public int getAuthorityCode() {
        return authorityCode;
    }

    public void setAuthorityCode(int authCode) {
        this.authorityCode = authCode;
    }
   @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    @Override
    public String toString(){
        return super.getName();
    }
}
