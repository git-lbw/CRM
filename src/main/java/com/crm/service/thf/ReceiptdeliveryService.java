package com.crm.service.thf;

import com.crm.entities.Receiptdelivery;
import com.crm.vo.thf.InsertReceiptDeliveryVo;
import com.crm.vo.thf.ReceiptdeliveryVo;

import java.util.List;

public interface ReceiptdeliveryService {
    //查询所有出入库单
    List<ReceiptdeliveryVo> getAllReceiptDeliveryVo();

    //新增出入库单、出入库流水
    void insertReceiptDeliveryVo(InsertReceiptDeliveryVo insertReceiptDeliveryVo,Integer[] productId,Integer[] inoutQuantity);
}
