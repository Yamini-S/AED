/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medication;

import Business.HealthIssues.Disease;
import Business.WorkQueue.WorkQueue;
import java.util.Date;

/**
 *
 * @author PC
 */
public class Drug {
    private String drugName;
    private String drugCode;
    private int drugId;
    private int listPrice;
    private int availability;
    private String expiryDate;
    private boolean isPrescriptionRequired;
    private Date manufacturingDate;
    private String dosage;
    private static int drugCounter = 1000;
    private String uses;
    private String sideEffects;
    private Disease disease;
    private String status;
    private WorkQueue workQueue;
    private String pharmaceuticalName;
    private int pharmaceuticalId;
    
    public static final String Yes = "Yes"; 
    public static final String No = "No";
    
    
    public Drug() {
        drugCounter++;
        drugId = drugCounter;
        workQueue = new WorkQueue();
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public int getListPrice() {
        return listPrice;
    }

    public void setListPrice(int listPrice) {
        this.listPrice = listPrice;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public boolean isIsPrescriptionRequired() {
        return isPrescriptionRequired;
    }

    public void setIsPrescriptionRequired(boolean isPrescriptionRequired) {
        this.isPrescriptionRequired = isPrescriptionRequired;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getUses() {
        return uses;
    }

    public void setUses(String uses) {
        this.uses = uses;
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public String getPharmaceuticalName() {
        return pharmaceuticalName;
    }

    public void setPharmaceuticalName(String pharmaceuticalName) {
        this.pharmaceuticalName = pharmaceuticalName;
    }

    public int getPharmaceuticalId() {
        return pharmaceuticalId;
    }

    public void setPharmaceuticalId(int pharmaceuticalId) {
        this.pharmaceuticalId = pharmaceuticalId;
    }
    
    
    
    @Override
    public String toString() {
        return getDrugCode();
    }
    
}
