package com.crm.controller.lqm;

import com.crm.entities.Clue;
import com.crm.entities.Customer;
import com.crm.entities.Orders;
import com.crm.entities.SalesLeads;
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
        return returnContent.getContent(clues,"获取新增线索数据成功","获取新增线索数据失败");
    }
    @GetMapping("/getNewSalesOrderData")
    public RestContent NewSalesOrderData(){
        List<Orders> orders = homePageService.NewSalesOrderData();
        return returnContent.getContent(orders,"获取新增联系人数据成功","获取新增联系人数据失败");
    }
//    @GetMapping("/getNewOpportunityData")
//    public RestContent NewOpportunityData(){
//        List<SalesLeads> salesLeads = homePageService.NewOpportunityData();
//        return returnContent.getContent(salesLeads,"获取新增联系人数据成功","获取新增联系人数据失败");
//    }
//    @GetMapping("/getNewOpportunityData")
//    public RestContent NewOpportunityData(){
//        List<SalesLeads> salesLeads = homePageService.NewOpportunityData();
//        return returnContent.getContent(salesLeads,"获取新增联系人数据成功","获取新增联系人数据失败");
//    }
//    @GetMapping("/getNewOpportunityData")
//    public RestContent NewOpportunityData(){
//        List<SalesLeads> salesLeads = homePageService.NewOpportunityData();
//        return returnContent.getContent(salesLeads,"获取新增联系人数据成功","获取新增联系人数据失败");
//    }
//    @GetMapping("/getNewOpportunityData")
//    public RestContent NewOpportunityData(){
//        List<SalesLeads> salesLeads = homePageService.NewOpportunityData();
//        return returnContent.getContent(salesLeads,"获取新增联系人数据成功","获取新增联系人数据失败");
//    }
//    @GetMapping("/getNewOpportunityData")
//    public RestContent NewOpportunityData(){
//        List<SalesLeads> salesLeads = homePageService.NewOpportunityData();
//        return returnContent.getContent(salesLeads,"获取新增联系人数据成功","获取新增联系人数据失败");
//    }
}
