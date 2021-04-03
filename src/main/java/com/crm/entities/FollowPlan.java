package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FollowPlan {

  private Integer planId;
  private Integer resourcesId;
  private Integer rid;
  private Integer planState;
  private String planContent;
  private Timestamp planTime;
  private String madeBy;
  private Integer planType;
  private Timestamp createTime;


  public Integer getPlanId() {
    return planId;
  }

  public void setPlanId(Integer planId) {
    this.planId = planId;
  }


  public Integer getResourcesId() {
    return resourcesId;
  }

  public void setResourcesId(Integer resourcesId) {
    this.resourcesId = resourcesId;
  }


  public Integer getRid() {
    return rid;
  }

  public void setRid(Integer rid) {
    this.rid = rid;
  }


  public Integer getPlanState() {
    return planState;
  }

  public void setPlanState(Integer planState) {
    this.planState = planState;
  }


  public String getPlanContent() {
    return planContent;
  }

  public void setPlanContent(String planContent) {
    this.planContent = planContent;
  }


  public Timestamp getPlanTime() {
    return planTime;
  }

  public void setPlanTime(Timestamp planTime) {
    this.planTime = planTime;
  }


  public String getMadeBy() {
    return madeBy;
  }

  public void setMadeBy(String madeBy) {
    this.madeBy = madeBy;
  }


  public Integer getPlanType() {
    return planType;
  }

  public void setPlanType(Integer planType) {
    this.planType = planType;
  }


  public Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
  }

}
