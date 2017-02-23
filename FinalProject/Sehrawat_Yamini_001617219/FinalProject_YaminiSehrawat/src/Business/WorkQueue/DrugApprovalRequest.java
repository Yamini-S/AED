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
public class DrugApprovalRequest extends WorkRequest{
    private String ePriseName;
    private int ePriseId;
    private String drugApprovalCode;

    public String getePriseName() {
        return ePriseName;
    }

    public void setePriseName(String ePriseName) {
        this.ePriseName = ePriseName;
    }

    public int getePriseId() {
        return ePriseId;
    }

    public void setePriseId(int ePriseId) {
        this.ePriseId = ePriseId;
    }
    
    public String getDrugApprovalCode() {
        return drugApprovalCode;
    }

    public void setDrugApprovalCode(String drugApprovalCode) {
        this.drugApprovalCode = drugApprovalCode;
    }
    
    @Override
    public String toString(){
        return getStatus();
    }

}
