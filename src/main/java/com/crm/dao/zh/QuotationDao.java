package com.crm.dao.zh;

import com.crm.entities.Quotation;
import com.crm.vo.zh.QuotationVo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QuotationDao {
    //查询该销售机会关联的报价单
    public List<QuotationVo> getQuotationBySalesLeadsId(Integer salesLeadsId);
    //新增报价单
    public boolean addQuotation(Quotation quotation);
    //查询所有报价单
    public List<QuotationVo> getQuotationAll();
    //修改报价单
    public boolean updateQuotation(Quotation quotation);
    //删除报价单
    @Delete("DELETE FROM quotation WHERE quotation_id = #{quotationId}")
    public Boolean delQuotation(Integer quotationId);
}
