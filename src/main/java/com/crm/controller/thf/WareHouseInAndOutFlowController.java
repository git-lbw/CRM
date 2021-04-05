package com.crm.controller.thf;

import com.crm.service.thf.WarehouseFlowService;
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
    private WarehouseFlowService warehouseFlowService;

    @GetMapping("findAllWarehouseFlow")
    public @ResponseBody
    List<WarehouseFlowVo> findAllWarehouseFlow(){
        return warehouseFlowService.findAllWarehouseFlowVo();
    }
}
