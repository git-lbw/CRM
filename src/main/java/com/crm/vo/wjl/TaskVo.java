package com.crm.vo.wjl;

import java.sql.Date;
import java.sql.Timestamp;

public class TaskVo {
    private Integer taskId;
    private Integer resourcesId;
    private Integer rid;
    private String taskName;
    private Integer staffId;
    private Timestamp createTime;
    private String taskExplain;
    private java.sql.Date byTime;
    private Integer taskState;
    private Integer createName;
    private java.sql.Date completeTime;
    private Integer taskTo;
    private String staffName;

    public TaskVo(Integer taskId, Integer resourcesId, Integer rid, String taskName, Integer staffId, Timestamp createTime, String taskExplain, Date byTime, Integer taskState, Integer createName, Date completeTime, Integer taskTo, String staffName) {
        this.taskId = taskId;
        this.resourcesId = resourcesId;
        this.rid = rid;
        this.taskName = taskName;
        this.staffId = staffId;
        this.createTime = createTime;
        this.taskExplain = taskExplain;
        this.byTime = byTime;
        this.taskState = taskState;
        this.createName = createName;
        this.completeTime = completeTime;
        this.taskTo = taskTo;
        this.staffName = staffName;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
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

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getTaskExplain() {
        return taskExplain;
    }

    public void setTaskExplain(String taskExplain) {
        this.taskExplain = taskExplain;
    }

    public Date getByTime() {
        return byTime;
    }

    public void setByTime(Date byTime) {
        this.byTime = byTime;
    }

    public Integer getTaskState() {
        return taskState;
    }

    public void setTaskState(Integer taskState) {
        this.taskState = taskState;
    }

    public Integer getCreateName() {
        return createName;
    }

    public void setCreateName(Integer createName) {
        this.createName = createName;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public Integer getTaskTo() {
        return taskTo;
    }

    public void setTaskTo(Integer taskTo) {
        this.taskTo = taskTo;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public TaskVo() {
    }

    @Override
    public String toString() {
        return "TaskVo{" +
                "taskId=" + taskId +
                ", resourcesId=" + resourcesId +
                ", rid=" + rid +
                ", taskName='" + taskName + '\'' +
                ", staffId=" + staffId +
                ", createTime=" + createTime +
                ", taskExplain='" + taskExplain + '\'' +
                ", byTime=" + byTime +
                ", taskState=" + taskState +
                ", createName=" + createName +
                ", completeTime=" + completeTime +
                ", taskTo=" + taskTo +
                ", staffName='" + staffName + '\'' +
                '}';
    }
}
