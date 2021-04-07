package com.crm.service.thf.impl;

import com.crm.dao.thf.ReceiptdeliveryDao;
import com.crm.dao.thf.ReceiptdeliveryVoDao;
import com.crm.dao.thf.WarehouseinandoutflowDao;
import com.crm.entities.Receiptdelivery;
import com.crm.entities.Warehouseinandoutflow;
import com.crm.service.thf.ReceiptdeliveryService;
import com.crm.vo.thf.InsertReceiptDeliveryVo;
import com.crm.vo.thf.ReceiptdeliveryVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class ImpReceiptdeliveryService implements ReceiptdeliveryService {
    @Resource
    private ReceiptdeliveryVoDao receiptdeliveryVoDao;

    @Resource
    private ReceiptdeliveryDao receiptdeliveryDao;

    @Resource
    private WarehouseinandoutflowDao warehouseinandoutflowDao;

    //查询所有出入库单信息
    @Override
    public List<ReceiptdeliveryVo> getAllReceiptDeliveryVo() {
        return receiptdeliveryVoDao.findAllReceiptdeliveryVo();
    }

    //新增出入库单、出入库流水
    @Override
    public void insertReceiptDeliveryVo(InsertReceiptDeliveryVo insertReceiptDeliveryVo,Integer[] productId,Integer[] inoutQuantity) {
        Receiptdelivery receiptdelivery = new Receiptdelivery();
        insertReceiptDeliveryVo.setInventoryactionId(2);
        Warehouseinandoutflow warehouseinandoutflow = new Warehouseinandoutflow();
        if (insertReceiptDeliveryVo.getInventoryactionId() == 1){
            receiptdelivery.setReceiptdeliveryName("RKD"+ UUID.randomUUID().toString());
        }else if (insertReceiptDeliveryVo.getInventoryactionId() == 2){
            receiptdelivery.setReceiptdeliveryName("CKD"+ UUID.randomUUID().toString());
        }
        receiptdelivery.setStaffId(insertReceiptDeliveryVo.getStaffId());
        receiptdelivery.setInventoryactionId(insertReceiptDeliveryVo.getInventoryactionId());
        receiptdelivery.setReceiptdeliveryData(new Date());
        receiptdelivery.setOrderId(insertReceiptDeliveryVo.getOrderId());
        receiptdelivery.setOtalquantity(insertReceiptDeliveryVo.getOtalQuantity());
        receiptdeliveryDao.insertReceiptdelivery(receiptdelivery);

        if (productId !=null){
            for (int value : productId) {
                for (int values: inoutQuantity) {
                    warehouseinandoutflow.setProductId(value);
                    warehouseinandoutflow.setInoutQuantity(values);
                    warehouseinandoutflow.setReceiptdeliveryId(insertReceiptDeliveryVo.getInventoryactionId());
                    warehouseinandoutflowDao.insertWarehouseinandoutflow(warehouseinandoutflow);
                }
            }
        }
    }
}
