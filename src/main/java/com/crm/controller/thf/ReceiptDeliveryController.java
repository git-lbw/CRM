package com.crm.controller.thf;

import com.crm.entities.Receiptdelivery;
import com.crm.service.thf.impl.ImpReceiptdeliveryService;
import com.crm.vo.thf.InsertReceiptDeliveryVo;
import com.crm.vo.thf.ReceiptdeliveryVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/receiptDelivery")
public class ReceiptDeliveryController {
    @Autowired
    private ImpReceiptdeliveryService impReceiptdeliveryService;

    //查询所有出入库单信息
    @GetMapping("/findAllReceiptDelivery")
    public @ResponseBody
    List<ReceiptdeliveryVo> findAllReceiptDelivery(){
        return impReceiptdeliveryService.getAllReceiptDeliveryVo();
    }

    //新增出入库单、出入库流水
    @GetMapping("/insretReceiptDelivery")
    public @ResponseBody
    List<ReceiptdeliveryVo> insertReceiptDelivery(InsertReceiptDeliveryVo insertReceiptDeliveryVo){
        impReceiptdeliveryService.insertReceiptDeliveryVo(insertReceiptDeliveryVo, insertReceiptDeliveryVo.getProductId(), insertReceiptDeliveryVo.getInoutQuantity());
        return impReceiptdeliveryService.getAllReceiptDeliveryVo();
    }
}