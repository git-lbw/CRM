package com.crm.vo.thf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductLibraryVo {
    private Integer productId;
    private String productName;
    private Integer staffId;
    private String staffName;
    private Integer productunitId;
    private String productunitNeme;
    private Integer inventorystatusId;
    private String inventorystatusName;
    private Integer inventoryQuantity;
    private Integer availableStock;
    private Integer lockInventory;
    private String productModel;
    private String productDescription;
    private java.sql.Date productCreationtime;
    private Integer productclassificationId;
    private String productclassificationName;
    private Double productPrice;
}
