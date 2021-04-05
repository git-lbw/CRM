package com.crm.dao.zh;

import com.crm.entities.SalesLeads;
import com.crm.vo.zh.SalesLeadsVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface SalesLeadsDao {
    //查询所有销售机会
    public List<SalesLeadsVo> selectAll();
    //新增销售机会
    public boolean addSalesLead(SalesLeads salesLeads);
    //修改销售机会信息
    public boolean updateSalesLead(SalesLeads salesLeads);
}
