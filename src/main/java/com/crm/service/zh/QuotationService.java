package com.crm.service.zh;

import com.crm.entities.Quotation;
import com.crm.vo.zh.QuotationVo;

import java.util.List;

public interface QuotationService {
    //查询该销售机会关联的报价单
    public List<QuotationVo> getQuotationBySalesLeadsId(Integer salesLeadsId);
    //新增报价单
    public boolean addQuotation(Quotation quotation);
    //查询所有报价单
    public List<QuotationVo> getQuotationAll();
    //修改报价单
    public boolean updateQuotation(Quotation quotation);
}
