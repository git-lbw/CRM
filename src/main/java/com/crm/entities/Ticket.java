package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {

  private Integer kId;
  private Integer staffId;
  private String reId;
  private double kMoney;
  private java.sql.Date kDate;
  private String staffName;
  private Integer kState;


  public Integer getKId() {
    return kId;
  }

  public void setKId(Integer kId) {
    this.kId = kId;
  }


  public Integer getStaffId() {
    return staffId;
  }

  public void setStaffId(Integer staffId) {
    this.staffId = staffId;
  }


  public String getReId() {
    return reId;
  }

  public void setReId(String reId) {
    this.reId = reId;
  }


  public double getKMoney() {
    return kMoney;
  }

  public void setKMoney(double kMoney) {
    this.kMoney = kMoney;
  }


  public java.sql.Date getKDate() {
    return kDate;
  }

  public void setKDate(java.sql.Date kDate) {
    this.kDate = kDate;
  }


  public String getStaffName() {
    return staffName;
  }

  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }


  public Integer getKState() {
    return kState;
  }

  public void setKState(Integer kState) {
    this.kState = kState;
  }

}
