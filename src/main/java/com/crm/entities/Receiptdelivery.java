package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Receiptdelivery {

  private Integer receiptdeliveryId;
  private String receiptdeliveryName;
  private Integer otalquantity;
  private String launchmode;
  private Integer staffId;
  private java.sql.Date receiptdeliveryData;
  private Integer inventoryactionId;

  public Integer getReceiptdeliveryId() {
    return receiptdeliveryId;
  }

  public void setReceiptdeliveryId(Integer receiptdeliveryId) {
    this.receiptdeliveryId = receiptdeliveryId;
  }


  public String getReceiptdeliveryName() {
    return receiptdeliveryName;
  }

  public void setReceiptdeliveryName(String receiptdeliveryName) {
    this.receiptdeliveryName = receiptdeliveryName;
  }


  public Integer getOtalquantity() {
    return otalquantity;
  }

  public void setOtalquantity(Integer otalquantity) {
    this.otalquantity = otalquantity;
  }


  public String getLaunchmode() {
    return launchmode;
  }

  public void setLaunchmode(String launchmode) {
    this.launchmode = launchmode;
  }


  public Integer getStaffId() {
    return staffId;
  }

  public void setStaffId(Integer staffId) {
    this.staffId = staffId;
  }


  public java.sql.Date getReceiptdeliveryData() {
    return receiptdeliveryData;
  }

  public void setReceiptdeliveryData(java.sql.Date receiptdeliveryData) {
    this.receiptdeliveryData = receiptdeliveryData;
  }

  public Integer getInventoryactionId() {
    return inventoryactionId;
  }

  public void setInventoryactionId(Integer inventoryactionId) {
    this.inventoryactionId = inventoryactionId;
  }
}
