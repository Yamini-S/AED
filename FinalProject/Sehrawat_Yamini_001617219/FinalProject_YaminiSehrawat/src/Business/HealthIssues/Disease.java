/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HealthIssues;

/**
 *
 * @author PC
 */
public class Disease {
    
    private String diseaseName;
    private String symptoms;
    private int diseaseID;
    
    
    public static final String Leprosy = "Leprosy";
    public static final String Diabetes = "Diabetes";
    public static final String Asthma = "Asthma";
    public static final String Cholera = "Cholera";
    public static final String Cancer = "Cancer";
    public static final String Other = "Other";
    public static final String NoDisease = "NoDisease";
    
    

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public int getDiseaseID() {
        return diseaseID;
    }

    public void setDiseaseID(int diseaseID) {
        this.diseaseID = diseaseID;
    }
    
}
