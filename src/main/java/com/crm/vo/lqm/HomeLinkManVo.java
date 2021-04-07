package com.crm.vo.lqm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HomeLinkManVo {
    private String liName;
    private String cuName;
    private String staffName;
    private java.sql.Date liTime;
    private String liPhone;
}
