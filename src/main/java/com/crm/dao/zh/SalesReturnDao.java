package com.crm.dao.zh;

import com.crm.entities.SalesReturn;
import com.crm.vo.zh.SalesReturnVo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SalesReturnDao {
    //查询所有退货单
    public List<SalesReturnVo> getSalesReturnAll();
    //修改退货单
    public Boolean updateSalesReturn(SalesReturn salesReturn);
    //删除退货单
    @Delete("DELETE FROM sales_return WHERE sales_return_id = #{salesReturnId}")
    public Boolean delSalesReturn(Integer salesReturnId);
}
