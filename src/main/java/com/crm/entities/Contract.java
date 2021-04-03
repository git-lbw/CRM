package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contract {

  private Integer contractId;
  private String contractName;
  private Integer staffId;
  private Integer cuId;
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


  public java.sql.Date getStartDate() {
    return startDate;
  }

  public void setStartDate(java.sql.Date startDate) {
    this.startDate = startDate;
  }


  public java.sql.Date getEndDate() {
    return endDate;
  }

  public void setEndDate(java.sql.Date endDate) {
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

}
