/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Person.Person;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author PC
 */
public class Employee extends Person{
    
    private WorkQueue workQueue;
    private String emailId;
    
    public Employee() {
       workQueue = new WorkQueue();
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
    
   @Override
    public String toString(){   
        return getName();
    }
    
    
    
}
