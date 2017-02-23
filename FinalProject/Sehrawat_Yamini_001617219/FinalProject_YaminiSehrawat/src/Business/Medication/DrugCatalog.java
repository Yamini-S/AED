/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medication;

import Business.EcoSystem;
import Business.HealthIssues.Disease;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author PC
 */
public class DrugCatalog {
    
    private ArrayList<Drug> drugCatalog;
    
    public DrugCatalog(){
        drugCatalog = new ArrayList<>();
    }

    public ArrayList<Drug> getDrugCatalog() {
        return drugCatalog;
    }

    public void setDrugCatalog(ArrayList<Drug> drugCatalog) {
        this.drugCatalog = drugCatalog;
    }
    
    public Drug addDrug(){
        Drug d = new Drug();
        drugCatalog.add(d);
        return d;
    }
   
    
     public Drug addDrugs(String name, String code,String sideEffects, int price,String expiryDate, Boolean value,
             String uses, String diseaseName, String pharmaName, int pharmaId) {
        Drug drug = new Drug();
        drug.setDrugName(name);
        drug.setDrugCode(code);
        drug.setListPrice(price);
       // drug.setAvailability(avail);
        drug.setExpiryDate(expiryDate);
        drug.setIsPrescriptionRequired(value);
        drug.setSideEffects(sideEffects);
        drug.setUses(uses);
        drug.setPharmaceuticalName(pharmaName);
        drug.setPharmaceuticalId(pharmaId);
        Disease disease = new Disease();
        disease.setDiseaseName(diseaseName);
        drug.setDisease(disease);
        drugCatalog.add(drug);
        return drug;
    }
     
     public void deleteDrug(Drug drug){
         drugCatalog.remove(drug);
     }
     
     public Drug searchDrug(int id){
        for (Drug drug : drugCatalog){
            if(drug.getDrugId() == id){
                return drug;
            }
        }return null;
    }
}
