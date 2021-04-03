package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {

  private Integer staffId;
  private String staffName;
  private String staffAccount;
  private String staffPassword;
  private String staffPhone;


  public Integer getStaffId() {
    return staffId;
  }

  public void setStaffId(Integer staffId) {
    this.staffId = staffId;
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
