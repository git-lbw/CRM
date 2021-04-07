package com.crm.service.thf;

import com.crm.vo.thf.InsertReceiptDeliveryVo;
import com.crm.vo.thf.WarehouseFlowVo;

import java.util.List;

public interface WarehouseFlowService {
    //查询所有出入库流水
    List<WarehouseFlowVo> findAllWarehouseFlowVo();


}
