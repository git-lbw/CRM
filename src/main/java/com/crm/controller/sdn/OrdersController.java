package com.crm.controller.sdn;

import com.crm.service.sdn.OrdersService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import com.crm.vo.sdn.OrdersVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *按订单汇总
 */
@RestController
@Slf4j
public class OrdersController {
    @Autowired
    private ReturnContent returnContent;

    @Autowired
    OrdersService ordersService;

    //查询所有订单
    @GetMapping("/findAllOrdersk")
    public RestContent findAllOrders(Integer pageNum, Integer size, String contractName){
        Map<String,Object> map=new HashMap<String, Object>();
        Page<Object> page=PageHelper.startPage(pageNum,size);
        List<OrdersVo> order=ordersService.findAllOrders(contractName);
        map.put("rows",order);
        map.put("total",page.getTotal());
        return returnContent.getContent(map,"查询成功！","查询失败");
    }


}
