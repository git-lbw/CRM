package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Record {

  private String reId;
  private Integer staffId;
  private Integer rId;
  private Integer contractId;
  private double reBeenm;
  private double reMoney;
  private Integer rePeriods;
  private java.sql.Date reDate;


  public String getReId() {
    return reId;
  }

  public void setReId(String reId) {
    this.reId = reId;
  }


  public Integer getStaffId() {
    return staffId;
  }

  public void setStaffId(Integer staffId) {
    this.staffId = staffId;
  }


  public Integer getRId() {
    return rId;
  }

  public void setRId(Integer rId) {
    this.rId = rId;
  }


  public Integer getContractId() {
    return contractId;
  }

  public void setContractId(Integer contractId) {
    this.contractId = contractId;
  }


  public double getReBeenm() {
    return reBeenm;
  }

  public void setReBeenm(double reBeenm) {
    this.reBeenm = reBeenm;
  }


  public double getReMoney() {
    return reMoney;
  }

  public void setReMoney(double reMoney) {
    this.reMoney = reMoney;
  }


  public Integer getRePeriods() {
    return rePeriods;
  }

  public void setRePeriods(Integer rePeriods) {
    this.rePeriods = rePeriods;
  }


  public java.sql.Date getReDate() {
    return reDate;
  }

  public void setReDate(java.sql.Date reDate) {
    this.reDate = reDate;
  }

}
