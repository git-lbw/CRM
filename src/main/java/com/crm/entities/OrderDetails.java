package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails {

  private Integer orderDetailsId;
  private Integer orderId;
  private Integer productId;
  private Integer productNumber;
  private double orderDetailsMoney;


  public Integer getOrderDetailsId() {
    return orderDetailsId;
  }

  public void setOrderDetailsId(Integer orderDetailsId) {
    this.orderDetailsId = orderDetailsId;
  }


  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }


  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public Integer getProductNumber() {
    return productNumber;
  }

  public void setProductNumber(Integer productNumber) {
    this.productNumber = productNumber;
  }


  public double getOrderDetailsMoney() {
    return orderDetailsMoney;
  }

  public void setOrderDetailsMoney(double orderDetailsMoney) {
    this.orderDetailsMoney = orderDetailsMoney;
  }

}
