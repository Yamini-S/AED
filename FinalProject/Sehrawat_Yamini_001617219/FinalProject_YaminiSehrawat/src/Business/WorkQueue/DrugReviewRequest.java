/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author PC
 */
public class DrugReviewRequest extends WorkRequest{
    
    private String city;
    private String ePriseType;
    private String ePriseName;
    private String callBackRequest;
    private String drugReviews;
    private String isReplied;
    private String pharmaceuticalName;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getePriseType() {
        return ePriseType;
    }

    public void setePriseType(String ePriseType) {
        this.ePriseType = ePriseType;
    }

    public String getePriseName() {
        return ePriseName;
    }

    public void setePriseName(String ePriseName) {
        this.ePriseName = ePriseName;
    }
    
    public String getCallBackRequest() {
        return callBackRequest;
    }

    public void setCallBackRequest(String callBackRequest) {
        this.callBackRequest = callBackRequest;
    }

    public String getDrugReviews() {
        return drugReviews;
    }

    public void setDrugReviews(String drugReviews) {
        this.drugReviews = drugReviews;
    }

    public String getIsReplied() {
        return isReplied;
    }

    public void setIsReplied(String isReplied) {
        this.isReplied = isReplied;
    }

    public String getPharmaceuticalName() {
        return pharmaceuticalName;
    }

    public void setPharmaceuticalName(String pharmaceuticalName) {
        this.pharmaceuticalName = pharmaceuticalName;
    }
    
    public String toString() {
        return city;
    }
    
}
