package com.crm.service.zh.impl;

import com.crm.dao.zh.QuotationDao;
import com.crm.entities.Quotation;
import com.crm.service.zh.QuotationService;
import com.crm.vo.zh.QuotationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ImplQuotationService implements QuotationService {
    @Resource
    private QuotationDao quotationDao;

    @Override
    public List<QuotationVo> getQuotationBySalesLeadsId(Integer salesLeadsId) {
        return quotationDao.getQuotationBySalesLeadsId(salesLeadsId);
    }

    @Override
    public boolean addQuotation(Quotation quotation) {
        return quotationDao.addQuotation(quotation);
    }

    @Override
    public List<QuotationVo> getQuotationAll() {
        return quotationDao.getQuotationAll();
    }

    @Override
    public boolean updateQuotation(Quotation quotation) {
        return quotationDao.updateQuotation(quotation);
    }

    @Override
    public Boolean delQuotation(Integer quotationId) {
        return quotationDao.delQuotation(quotationId);
    }
}
