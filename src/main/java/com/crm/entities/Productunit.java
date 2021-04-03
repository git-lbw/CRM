package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Productunit {

  private Integer productunitId;
  private String productunitNeme;


  public Integer getProductunitId() {
    return productunitId;
  }

  public void setProductunitId(Integer productunitId) {
    this.productunitId = productunitId;
  }


  public String getProductunitNeme() {
    return productunitNeme;
  }

  public void setProductunitNeme(String productunitNeme) {
    this.productunitNeme = productunitNeme;
  }

}
