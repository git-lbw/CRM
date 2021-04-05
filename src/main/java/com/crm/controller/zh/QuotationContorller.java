package com.crm.controller.zh;

import com.crm.entities.Quotation;
import com.crm.service.zh.impl.ImplQuotationService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import com.crm.vo.zh.QuotationVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/zh")
public class QuotationContorller {
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private ImplQuotationService quotationService;

    @GetMapping("/getQuotationBySalesLeadsId") //查询该销售机会关联的报价单
    public RestContent getQuotationById(Integer salesLeadsId) {
        List<QuotationVo> quotationVos = quotationService.getQuotationBySalesLeadsId(salesLeadsId);
        log.info("结果"+quotationVos);
        return returnContent.getContent(quotationVos,"数据获取成功","数据获取失败");
    }

    @GetMapping("/addQuotation")//新增报价单
    public RestContent addQuotation(Quotation quotation) {
        quotation.setQuoteStage("考虑中");
        quotation.setQuoteDate(new Date());
        quotation.setCreateTime(new Timestamp(new Date().getTime()));
        boolean addresult=quotationService.addQuotation(quotation);
        log.info("结果"+addresult);
        List<QuotationVo> quotationVos = quotationService.getQuotationBySalesLeadsId(quotation.getSalesLeadsId());
        return returnContent.getContent(quotationVos,"数据获取成功","数据获取失败");
    }

    @GetMapping("/getQuotationAll")//查询所有报价单
    public RestContent getQuotationAll() {
        List<QuotationVo> quotationVos = quotationService.getQuotationAll();
        log.info("结果"+quotationVos);
        return returnContent.getContent(quotationVos,"数据获取成功","数据获取失败");
    }

    @GetMapping("/updateQuotation")//修改报价单
    public RestContent updateQuotation(Quotation quotation) {
        quotation.setUpdateTime(new Timestamp(new Date().getTime()));
        boolean addresult=quotationService.updateQuotation(quotation);
        log.info("结果"+addresult);
        List<QuotationVo> quotationVos = quotationService.getQuotationAll();
        return returnContent.getContent(quotationVos,"数据获取成功","数据获取失败");
    }
}
