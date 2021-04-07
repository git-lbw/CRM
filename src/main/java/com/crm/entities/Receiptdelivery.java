package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Receiptdelivery {

  private Integer receiptdeliveryId;
  private String receiptdeliveryName;
  private Integer otalquantity;
  private Integer staffId;
  private java.util.Date receiptdeliveryData;
  private Integer inventoryactionId;
  private Integer orderId;

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

  public Integer getStaffId() {
    return staffId;
  }

  public void setStaffId(Integer staffId) {
    this.staffId = staffId;
  }

  public Date getReceiptdeliveryData() {
    return receiptdeliveryData;
  }

  public void setReceiptdeliveryData(Date receiptdeliveryData) {
    this.receiptdeliveryData = receiptdeliveryData;
  }

  public Integer getInventoryactionId() {
    return inventoryactionId;
  }

  public void setInventoryactionId(Integer inventoryactionId) {
    this.inventoryactionId = inventoryactionId;
  }

  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }
}
