package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Clue {

  private Integer clId;
  private Integer staffId;
  private String clName;
  private String clHigh;
  private String clFollow;
  private Integer clState;
  private java.sql.Date clTime;
  private String clPhone;
  private String clSex;
  private String clSite;
  private String clSource;


  public Integer getClId() {
    return clId;
  }

  public void setClId(Integer clId) {
    this.clId = clId;
  }


  public Integer getStaffId() {
    return staffId;
  }

  public void setStaffId(Integer staffId) {
    this.staffId = staffId;
  }


  public String getClName() {
    return clName;
  }

  public void setClName(String clName) {
    this.clName = clName;
  }


  public String getClHigh() {
    return clHigh;
  }

  public void setClHigh(String clHigh) {
    this.clHigh = clHigh;
  }


  public String getClFollow() {
    return clFollow;
  }

  public void setClFollow(String clFollow) {
    this.clFollow = clFollow;
  }


  public Integer getClState() {
    return clState;
  }

  public void setClState(Integer clState) {
    this.clState = clState;
  }


  public java.sql.Date getClTime() {
    return clTime;
  }

  public void setClTime(java.sql.Date clTime) {
    this.clTime = clTime;
  }


  public String getClPhone() {
    return clPhone;
  }

  public void setClPhone(String clPhone) {
    this.clPhone = clPhone;
  }


  public String getClSex() {
    return clSex;
  }

  public void setClSex(String clSex) {
    this.clSex = clSex;
  }


  public String getClSite() {
    return clSite;
  }

  public void setClSite(String clSite) {
    this.clSite = clSite;
  }


  public String getClSource() {
    return clSource;
  }

  public void setClSource(String clSource) {
    this.clSource = clSource;
  }

}
