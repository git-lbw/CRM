package com.crm.service.zh.impl;

import com.crm.dao.zh.SalesLeadsDao;
import com.crm.entities.SalesLeads;
import com.crm.service.zh.SalesLeadsService;
import com.crm.vo.zh.SalesLeadsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ImplSalesLeadsService implements SalesLeadsService {
    @Resource
    private SalesLeadsDao salesLeadsDao;

    @Override
    //查询所有销售机会
    public List<SalesLeadsVo> selectAll() {
        return salesLeadsDao.selectAll();
    }

    @Override
    //新增销售机会
    public boolean addSalesLead(SalesLeads salesLeads) {
        return salesLeadsDao.addSalesLead(salesLeads);
    }

    @Override
    //修改销售机会信息
    public boolean updateSalesLead(SalesLeads salesLeads) {
        return salesLeadsDao.updateSalesLead(salesLeads);
    }
}
