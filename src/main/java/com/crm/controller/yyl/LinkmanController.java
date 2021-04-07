package com.crm.controller.yyl;

import com.crm.entities.Customer;
import com.crm.entities.Linkman;
import com.crm.entities.Staff;
import com.crm.service.yyl.CustomerService;
import com.crm.service.yyl.LinkmanService;
import com.crm.service.yyl.PrincipallService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class LinkmanController {
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    LinkmanService linkmanService;
    @Autowired
    PrincipallService pr;
    @Autowired
    CustomerService cu;
    //查询所欲
    @RequestMapping("/linkman_select")
    public RestContent linkman_select(){
        return returnContent.getContent(linkmanService.linkman_select(),"数据获取成功","数据获取失败");
    }
    //模糊查询名称
    @RequestMapping("/linkman_name")
    public RestContent linkman_name(String liName){
        return returnContent.getContent(linkmanService.linkman_name(liName),"数据获取成功","数据获取失败");
    }
    //新增
    @RequestMapping("/linkman_increased")
    public void linkman_increased(Linkman ruleForm){
        if(ruleForm.getLiId()==null){
            Staff st=pr.staff_name(ruleForm.getStaffId());
            Customer c=cu.customer_num(ruleForm.getCuId());
            linkmanService.linkman_increased(ruleForm);
        }else {
            linkmanService.linkman_amend(ruleForm);
        }
    }

}
