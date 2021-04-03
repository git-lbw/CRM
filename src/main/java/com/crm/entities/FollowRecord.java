package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FollowRecord {

  private Integer recordId;
  private Integer resourcesId;
  private Integer rid;
  private Integer recordType;
  private String recordContent;
  private Integer recordState;
  private Timestamp createTime;
  private Integer staffId;


  public Integer getRecordId() {
    return recordId;
  }

  public void setRecordId(Integer recordId) {
    this.recordId = recordId;
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


  public Integer getRecordType() {
    return recordType;
  }

  public void setRecordType(Integer recordType) {
    this.recordType = recordType;
  }


  public String getRecordContent() {
    return recordContent;
  }

  public void setRecordContent(String recordContent) {
    this.recordContent = recordContent;
  }


  public Integer getRecordState() {
    return recordState;
  }

  public void setRecordState(Integer recordState) {
    this.recordState = recordState;
  }


  public Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
  }


  public Integer getStaffId() {
    return staffId;
  }

  public void setStaffId(Integer staffId) {
    this.staffId = staffId;
  }

}
