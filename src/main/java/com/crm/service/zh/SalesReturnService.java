package com.crm.service.zh;

import com.crm.entities.SalesReturn;
import com.crm.vo.zh.SalesReturnVo;

import java.util.List;

public interface SalesReturnService {
    //查询所有退货单
    public List<SalesReturnVo> getSalesReturnAll();
    //修改退货单
    public Boolean updateSalesReturn(SalesReturn salesReturn);
    //删除退货单
    public Boolean delSalesReturn(Integer salesReturnId);
}
