/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Address.Address;

/**
 *
 * @author PC
 */
public class Person {
    
    private String name;
    private static int count=0;
    private final int personId;
    private Address address;
    private String contactNo;
    
     public Person() {
         count++;
        this.personId = count;
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }
     
     public int getPersonId() {
        return personId;
    } 
    
}
