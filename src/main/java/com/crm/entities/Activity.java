package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Activity {

  private Integer acId;
  private Integer staffId;
  private String acName;
  private java.sql.Date acStarttime;
  private java.sql.Date acEndtime;
  private String acSite;
  private String acType;
  private Integer acState;
  private double acPlanned;
  private double acActualcost;
  private double acIncome;
  private double acReality;


  public Integer getAcId() {
    return acId;
  }

  public void setAcId(Integer acId) {
    this.acId = acId;
  }


  public Integer getStaffId() {
    return staffId;
  }

  public void setStaffId(Integer staffId) {
    this.staffId = staffId;
  }


  public String getAcName() {
    return acName;
  }

  public void setAcName(String acName) {
    this.acName = acName;
  }


  public java.sql.Date getAcStarttime() {
    return acStarttime;
  }

  public void setAcStarttime(java.sql.Date acStarttime) {
    this.acStarttime = acStarttime;
  }


  public java.sql.Date getAcEndtime() {
    return acEndtime;
  }

  public void setAcEndtime(java.sql.Date acEndtime) {
    this.acEndtime = acEndtime;
  }


  public String getAcSite() {
    return acSite;
  }

  public void setAcSite(String acSite) {
    this.acSite = acSite;
  }


  public String getAcType() {
    return acType;
  }

  public void setAcType(String acType) {
    this.acType = acType;
  }


  public Integer getAcState() {
    return acState;
  }

  public void setAcState(Integer acState) {
    this.acState = acState;
  }


  public double getAcPlanned() {
    return acPlanned;
  }

  public void setAcPlanned(double acPlanned) {
    this.acPlanned = acPlanned;
  }


  public double getAcActualcost() {
    return acActualcost;
  }

  public void setAcActualcost(double acActualcost) {
    this.acActualcost = acActualcost;
  }


  public double getAcIncome() {
    return acIncome;
  }

  public void setAcIncome(double acIncome) {
    this.acIncome = acIncome;
  }


  public double getAcReality() {
    return acReality;
  }

  public void setAcReality(double acReality) {
    this.acReality = acReality;
  }

}
