package com.crm.controller.yyl;

import com.crm.dao.yyl.CustomerDao;
import com.crm.service.yyl.CustomerService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    private ReturnContent returnContent;
    //查询客户所有
    @RequestMapping("/Customer_select")
    public RestContent customer_select(){
        return returnContent.getContent(customerService.customer_select(),"数据获取成功","数据获取失败");
    }
    //查询客户名称
    @RequestMapping("/Customer_Name")
    public RestContent customer_name(String cuName){
        return returnContent.getContent(customerService.customer_name(cuName),"数据获取成功","数据获取失败");
    }
    //查询客户公海所有
    @RequestMapping("/Customer_selecthight")
    public RestContent customer_selecthight(){
        return returnContent.getContent(customerService.customer_selecthight(),"数据获取成功","数据获取失败");
    }
    //查询客户公海名称
    @RequestMapping("/Customer_hightname")
    public RestContent customer_hightname(String cuNames){
        return returnContent.getContent(customerService.customer_hightname(cuNames),"数据获取成功","数据获取失败");
    }
    //高级查询客户
    @RequestMapping("/customer_advanced")
    public RestContent customer_advanced(String cuTime,String cuTimes,String cuState,String cuSource,String cuHigh,String cuRank){
        return returnContent.getContent(customerService.customer_advanced(cuTime, cuTimes, cuState, cuSource, cuHigh, cuRank),"数据获取成功","数据获取失败");
    }
}
