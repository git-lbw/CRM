package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resources {

  private Integer resourcesId;
  private String resourcesName;


  public Integer getResourcesId() {
    return resourcesId;
  }

  public void setResourcesId(Integer resourcesId) {
    this.resourcesId = resourcesId;
  }


  public String getResourcesName() {
    return resourcesName;
  }

  public void setResourcesName(String resourcesName) {
    this.resourcesName = resourcesName;
  }

}
