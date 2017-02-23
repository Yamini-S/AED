/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;
import java.util.Date;

/**
 *
 * @author PC
 */
public class DoctorToNurseRequest extends WorkRequest{
    
    private Patient patient;
    private Date date;
    private String messageDoc;
    private String injection;
    private int dosageLevel;
    private String complications;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessageDoc() {
        return messageDoc;
    }

    public void setMessageDoc(String messageDoc) {
        this.messageDoc = messageDoc;
    }

    public String getInjection() {
        return injection;
    }

    public void setInjection(String injection) {
        this.injection = injection;
    }

    public int getDosageLevel() {
        return dosageLevel;
    }

    public void setDosageLevel(int dosageLevel) {
        this.dosageLevel = dosageLevel;
    }

    public String getComplications() {
        return complications;
    }

    public void setComplications(String complications) {
        this.complications = complications;
    }
    
    @Override
    public String toString() {
        return getStatus();
    }
}
