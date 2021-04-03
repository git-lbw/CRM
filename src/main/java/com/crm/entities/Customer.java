package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

  private Integer cuId;
  private Integer staffId;
  private String cuName;
  private String cuHigh;
  private String cuRank;
  private String cuState;
  private Integer cuMake;
  private java.sql.Date cuTime;
  private String cuSource;


  public Integer getCuId() {
    return cuId;
  }

  public void setCuId(Integer cuId) {
    this.cuId = cuId;
  }


  public Integer getStaffId() {
    return staffId;
  }

  public void setStaffId(Integer staffId) {
    this.staffId = staffId;
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


  public java.sql.Date getCuTime() {
    return cuTime;
  }

  public void setCuTime(java.sql.Date cuTime) {
    this.cuTime = cuTime;
  }


  public String getCuSource() {
    return cuSource;
  }

  public void setCuSource(String cuSource) {
    this.cuSource = cuSource;
  }

}
