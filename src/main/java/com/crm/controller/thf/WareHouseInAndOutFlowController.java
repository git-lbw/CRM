package com.crm.controller.thf;

import com.crm.service.thf.WarehouseFlowService;
import com.crm.service.thf.impl.ImpWarehouseFlowService;
import com.crm.vo.thf.InsertReceiptDeliveryVo;
import com.crm.vo.thf.WarehouseFlowVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/wareHouseInAndOutFlowController")
public class WareHouseInAndOutFlowController {
    @Autowired
    private ImpWarehouseFlowService impWarehouseFlowService;

    @GetMapping("/findAllWarehouseFlow")
    public @ResponseBody
    List<WarehouseFlowVo> findAllWarehouseFlow(InsertReceiptDeliveryVo insertReceiptDeliveryVo){
        return impWarehouseFlowService.findAllWarehouseFlowVo();
    }
}
