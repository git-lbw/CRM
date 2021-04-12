package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {

  private Integer orderId;
  private String orderName;
  private Integer staffId;
  private Integer cuId;
  private double orderMoney;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private java.util.Date startDate;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private java.util.Date fixtureDate;
  private Integer salesLeadsId;
  private Integer contractId;
  private String orderState;
  private Timestamp createTime;
  private Timestamp updateTime;
  private String operator;
  private String notes;


  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }


  public String getOrderName() {
    return orderName;
  }

  public void setOrderName(String orderName) {
    this.orderName = orderName;
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


  public double getOrderMoney() {
    return orderMoney;
  }

  public void setOrderMoney(double orderMoney) {
    this.orderMoney = orderMoney;
  }


  public java.util.Date getStartDate() {
    return startDate;
  }

  public void setStartDate(java.util.Date startDate) {
    this.startDate = startDate;
  }


  public java.util.Date getFixtureDate() {
    return fixtureDate;
  }

  public void setFixtureDate(java.util.Date fixtureDate) {
    this.fixtureDate = fixtureDate;
  }


  public Integer getSalesLeadsId() {
    return salesLeadsId;
  }

  public void setSalesLeadsId(Integer salesLeadsId) {
    this.salesLeadsId = salesLeadsId;
  }


  public Integer getContractId() {
    return contractId;
  }

  public void setContractId(Integer contractId) {
    this.contractId = contractId;
  }


  public String getOrderState() {
    return orderState;
  }

  public void setOrderState(String orderState) {
    this.orderState = orderState;
  }


  public Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
  }


  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }


  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

}
