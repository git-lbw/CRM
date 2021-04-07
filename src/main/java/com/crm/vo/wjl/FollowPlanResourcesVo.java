package com.crm.vo.wjl;

import com.crm.entities.Customer;

import java.sql.Timestamp;

public class FollowPlanResourcesVo {
    private Integer planId;
    private Integer resourcesId;
    private Integer rid;
    private Integer planState;
    private String planContent;
    private Timestamp planTime;
    private String madeBy;
    private Integer planType;
    private Timestamp createTime;
    private String staffName;

    @Override
    public String toString() {
        return "FollowPlanResourcesVo{" +
                "planId=" + planId +
                ", resourcesId=" + resourcesId +
                ", rid=" + rid +
                ", planState=" + planState +
                ", planContent='" + planContent + '\'' +
                ", planTime=" + planTime +
                ", madeBy='" + madeBy + '\'' +
                ", planType=" + planType +
                ", createTime=" + createTime +
                ", staffName='" + staffName + '\'' +
                '}';
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public FollowPlanResourcesVo(Integer planId, Integer resourcesId, Integer rid, Integer planState, String planContent, Timestamp planTime, String madeBy, Integer planType, Timestamp createTime, String staffName) {
        this.planId = planId;
        this.resourcesId = resourcesId;
        this.rid = rid;
        this.planState = planState;
        this.planContent = planContent;
        this.planTime = planTime;
        this.madeBy = madeBy;
        this.planType = planType;
        this.createTime = createTime;
        this.staffName = staffName;
    }


    public FollowPlanResourcesVo() {
    }

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
