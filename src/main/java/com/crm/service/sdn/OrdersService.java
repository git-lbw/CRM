package com.crm.service.sdn;


import com.crm.dao.sdn.SdnOrdersDao;
import com.crm.vo.sdn.OrdersVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
/**
 *按订单汇总
 */
@Service
@Transactional
public class OrdersService {
    @Autowired
    SdnOrdersDao ordersDao;

    //查询所有订单
    public List<OrdersVo> findAllOrders(OrdersVo ordersVo){
        return ordersDao.findAllOrders(ordersVo);
    }

    //合同状态视图
    public List<OrdersVo> findContractView(String pieValue) {
        List<OrdersVo> list = new ArrayList<>();
        if (pieValue.equals("合同状态")) {
            list = ordersDao.findContractView();
            list.forEach(c -> {
                if (c.getType().equals("未开始")) {
                    c.setType("未开始");
                } else if (c.getType().equals("进行中")) {
                    c.setType("进行中");
                } else if (c.getType().equals("已结束")) {
                    c.setType("已结束");
                }
            });
        }
        return list;
    }

}
