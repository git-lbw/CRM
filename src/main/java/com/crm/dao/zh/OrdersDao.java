package com.crm.dao.zh;

import com.crm.entities.Orders;
import com.crm.vo.zh.OrdersVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrdersDao {
    //查询所有销售订单
    public List<OrdersVo> getOrderAll();
    //根据销售机会id查询
    public List<OrdersVo> getOrderBySalesLeadsId(Integer salesLeadsId);
    //根据销售订单id查询
    @Select("select * from orders as od,staff as st,customer as cu where od.staff_id=st.staff_id and od.cu_id=cu.cu_id and od.order_id=#{orderId}")
    public Orders getOrderByOrderId(Integer orderId);
    //修改订单
    public Boolean updateOrder(Orders orders);

    //根据年份查询
    List<OrdersVo> orderssall(String year);

    //客户数年份
    List<String> getkhyear();
}
