package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskProgress {

  private Integer progressId;
  private Integer taskId;
  private String progressContent;
  private Integer staffId;
  private Integer progressState;
  private Timestamp createTime;


  public Integer getProgressId() {
    return progressId;
  }

  public void setProgressId(Integer progressId) {
    this.progressId = progressId;
  }


  public Integer getTaskId() {
    return taskId;
  }

  public void setTaskId(Integer taskId) {
    this.taskId = taskId;
  }


  public String getProgressContent() {
    return progressContent;
  }

  public void setProgressContent(String progressContent) {
    this.progressContent = progressContent;
  }


  public Integer getStaffId() {
    return staffId;
  }

  public void setStaffId(Integer staffId) {
    this.staffId = staffId;
  }


  public Integer getProgressState() {
    return progressState;
  }

  public void setProgressState(Integer progressState) {
    this.progressState = progressState;
  }


  public Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
  }

}
