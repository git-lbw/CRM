package com.crm.service.zh;

import com.crm.entities.Orders;
import com.crm.vo.zh.OrdersVo;

import java.util.List;

public interface OrdersService {
    //查询所有销售订单
    public List<OrdersVo> getOrderAll();
    //根据销售机id会查询
    public List<OrdersVo> getOrderBySalesLeadsId(Integer salesLeadsId);
    //根据销售订单id查询
    public Orders getOrderByOrderId(Integer orderId);

    List<OrdersVo>orderssall(String year);

    List<String> getkhyear();
}
