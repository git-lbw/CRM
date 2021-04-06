package com.crm.vo.sdn;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.sql.Timestamp;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnsVo {
    private Integer rId;
    private Integer staffId;
    private Integer cuId;
    private Integer contractId;
    private Integer rMayp;
    private Integer rBeenp;
    private double rMaym;
    private double rBeenm;
    private java.sql.Date rDate;
    private Integer rState;
    private String contractName;
    private double contractMoney;
    private java.sql.Date startDate;
    private java.sql.Date endDate;
    private Integer returnedNumber;
    private Integer billingState;
    private String contractState;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String operator;
    private String notes;
    private String staffName;
    private String staffAccount;
    private String staffPassword;
    private String staffPhone;
    private String cuName;
    private String cuHigh;
    private String cuRank;
    private String cuState;
    private Integer cuMake;
    private java.sql.Date cuTime;
    private String cuSource;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getCuId() {
        return cuId;
    }

    public void setCuId(Integer cuId) {
        this.cuId = cuId;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public Integer getrMayp() {
        return rMayp;
    }

    public void setrMayp(Integer rMayp) {
        this.rMayp = rMayp;
    }

    public Integer getrBeenp() {
        return rBeenp;
    }

    public void setrBeenp(Integer rBeenp) {
        this.rBeenp = rBeenp;
    }

    public double getrMaym() {
        return rMaym;
    }

    public void setrMaym(double rMaym) {
        this.rMaym = rMaym;
    }

    public double getrBeenm() {
        return rBeenm;
    }

    public void setrBeenm(double rBeenm) {
        this.rBeenm = rBeenm;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Date getrDate() {
        return rDate;
    }

    public void setrDate(Date rDate) {
        this.rDate = rDate;
    }

    public Integer getrState() {
        return rState;
    }

    public void setrState(Integer rState) {
        this.rState = rState;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public double getContractMoney() {
        return contractMoney;
    }

    public void setContractMoney(double contractMoney) {
        this.contractMoney = contractMoney;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getReturnedNumber() {
        return returnedNumber;
    }

    public void setReturnedNumber(Integer returnedNumber) {
        this.returnedNumber = returnedNumber;
    }

    public Integer getBillingState() {
        return billingState;
    }

    public void setBillingState(Integer billingState) {
        this.billingState = billingState;
    }

    public String getContractState() {
        return contractState;
    }

    public void setContractState(String contractState) {
        this.contractState = contractState;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffAccount() {
        return staffAccount;
    }

    public void setStaffAccount(String staffAccount) {
        this.staffAccount = staffAccount;
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }

    public String getCuName() {
        return cuName;
    }

    public void setCuName(String cuName) {
        this.cuName = cuName;
    }

    public String getCuHigh() {
        return cuHigh;
    }

    public void setCuHigh(String cuHigh) {
        this.cuHigh = cuHigh;
    }

    public String getCuRank() {
        return cuRank;
    }

    public void setCuRank(String cuRank) {
        this.cuRank = cuRank;
    }

    public String getCuState() {
        return cuState;
    }

    public void setCuState(String cuState) {
        this.cuState = cuState;
    }

    public Integer getCuMake() {
        return cuMake;
    }

    public void setCuMake(Integer cuMake) {
        this.cuMake = cuMake;
    }

    public Date getCuTime() {
        return cuTime;
    }

    public void setCuTime(Date cuTime) {
        this.cuTime = cuTime;
    }

    public String getCuSource() {
        return cuSource;
    }

    public void setCuSource(String cuSource) {
        this.cuSource = cuSource;
    }
}
