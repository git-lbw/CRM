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
public class OrdersVo {
    private Integer contractId;
    private String contractName;
    private Integer staffId;
    private Integer cuId;
    private double contractMoney;
    private Date startDate;
    private Date endDate;
    private Integer returnedNumber;
    private Integer billingState;
    private String contractState;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String operator;
    private String notes;

    private String cuName;
    private String cuHigh;
    private String cuRank;
    private String cuState;
    private Integer cuMake;
    private Date cuTime;
    private String cuSource;

    private String staffName;
    private String staffAccount;
    private String staffPassword;
    private String staffPhone;

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
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

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
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
}
