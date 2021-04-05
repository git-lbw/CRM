package com.crm.controller.lqm;

import com.crm.entities.Customer;
import com.crm.service.lqm.HomePageService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/lqm/homePage")
public class HomePageController {
    @Autowired
    private ReturnContent returnContent;
    @Resource
    private HomePageService homePageService;
    @GetMapping("/getNewCustomerData")
    public RestContent getNewCustomerData(){
        List<Customer> customers = homePageService.NewCustomerData();
        return returnContent.getContent(customers,"数据获取成功","数据获取失败");
    }
}
