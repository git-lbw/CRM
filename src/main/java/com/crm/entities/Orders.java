package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
  private java.sql.Date startDate;
  private java.sql.Date fixtureDate;
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


  public java.sql.Date getStartDate() {
    return startDate;
  }

  public void setStartDate(java.sql.Date startDate) {
    this.startDate = startDate;
  }


  public java.sql.Date getFixtureDate() {
    return fixtureDate;
  }

  public void setFixtureDate(java.sql.Date fixtureDate) {
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
