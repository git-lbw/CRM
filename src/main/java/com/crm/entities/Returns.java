package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Returns {

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


  public Integer getRId() {
    return rId;
  }

  public void setRId(Integer rId) {
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


  public Integer getRMayp() {
    return rMayp;
  }

  public void setRMayp(Integer rMayp) {
    this.rMayp = rMayp;
  }


  public Integer getRBeenp() {
    return rBeenp;
  }

  public void setRBeenp(Integer rBeenp) {
    this.rBeenp = rBeenp;
  }


  public double getRMaym() {
    return rMaym;
  }

  public void setRMaym(double rMaym) {
    this.rMaym = rMaym;
  }


  public double getRBeenm() {
    return rBeenm;
  }

  public void setRBeenm(double rBeenm) {
    this.rBeenm = rBeenm;
  }


  public java.sql.Date getRDate() {
    return rDate;
  }

  public void setRDate(java.sql.Date rDate) {
    this.rDate = rDate;
  }


  public Integer getRState() {
    return rState;
  }

  public void setRState(Integer rState) {
    this.rState = rState;
  }

}
