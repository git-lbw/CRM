package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

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


  public java.sql.Date getByTime() {
    return byTime;
  }

  public void setByTime(java.sql.Date byTime) {
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


  public java.sql.Date getCompleteTime() {
    return completeTime;
  }

  public void setCompleteTime(java.sql.Date completeTime) {
    this.completeTime = completeTime;
  }


  public Integer getTaskTo() {
    return taskTo;
  }

  public void setTaskTo(Integer taskTo) {
    this.taskTo = taskTo;
  }

}
