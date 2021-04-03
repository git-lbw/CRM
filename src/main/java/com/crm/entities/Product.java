package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

  private Integer productId;
  private String productName;
  private Integer staffId;
  private Integer productunitId;
  private Integer inventorystatusId;
  private Integer inventoryQuantity;
  private Integer availableStock;
  private Integer lockInventory;
  private String productModel;
  private String productDescription;
  private java.sql.Date productCreationtime;
  private Integer productclassificationId;
  private double productPrice;


  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public Integer getStaffId() {
    return staffId;
  }

  public void setStaffId(Integer staffId) {
    this.staffId = staffId;
  }


  public Integer getProductunitId() {
    return productunitId;
  }

  public void setProductunitId(Integer productunitId) {
    this.productunitId = productunitId;
  }


  public Integer getInventorystatusId() {
    return inventorystatusId;
  }

  public void setInventorystatusId(Integer inventorystatusId) {
    this.inventorystatusId = inventorystatusId;
  }


  public Integer getInventoryQuantity() {
    return inventoryQuantity;
  }

  public void setInventoryQuantity(Integer inventoryQuantity) {
    this.inventoryQuantity = inventoryQuantity;
  }


  public Integer getAvailableStock() {
    return availableStock;
  }

  public void setAvailableStock(Integer availableStock) {
    this.availableStock = availableStock;
  }


  public Integer getLockInventory() {
    return lockInventory;
  }

  public void setLockInventory(Integer lockInventory) {
    this.lockInventory = lockInventory;
  }


  public String getProductModel() {
    return productModel;
  }

  public void setProductModel(String productModel) {
    this.productModel = productModel;
  }


  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }


  public java.sql.Date getProductCreationtime() {
    return productCreationtime;
  }

  public void setProductCreationtime(java.sql.Date productCreationtime) {
    this.productCreationtime = productCreationtime;
  }


  public Integer getProductclassificationId() {
    return productclassificationId;
  }

  public void setProductclassificationId(Integer productclassificationId) {
    this.productclassificationId = productclassificationId;
  }


  public double getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(double productPrice) {
    this.productPrice = productPrice;
  }

}
