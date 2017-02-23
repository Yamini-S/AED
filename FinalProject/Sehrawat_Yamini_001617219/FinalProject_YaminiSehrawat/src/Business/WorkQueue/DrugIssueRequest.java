/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author PC
 */
public class DrugIssueRequest extends WorkRequest{
    
    private Date rdate;
    private String drugSafetyIssue;
    private String callBackRequest;
    private String ePriseName;
    private String enterpriseCity;
    private int ePriseId;
    
    
    public DrugIssueRequest(){
        rdate = new Date();
    }

    public Date getRdate() {
        return rdate;
    }

    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }

    public String getDrugSafetyIssue() {
        return drugSafetyIssue;
    }

    public void setDrugSafetyIssue(String drugSafetyIssue) {
        this.drugSafetyIssue = drugSafetyIssue;
    }

    public String getCallBackRequest() {
        return callBackRequest;
    }

    public void setCallBackRequest(String callBackRequest) {
        this.callBackRequest = callBackRequest;
    }

    public String getePriseName() {
        return ePriseName;
    }

    public void setePriseName(String ePriseName) {
        this.ePriseName = ePriseName;
    }

    public String getEnterpriseCity() {
        return enterpriseCity;
    }

    public void setEnterpriseCity(String enterpriseCity) {
        this.enterpriseCity = enterpriseCity;
    }

    public int getePriseId() {
        return ePriseId;
    }

    public void setePriseId(int ePriseId) {
        this.ePriseId = ePriseId;
    }

   @Override
    public String toString(){
        return getStatus();
    }

}
