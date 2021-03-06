package com.crm.controller.yyl;

import com.crm.dao.yyl.CustomerDao;
import com.crm.entities.Customer;
import com.crm.entities.Staff;
import com.crm.service.yyl.CustomerService;
import com.crm.service.yyl.PrincipallService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    PrincipallService pr;
    @Autowired
    private ReturnContent returnContent;
    //查询客户和客户公海
    @RequestMapping("/customer_all")
    public RestContent customer_all(){
        return returnContent.getContent(customerService.customer_all(),"数据获取成功","数据获取失败");
    }
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
    public RestContent customer_advanced(String cuTime,String cuTimes,String cuState,String cuSource,
                                         String cuHigh,String cuRank,String cuName){
        return returnContent.getContent(customerService.customer_advanced(cuTime, cuTimes, cuState, cuSource, cuHigh, cuRank,cuName),"数据获取成功","数据获取失败");
    }
    //新增客户
    @RequestMapping("/cutomer_insert")
    public void cutomer_insert(Customer ruleForm){
        if(ruleForm.getCuId()==null){
            Staff st=pr.staff_name(ruleForm.getStaffId());
            customerService.cutomer_insert(ruleForm);
        }else {
            customerService.cutomer_update(ruleForm);
        }
    }
    //客户回归到客户公海
    @RequestMapping("/cutomer_flyback")
    public void cutomer_flyback(Integer cuId){
        customerService.cutomer_flyback(cuId);
    }
    //重新分配到客户公海
    @RequestMapping("/cutomer_allocation")
    public void cutomer_allocation(Integer staffId,Integer cuId){
        customerService.cutomer_allocation(staffId, cuId);
    }
    //查询客户编号
    @RequestMapping("/customer_num")
    public RestContent customer_num(Integer cuId){
        return returnContent.getContent(customerService.customer_num(cuId),"数据获取成功","数据获取失败");
    }
}
