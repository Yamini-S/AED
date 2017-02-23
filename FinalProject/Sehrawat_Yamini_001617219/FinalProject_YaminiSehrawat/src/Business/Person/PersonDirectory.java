/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Employee.EmployeeDirectory;
import Business.Patient.PatientDirectory;

/**
 *
 * @author PC
 */
public class PersonDirectory {
    
    private EmployeeDirectory employeeDirectory;
    private PatientDirectory patientDirectory;
    
    public PersonDirectory(){
        this.employeeDirectory = new EmployeeDirectory();
        this.patientDirectory = new PatientDirectory();
    }
    
    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    
    
}
