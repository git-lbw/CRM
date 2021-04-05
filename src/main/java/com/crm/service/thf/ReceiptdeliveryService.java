package com.crm.service.thf;

import com.crm.entities.Receiptdelivery;
import com.crm.vo.thf.ReceiptdeliveryVo;

import java.util.List;

public interface ReceiptdeliveryService {
    //查询所有出入库单
    List<ReceiptdeliveryVo> getAllReceiptDeliveryVo();
}
