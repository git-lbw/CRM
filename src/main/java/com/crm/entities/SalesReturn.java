package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesReturn {

  private Integer salesReturnId;
  private String salesReturnName;
  private Integer orderId;
  private java.sql.Date salesReturnDate;
  private String salesReturnsCause;
  private Timestamp createTime;
  private Timestamp updateTime;
  private String operator;
  private String notes;


  public Integer getSalesReturnId() {
    return salesReturnId;
  }

  public void setSalesReturnId(Integer salesReturnId) {
    this.salesReturnId = salesReturnId;
  }


  public String getSalesReturnName() {
    return salesReturnName;
  }

  public void setSalesReturnName(String salesReturnName) {
    this.salesReturnName = salesReturnName;
  }


  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }


  public java.sql.Date getSalesReturnDate() {
    return salesReturnDate;
  }

  public void setSalesReturnDate(java.sql.Date salesReturnDate) {
    this.salesReturnDate = salesReturnDate;
  }


  public String getSalesReturnsCause() {
    return salesReturnsCause;
  }

  public void setSalesReturnsCause(String salesReturnsCause) {
    this.salesReturnsCause = salesReturnsCause;
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
