package com.crm.dao.sdn;

import com.crm.vo.sdn.OrdersVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 *按合同汇总
 */
@Mapper
@Repository
public interface SdnOrdersDao {
    //查询订单信息
    public List<OrdersVo> findAllOrders(String contractName);
}
