package com.crm.controller.zh;


import com.crm.entities.Contract;
import com.crm.entities.Orders;
import com.crm.service.zh.impl.ImplContractService;
import com.crm.service.zh.impl.ImplOrdersService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import com.crm.vo.zh.ContractVo;
import com.crm.vo.zh.OrdersVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/zh")
public class OrdersContorller {
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private ImplOrdersService ordersService;
    @Autowired
    private ImplContractService contractService;

    @GetMapping("/getOrderAll") //查询所有销售订单
    public RestContent getOrderAll() {
        List<OrdersVo> ordersVos = ordersService.getOrderAll();
        log.info("结果"+ordersVos);
        return returnContent.getContent(ordersVos,"数据获取成功","数据获取失败");
    }

    @GetMapping("/getOrderBySalesLeadsId") //查询该机会关联的订单表
    public RestContent getOrderBySalesLeadsId(Integer salesLeadsId) {
        List<OrdersVo> ordersVos = ordersService.getOrderBySalesLeadsId(salesLeadsId);
        log.info("结果"+ordersVos);
        return returnContent.getContent(ordersVos,"数据获取成功","数据获取失败");
    }

    @GetMapping("/updateSalesOrder") //编辑订单信息
    public RestContent updateSalesOrder(Orders orders) {
        ordersService.updateOrder(orders);
        ContractVo contract = contractService.getContractByContractId(orders.getContractId());
        contract.setContractMoney(contract.getContractMoney()+orders.getOrderMoney());
        contractService.updateContract(contract);
        List<OrdersVo> ordersVos = ordersService.getOrderAll();
        return returnContent.getContent(ordersVos,"数据获取成功","数据获取失败");
    }

    @GetMapping("/getOrderByContractId") //根据销售合同id查询销售订单
    public RestContent getOrderByContractId(Integer contractId) {
        List<OrdersVo> ordersVos = ordersService.getOrderByContractId(contractId);
        log.info("结果"+ordersVos);
        return returnContent.getContent(ordersVos,"数据获取成功","数据获取失败");
    }
}
