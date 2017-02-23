/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HealthIssues;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class DiseaseDirectory {
    
     private ArrayList<Disease> diseaseList ;
     
      public DiseaseDirectory() {
        diseaseList = new ArrayList<>();
    }

    public ArrayList<Disease> getDiseaseList() {
        return diseaseList;
    }

    public void setDiseaseList(ArrayList<Disease> diseaseList) {
        this.diseaseList = diseaseList;
    }
    
    public Disease addDiseaseAndSymmptoms(String name, String symptoms){
        Disease disease = new Disease();
        disease.setDiseaseName(name);
        disease.setSymptoms(symptoms);
        diseaseList.add(disease);
        return disease;
    }
    
    public void deleteDisease(Disease disease){
        diseaseList.remove(disease);
    }
    
}
