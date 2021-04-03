package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventorystatus {

  private Integer inventorystatusId;
  private String inventorystatusName;


  public Integer getInventorystatusId() {
    return inventorystatusId;
  }

  public void setInventorystatusId(Integer inventorystatusId) {
    this.inventorystatusId = inventorystatusId;
  }


  public String getInventorystatusName() {
    return inventorystatusName;
  }

  public void setInventorystatusName(String inventorystatusName) {
    this.inventorystatusName = inventorystatusName;
  }

}
