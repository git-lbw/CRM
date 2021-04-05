package com.crm.controller.thf;

import com.crm.entities.Receiptdelivery;
import com.crm.service.thf.ReceiptdeliveryService;
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
    private ReceiptdeliveryService receiptdeliveryService;

    //查询所有出入库单信息
    @GetMapping("findAllReceiptDelivery")
    public @ResponseBody
    List<ReceiptdeliveryVo> findAllProduct(){
        return receiptdeliveryService.getAllReceiptDeliveryVo();
    }
}
