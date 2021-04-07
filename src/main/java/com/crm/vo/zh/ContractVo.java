package com.crm.vo.zh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContractVo {

    private Integer contractId;
    private String contractName;
    private Integer staffId;
    private String staffName;
    private Integer cuId;
    private String cuName;
    private double contractMoney;
    private java.sql.Date startDate;
    private java.sql.Date endDate;
    private Integer returnedNumber;
    private Integer billingState;
    private String contractState;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String operator;
    private String notes;
}
