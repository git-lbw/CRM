package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Warehouseinandoutflow {

  private Integer receiptdeliveryflowingwaterId;
  private Integer inventoryactionId;
  private Integer receiptdeliveryId;
  private Integer productId;
  private java.sql.Date receiptdeliveryData;
  private Integer otalquantity;
  private String launchmode;
  private Integer orderId;
  private Integer staffId;


  public Integer getReceiptdeliveryflowingwaterId() {
    return receiptdeliveryflowingwaterId;
  }

  public void setReceiptdeliveryflowingwaterId(Integer receiptdeliveryflowingwaterId) {
    this.receiptdeliveryflowingwaterId = receiptdeliveryflowingwaterId;
  }


  public Integer getInventoryactionId() {
    return inventoryactionId;
  }

  public void setInventoryactionId(Integer inventoryactionId) {
    this.inventoryactionId = inventoryactionId;
  }


  public Integer getReceiptdeliveryId() {
    return receiptdeliveryId;
  }

  public void setReceiptdeliveryId(Integer receiptdeliveryId) {
    this.receiptdeliveryId = receiptdeliveryId;
  }


  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public java.sql.Date getReceiptdeliveryData() {
    return receiptdeliveryData;
  }

  public void setReceiptdeliveryData(java.sql.Date receiptdeliveryData) {
    this.receiptdeliveryData = receiptdeliveryData;
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


  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }


  public Integer getStaffId() {
    return staffId;
  }

  public void setStaffId(Integer staffId) {
    this.staffId = staffId;
  }

}
