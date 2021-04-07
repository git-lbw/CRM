package com.crm.vo.zh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesReturnVo {

    private Integer salesReturnId;
    private String salesReturnName;
    private Integer orderId;
    private String orderName;
    private double orderMoney;
    private Integer staffId;
    private String staffName;
    private Integer cuId;
    private String cuName;
    private java.sql.Date salesReturnDate;
    private String salesReturnsCause;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String operator;
    private String notes;
}
