package com.crm.service.thf.impl;

import com.crm.dao.thf.WarehouseFlowVoDao;
import com.crm.service.thf.WarehouseFlowService;
import com.crm.vo.thf.WarehouseFlowVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ImpWarehouseFlowService implements WarehouseFlowService {
    @Resource
    private WarehouseFlowVoDao warehouseFlowVoDao;
    //查询所有出入库流水信息
    @Override
    public List<WarehouseFlowVo> findAllWarehouseFlowVo() {
        return warehouseFlowVoDao.findAllWarehouseFlowVo();
    }
}
