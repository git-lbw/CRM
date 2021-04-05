package com.crm.vo.zh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersVo {

    private Integer orderId;
    private String orderName;
    private Integer staffId;
    private String staffName;
    private Integer cuId;
    private String cuName;
    private double orderMoney;
    private java.sql.Date startDate;
    private java.sql.Date fixtureDate;
    private Integer salesLeadsId;
    private String chanceName;
    private Integer contractId;
    private String contractName;
    private String orderState;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String operator;
    private String notes;
}
