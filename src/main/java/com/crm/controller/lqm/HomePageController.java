package com.crm.controller.lqm;

import com.crm.entities.*;
import com.crm.service.lqm.HomePageService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import com.crm.vo.lqm.HomeLinkManVo;
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
        log.info(customers+"");
        return returnContent.getContent(customers,"获取新增客户数据成功","获取新增客户数据失败");
    }
    @GetMapping("/getNewContactData")
    public RestContent NewContactData(){
        List<HomeLinkManVo> homeLinkManVos = homePageService.NewContactData();
        log.info(homeLinkManVos+"");
        return returnContent.getContent(homeLinkManVos,"获取新增联系人数据成功","获取新增联系人数据失败");
    }
    @GetMapping("/getNewOpportunityData")
    public RestContent NewOpportunityData(){
        List<SalesLeads> salesLeads = homePageService.NewOpportunityData();
        log.info(salesLeads+"");
        return returnContent.getContent(salesLeads,"获取新增销售机会数据成功","获取新增销售机会数据失败");
    }
    @GetMapping("/getNewClueData")
    public RestContent NewClueData(){
        List<Clue> clues = homePageService.NewClueData();
        log.info(clues+"");
        return returnContent.getContent(clues,"获取新增线索数据成功","获取新增线索数据失败");
    }
    @GetMapping("/getNewSalesOrderData")
    public RestContent NewSalesOrderData(){
        List<Orders> orders = homePageService.NewSalesOrderData();
        log.info(orders+"");
        return returnContent.getContent(orders,"获取新增销售订单数据成功","获取新增销售订单数据失败");
    }
    @GetMapping("/getNewSalesData")
    public RestContent NewSalesData(){
        List<Orders> orders = homePageService.NewSalesData();
        log.info(orders+"");
        return returnContent.getContent(orders,"获取新增销售额数据成功","获取新增销售额数据失败");
    }
    @GetMapping("/getNewActivity")
    public RestContent NewActivity(){
        List<Activity> activities = homePageService.CreateActivity();
        log.info(activities+"");
        return returnContent.getContent(activities,"获取新建市场活动成功","获取新建市场活动失败");
    }
    @GetMapping("/getNoFollowClue")
    public RestContent getNoFollowClue(){
        List<Clue> noFollowClue = homePageService.getNoFollowClue();
        log.info(noFollowClue+"");
        return returnContent.getContent(noFollowClue,"获取未跟进线索数据成功","获取未跟进线索数据失败");
    }
    @GetMapping("/getNoFollowCustomer")
    public RestContent getNoFollowCustomer(){
        List<Customer> noFollowCustomer = homePageService.getNoFollowCustomer();
        log.info(noFollowCustomer+"");
        return returnContent.getContent(noFollowCustomer,"获取未跟进客户数据成功","获取未跟进客户数据失败");
    }
//    @GetMapping("/getNewOpportunityData")
//    public RestContent NewOpportunityData(){
//        List<SalesLeads> salesLeads = homePageService.NewOpportunityData();
//        return returnContent.getContent(salesLeads,"获取新增联系人数据成功","获取新增联系人数据失败");
//    }
}
