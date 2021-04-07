package com.crm.service.zh;

import com.crm.entities.SalesLeads;
import com.crm.vo.zh.SalesLeadsVo;

import java.util.List;

public interface SalesLeadsService {
    //查询所有销售机会
    public List<SalesLeadsVo> selectAll();
    //新增销售机会
    public boolean addSalesLead(SalesLeads salesLeads);
    //修改销售机会信息
    public boolean updateSalesLead(SalesLeads salesLeads);
    //根据年份查询所有机会
    public List<SalesLeadsVo> jhall(String year) ;

}
