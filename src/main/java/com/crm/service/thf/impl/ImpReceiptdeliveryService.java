package com.crm.service.thf.impl;

import com.crm.dao.thf.ReceiptdeliveryVoDao;
import com.crm.service.thf.ReceiptdeliveryService;
import com.crm.vo.thf.ReceiptdeliveryVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ImpReceiptdeliveryService implements ReceiptdeliveryService {
    @Resource
    private ReceiptdeliveryVoDao receiptdeliveryVoDao;

    //查询所有出入库单信息
    @Override
    public List<ReceiptdeliveryVo> getAllReceiptDeliveryVo() {
        return receiptdeliveryVoDao.findAllReceiptdeliveryVo();
    }
}
