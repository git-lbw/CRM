package com.crm.controller.zh;

import com.crm.entities.Orders;
import com.crm.service.zh.impl.ImplContractService;
import com.crm.service.zh.impl.ImplOrdersService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import com.crm.vo.zh.ContractVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/zh")
public class ContractContorller {
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private ImplContractService contractService;
    @Autowired
    private ImplOrdersService ordersService;

    @GetMapping("/getContractAll") //查询所有销售合同
    public RestContent getContractAll() {
        List<ContractVo> contractVos = contractService.getContractAll();
        log.info("结果"+contractVos);
        return returnContent.getContent(contractVos,"数据获取成功","数据获取失败");
    }

    @GetMapping("/addContract") //新增销售合同
    public RestContent addContract(ContractVo contractVo) {
        Orders orders=ordersService.getOrderByOrderId(contractVo.getOrderId());
        contractVo.setContractMoney(orders.getOrderMoney());
        contractVo.setCreateTime(new Timestamp(new Date().getTime()));
        contractVo.setContractState("未开始");
        Boolean contractresult = contractService.addContract(contractVo);
        log.info("结果"+contractresult);
        List<ContractVo> contractVos = contractService.getContractAll();
        return returnContent.getContent(contractVos,"数据获取成功","数据获取失败");
    }
}
