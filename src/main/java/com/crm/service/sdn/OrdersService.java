package com.crm.service.sdn;

import com.crm.dao.sdn.SdnOrdersDao;
import com.crm.vo.sdn.OrdersVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 *按订单汇总
 */
@Service
@Transactional
public class OrdersService {
    @Autowired
    SdnOrdersDao sdnOrdersDao;

    //查询所有订单
    public List<OrdersVo> findAllOrders(String contractName){
        return sdnOrdersDao.findAllOrders(contractName);
    }
}
