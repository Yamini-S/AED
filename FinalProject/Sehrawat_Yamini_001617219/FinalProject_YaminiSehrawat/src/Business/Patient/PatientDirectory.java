/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Address.Address;
import Business.EcoSystem;
import Business.HealthIssues.Disease;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;
    private Patient patient;
    
    public PatientDirectory() {
        patientList = new ArrayList<>();
    }
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public Patient addPatient(String name, String gender,String dob, String Email, int age,String street,
     String city, String state, String zip, String priDocName, int priDocId){
        patient = new Patient();
        patient.setName(name);
        patient.setGender(gender);
        patient.setDob(dob);
        patient.setEmailId(Email);
        patient.setAge(age);
        patient.setPrimaryDoc(priDocName);
        patient.setPrimaryDocId(priDocId);
        Address add = new Address();
        add.setStreet(street);
        add.setCity(city);
        add.setState(state);
        add.setZipCode(zip);
        patient.setAddress(add);
        patientList.add(patient);
        EcoSystem.getInstance().getPersonDirectory().getPatientDirectory().getPatientList().add(patient);
        return patient;
        
    }
    
    public Patient searchPatient(int patientID){
        for(Patient patient : patientList){
            if(patient.getPatientId() == patientID){
                return patient;
            }
        }
        return null;
    }
    
    public Boolean searchIfPresentinSame(int check){
             for (Patient patient : patientList) {
            if (patient.getPatientId() == check) {
                return true;
            }
        }
        return false;
    }  
    
}
