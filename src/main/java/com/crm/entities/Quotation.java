package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Quotation {

  private Integer quotationId;
  private String quotationName;
  private Integer salesLeadsId;
  private double quoteMoney;
  private String quoteStage;
  private java.sql.Date quoteDate;
  private Timestamp createTime;
  private Timestamp updateTime;
  private String operator;
  private String notes;


  public Integer getQuotationId() {
    return quotationId;
  }

  public void setQuotationId(Integer quotationId) {
    this.quotationId = quotationId;
  }


  public String getQuotationName() {
    return quotationName;
  }

  public void setQuotationName(String quotationName) {
    this.quotationName = quotationName;
  }


  public Integer getSalesLeadsId() {
    return salesLeadsId;
  }

  public void setSalesLeadsId(Integer salesLeadsId) {
    this.salesLeadsId = salesLeadsId;
  }


  public double getQuoteMoney() {
    return quoteMoney;
  }

  public void setQuoteMoney(double quoteMoney) {
    this.quoteMoney = quoteMoney;
  }


  public String getQuoteStage() {
    return quoteStage;
  }

  public void setQuoteStage(String quoteStage) {
    this.quoteStage = quoteStage;
  }


  public java.sql.Date getQuoteDate() {
    return quoteDate;
  }

  public void setQuoteDate(java.sql.Date quoteDate) {
    this.quoteDate = quoteDate;
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
