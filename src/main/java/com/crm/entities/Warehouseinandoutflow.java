package com.crm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Warehouseinandoutflow {
  private Integer receiptdeliveryflowingwaterId;
  private Integer productId;
  private Integer receiptdeliveryId;
  private Integer inoutQuantity;

  public Integer getReceiptdeliveryflowingwaterId() {
    return receiptdeliveryflowingwaterId;
  }

  public void setReceiptdeliveryflowingwaterId(Integer receiptdeliveryflowingwaterId) {
    this.receiptdeliveryflowingwaterId = receiptdeliveryflowingwaterId;
  }

  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public Integer getReceiptdeliveryId() {
    return receiptdeliveryId;
  }

  public void setReceiptdeliveryId(Integer receiptdeliveryId) {
    this.receiptdeliveryId = receiptdeliveryId;
  }

  public Integer getInoutQuantity() {
    return inoutQuantity;
  }

  public void setInoutQuantity(Integer inoutQuantity) {
    this.inoutQuantity = inoutQuantity;
  }
}
