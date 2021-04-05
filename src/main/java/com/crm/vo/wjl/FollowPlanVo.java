package com.crm.vo.wjl;

import java.sql.Timestamp;

public class FollowPlanVo {
    private Integer planId;
    private Integer resourcesId;
    private Integer rid;
    private Integer planState;
    private String planContent;
    private Timestamp planTime;
    private Integer planType;

    public FollowPlanVo(Integer planId, Integer resourcesId, Integer rid, Integer planState, String planContent, Timestamp planTime, Integer planType) {
        this.planId = planId;
        this.resourcesId = resourcesId;
        this.rid = rid;
        this.planState = planState;
        this.planContent = planContent;
        this.planTime = planTime;
        this.planType = planType;
    }

    public FollowPlanVo() {
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

    public Integer getPlanType() {
        return planType;
    }

    public void setPlanType(Integer planType) {
        this.planType = planType;
    }

    @Override
    public String toString() {
        return "FollowPlanVo{" +
                "planId=" + planId +
                ", resourcesId=" + resourcesId +
                ", rid=" + rid +
                ", planState=" + planState +
                ", planContent='" + planContent + '\'' +
                ", planTime=" + planTime +
                ", planType=" + planType +
                '}';
    }
}
