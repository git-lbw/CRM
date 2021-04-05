package com.crm.vo.zh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuotationVo {

    private Integer quotationId;
    private String quotationName;
    private Integer salesLeadsId;
    private String chanceName;
    private Integer staffId;
    private String staffName;
    private Integer cuId;
    private String cuName;
    private double quoteMoney;
    private String quoteStage;
    private java.sql.Date quoteDate;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String operator;
    private String notes;
}
