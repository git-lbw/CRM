package com.crm.controller.yyl;

import com.crm.service.yyl.PrincipallService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrincipalController {
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    PrincipallService principallService;
    //查询所有
    @RequestMapping("/staffs_select")
    public RestContent select(){
        return returnContent.getContent(principallService.select(),"数据获取成功","数据获取失败");
    }
    //查询名字
    @RequestMapping("/staffs_name")
    public RestContent staff_name(Integer staffId){
        return returnContent.getContent(principallService.staff_name(staffId),"数据获取成功","数据获取失败");
    }
}
