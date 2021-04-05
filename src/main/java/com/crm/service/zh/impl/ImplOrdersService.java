package com.crm.service.zh.impl;

import com.crm.dao.zh.OrdersDao;
import com.crm.service.zh.OrdersService;
import com.crm.vo.zh.OrdersVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ImplOrdersService implements OrdersService {
    @Resource
    private OrdersDao ordersDao;

    @Override
    public List<OrdersVo> getOrderAll() {
        return ordersDao.getOrderAll();
    }

    @Override
    public List<OrdersVo> getOrderBySalesLeadsId(Integer salesLeadsId) {
        return ordersDao.getOrderBySalesLeadsId(salesLeadsId);
    }
}
