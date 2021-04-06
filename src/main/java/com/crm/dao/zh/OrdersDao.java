package com.crm.dao.zh;

import com.crm.vo.zh.OrdersVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrdersDao {
    //查询所有销售订单
    public List<OrdersVo> getOrderAll();
    //根据销售机id会查询
    public List<OrdersVo> getOrderBySalesLeadsId(Integer salesLeadsId);

    //根据年份查询所有销售订单
    public List<OrdersVo> orderssall(String year);
}
