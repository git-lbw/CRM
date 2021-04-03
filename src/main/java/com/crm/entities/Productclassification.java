package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Productclassification {

  private Integer productclassificationId;
  private String productclassificationName;


  public Integer getProductclassificationId() {
    return productclassificationId;
  }

  public void setProductclassificationId(Integer productclassificationId) {
    this.productclassificationId = productclassificationId;
  }


  public String getProductclassificationName() {
    return productclassificationName;
  }

  public void setProductclassificationName(String productclassificationName) {
    this.productclassificationName = productclassificationName;
  }

}
