package com.crm.vo.thf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsertReceiptDeliveryVo {
    private Integer orderId;
    private Integer inventoryactionId;
    private Integer otalQuantity;
    private Integer staffId;
    private Integer[] productId;
    private Integer[] inoutQuantity;
}
