package com.crm.controller.zh;

import com.crm.entities.SalesLeads;
import com.crm.service.zh.impl.ImplSalesLeadsService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import com.crm.vo.zh.SalesLeadsVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


@RestController
@Slf4j
@RequestMapping("/zh")
public class SalesLeadsContorller {
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private ImplSalesLeadsService salesLeadsService;

    @GetMapping("/selectSalesLeadAll")//查询所有销售机会
    public RestContent selectAll() {
        List<SalesLeadsVo> salesLeadsVos = salesLeadsService.selectAll();
        log.info("结果"+salesLeadsVos);
        return returnContent.getContent(salesLeadsVos,"数据获取成功","数据获取失败");
    }

    @GetMapping("/addSalesLead")//新增销售机会
    public RestContent selectAll(SalesLeads salesLeads) {
        salesLeads.setSalesState("初期");
        salesLeads.setCreateTime(new Timestamp(new Date().getTime()));
        boolean addresult=salesLeadsService.addSalesLead(salesLeads);
        log.info("结果"+addresult);
        List<SalesLeadsVo> salesLeadsVos = salesLeadsService.selectAll();
        return returnContent.getContent(salesLeadsVos,"数据获取成功","数据获取失败");
    }

    @GetMapping("/updateSalesLead")//修改销售机会信息
    public RestContent updateSalesLead(SalesLeads salesLeads) {
        salesLeads.setUpdateTime(new Timestamp(new Date().getTime()));
        boolean updateresult=salesLeadsService.updateSalesLead(salesLeads);
        log.info("结果"+updateresult);
        List<SalesLeadsVo> salesLeadsVos = salesLeadsService.selectAll();
        return returnContent.getContent(salesLeadsVos,"数据获取成功","数据获取失败");
    }
}
