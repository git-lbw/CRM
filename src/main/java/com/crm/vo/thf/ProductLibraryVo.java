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
    private String staffName;
    private String productunitNeme;
    private String inventorystatusName;
    private Integer inventoryQuantity;
    private Integer availableStock;
    private Integer lockInventory;
    private String productModel;
    private String productDescription;
    private java.sql.Date productCreationtime;
    private String productclassificationName;
    private double productPrice;
}
