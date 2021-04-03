package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Linkman {

  private Integer liId;
  private Integer staffId;
  private String cuId;
  private String liPhone;
  private String liSex;
  private String liDepartment;
  private String liPost;
  private String liSite;


  public Integer getLiId() {
    return liId;
  }

  public void setLiId(Integer liId) {
    this.liId = liId;
  }


  public Integer getStaffId() {
    return staffId;
  }

  public void setStaffId(Integer staffId) {
    this.staffId = staffId;
  }


  public String getCuId() {
    return cuId;
  }

  public void setCuId(String cuId) {
    this.cuId = cuId;
  }


  public String getLiPhone() {
    return liPhone;
  }

  public void setLiPhone(String liPhone) {
    this.liPhone = liPhone;
  }


  public String getLiSex() {
    return liSex;
  }

  public void setLiSex(String liSex) {
    this.liSex = liSex;
  }


  public String getLiDepartment() {
    return liDepartment;
  }

  public void setLiDepartment(String liDepartment) {
    this.liDepartment = liDepartment;
  }


  public String getLiPost() {
    return liPost;
  }

  public void setLiPost(String liPost) {
    this.liPost = liPost;
  }


  public String getLiSite() {
    return liSite;
  }

  public void setLiSite(String liSite) {
    this.liSite = liSite;
  }

}
