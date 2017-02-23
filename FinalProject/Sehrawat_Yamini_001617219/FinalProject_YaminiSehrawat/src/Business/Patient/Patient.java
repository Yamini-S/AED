/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.HealthIssues.Disease;
import Business.HealthIssues.DiseaseDirectory;
import Business.Medication.Drug;
import Business.PatientHealthRecord.PatientVitalSignHistory;
import Business.Person.Person;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author PC
 */
public class Patient extends Person{
    
    
    private int patientId;
    private static int patientCount = 101;
    private String dob;
    private Disease disease;
    private String gender;
    private PatientVitalSignHistory patientVitalSignHistory;
    private int age;
    private String emailId;
    private WorkQueue workQueue;
    private String primaryDoc;
    private int primaryDocId;
    private String prefferedPharmacy;
   // private Drug drug;
    
    public static final String male = "Male";
    public static final String female = "Female";
    
    
    public Patient() {
        
        patientId = patientCount; 
        patientCount++;
        patientVitalSignHistory = new PatientVitalSignHistory();
        workQueue = new WorkQueue();
      //  drug = new Drug();
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public PatientVitalSignHistory getPatientVitalSignHistory() {
        return patientVitalSignHistory;
    }

    public void setPatientVitalSignHistory(PatientVitalSignHistory patientVitalSignHistory) {
        this.patientVitalSignHistory = patientVitalSignHistory;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public String getPrimaryDoc() {
        return primaryDoc;
    }

    public void setPrimaryDoc(String primaryDoc) {
        this.primaryDoc = primaryDoc;
    }

    public int getPrimaryDocId() {
        return primaryDocId;
    }

    public void setPrimaryDocId(int primaryDocId) {
        this.primaryDocId = primaryDocId;
    }

    public String getPrefferedPharmacy() {
        return prefferedPharmacy;
    }

    public void setPrefferedPharmacy(String prefferedPharmacy) {
        this.prefferedPharmacy = prefferedPharmacy;
    }

//    public Drug getDrug() {
//        return drug;
//    }
//
//    public void setDrug(Drug drug) {
//        this.drug = drug;
//    }
    
    @Override
    public String toString() {
        return getName();
    }
}
