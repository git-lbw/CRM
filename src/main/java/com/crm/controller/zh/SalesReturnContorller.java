package com.crm.controller.zh;

import com.crm.entities.SalesReturn;
import com.crm.service.zh.impl.ImplSalesReturnService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import com.crm.vo.zh.SalesReturnVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/zh")
public class SalesReturnContorller {
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private ImplSalesReturnService salesReturnService;

    @GetMapping("/getSalesReturnAll") //查询所有退货单
    public RestContent getSalesReturnAll() {
        List<SalesReturnVo> salesReturnVos = salesReturnService.getSalesReturnAll();
        log.info("结果"+salesReturnVos);
        return returnContent.getContent(salesReturnVos,"数据获取成功","数据获取失败");
    }

    @GetMapping("/updateSalesReturn")//修改退货单
    public RestContent updateSalesReturn(SalesReturn salesReturn) {
        salesReturn.setUpdateTime(new Timestamp(new Date().getTime()));
        boolean updateresult=salesReturnService.updateSalesReturn(salesReturn);
        log.info("结果"+updateresult);
        List<SalesReturnVo> salesReturnVos = salesReturnService.getSalesReturnAll();
        return returnContent.getContent(salesReturnVos,"数据获取成功","数据获取失败");
    }

    @GetMapping("/delSalesReturn")//删除退货单
    public RestContent delSalesReturn(Integer salesReturnId) {
        boolean delresult=salesReturnService.delSalesReturn(salesReturnId);
        log.info("结果"+delresult);
        List<SalesReturnVo> salesReturnVos = salesReturnService.getSalesReturnAll();
        return returnContent.getContent(salesReturnVos,"数据获取成功","数据获取失败");
    }
}
