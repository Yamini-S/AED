/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PatientHealthRecord;

import Business.HealthIssues.Disease;
import Business.Medication.Drug;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author PC
 */
public class PatientVitalSignHistory {
    
    private ArrayList<PatientVitalSign> patientVitalSignList;
    
    public PatientVitalSignHistory(){
        patientVitalSignList = new ArrayList<>();
    }

    public ArrayList<PatientVitalSign> getPatientVitalSignList() {
        return patientVitalSignList;
    }

    public void setPatientVitalSignList(ArrayList<PatientVitalSign> patientVitalSignList) {
        this.patientVitalSignList = patientVitalSignList;
    }
   
    public PatientVitalSign addVitalSign(){
        PatientVitalSign pvs = new PatientVitalSign();
        patientVitalSignList.add(pvs);
        return pvs;
    }
    
   
    public PatientVitalSign addVitalSign(String diseaseName,String symptom,Drug drug,
        Date dateAtt, String status, String attName, int attId, String hospitalName){        
       PatientVitalSign pvs = new PatientVitalSign();
       Disease d = new Disease();
       d.setDiseaseName(diseaseName);
       d.setSymptoms(symptom);
       pvs.setDisease(d);
       pvs.setDrug(drug);
       pvs.setDateAttended(dateAtt);
       pvs.setStatus(status);
       pvs.setAttendantName(attName);
       pvs.setAttendantId(String.valueOf(attId));
       pvs.setHospitalName(hospitalName);
       patientVitalSignList.add(pvs);
       return pvs;
   }
    
   public PatientVitalSign updateVitalSign(PatientVitalSign pvs , String diseaseName,String symptom,Drug drug,
        Date dateAtt, String status, String attName, int attId, String hospitalName){        
       Disease d = new Disease();
       d.setDiseaseName(diseaseName);
       d.setSymptoms(symptom);
       pvs.setDisease(d);
       pvs.setDrug(drug);
       pvs.setDateAttended(dateAtt);
       pvs.setStatus(status);
       pvs.setAttendantName(attName);
       pvs.setAttendantId(String.valueOf(attId));
       pvs.setHospitalName(hospitalName);
       patientVitalSignList.add(pvs);
       return pvs;
   } 
    
    public void deleteVitalSign(PatientVitalSign vitalSign) {
        patientVitalSignList.remove(vitalSign);
    }
    
    public PatientVitalSign retriveVitalSign(int vitalId){
        
        for(PatientVitalSign vitalSign : patientVitalSignList){
            if (vitalSign.getVitalSignId() == vitalId){
                return vitalSign;
            }
        } 
        return null;
    }
    
}
