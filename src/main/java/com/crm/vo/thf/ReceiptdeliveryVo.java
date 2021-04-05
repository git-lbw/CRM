package com.crm.vo.thf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReceiptdeliveryVo {
    private Integer receiptdeliveryId;
    private String receiptdeliveryName;
    private Integer otalquantity;
    private String launchmode;
    private String staffName;
    private java.sql.Date receiptdeliveryData;
    private String inventoryactionName;
}
