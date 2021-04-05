package com.crm.vo.zh;

import com.crm.entities.Customer;
import com.crm.entities.Staff;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesLeadsVo {
    private Integer salesLeadsId;
    private String chanceName;
    private String chanceType;
    private Integer staffId;
    private String staffName;
    private Integer cuId;
    private String cuName;
    private double estimatedAmount;
    private String salesState;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String operator;
    private String notes;
}
