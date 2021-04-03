package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventoryaction {

  private Integer inventoryactionId;
  private String inventoryactionName;


  public Integer getInventoryactionId() {
    return inventoryactionId;
  }

  public void setInventoryactionId(Integer inventoryactionId) {
    this.inventoryactionId = inventoryactionId;
  }


  public String getInventoryactionName() {
    return inventoryactionName;
  }

  public void setInventoryactionName(String inventoryactionName) {
    this.inventoryactionName = inventoryactionName;
  }

}
