package com.crm.vo.thf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WarehouseFlowVo {
    private Integer receiptdeliveryflowingwaterId;
    private String receiptdeliveryName;
    private String productName;
    private String productclassificationName;
    private String productunitNeme;
    private String inventoryactionName;
    private java.sql.Date receiptdeliveryData;
    private Integer otalquantity;
    private String orderName;
    private String staffName;
}
