/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;

/**
 *
 * @author PC
 */
public class AskforPatientDetailRequest extends WorkRequest{
    private int askPatientId;
    private Patient patient;
    private String organizationName;
    private String city;

    public int getAskPatientId() {
        return askPatientId;
    }

    public void setAskPatientId(int askPatientId) {
        this.askPatientId = askPatientId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    @Override
    public String toString() {
        return getStatus();
    }
}
