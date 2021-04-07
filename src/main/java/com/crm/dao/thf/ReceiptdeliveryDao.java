package com.crm.dao.thf;

import com.crm.entities.Receiptdelivery;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReceiptdeliveryDao {
    //新增出入库单
    @Insert("insert into receiptdelivery value(null,#{receiptdeliveryName},#{inventoryactionId},#{otalquantity},#{staffId},#{receiptdeliveryData},#{orderId})")
    void insertReceiptdelivery(Receiptdelivery receiptdelivery);
}
