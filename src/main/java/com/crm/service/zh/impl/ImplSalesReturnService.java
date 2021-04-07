package com.crm.service.zh.impl;

import com.crm.dao.zh.SalesReturnDao;
import com.crm.entities.SalesReturn;
import com.crm.service.zh.SalesReturnService;
import com.crm.vo.zh.SalesReturnVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ImplSalesReturnService implements SalesReturnService {
    @Resource
    private SalesReturnDao salesReturnDao;

    @Override
    public List<SalesReturnVo> getSalesReturnAll() {
        return salesReturnDao.getSalesReturnAll();
    }

    @Override
    public Boolean updateSalesReturn(SalesReturn salesReturn) {
        return salesReturnDao.updateSalesReturn(salesReturn);
    }

    @Override
    public Boolean delSalesReturn(Integer salesReturnId) {
        return salesReturnDao.delSalesReturn(salesReturnId);
    }
}
