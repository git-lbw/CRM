package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesLeads {

  private Integer salesLeadsId;
  private String chanceName;
  private String chanceType;
  private Integer staffId;
  private Integer cuId;
  private double estimatedAmount;
  private String salesState;
  private Timestamp createTime;
  private Timestamp updateTime;
  private String operator;
  private String notes;


  public Integer getSalesLeadsId() {
    return salesLeadsId;
  }

  public void setSalesLeadsId(Integer salesLeadsId) {
    this.salesLeadsId = salesLeadsId;
  }


  public String getChanceName() {
    return chanceName;
  }

  public void setChanceName(String chanceName) {
    this.chanceName = chanceName;
  }


  public String getChanceType() {
    return chanceType;
  }

  public void setChanceType(String chanceType) {
    this.chanceType = chanceType;
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


  public double getEstimatedAmount() {
    return estimatedAmount;
  }

  public void setEstimatedAmount(double estimatedAmount) {
    this.estimatedAmount = estimatedAmount;
  }


  public String getSalesState() {
    return salesState;
  }

  public void setSalesState(String salesState) {
    this.salesState = salesState;
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
