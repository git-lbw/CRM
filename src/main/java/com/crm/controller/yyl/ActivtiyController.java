package com.crm.controller.yyl;

import com.crm.entities.Activity;
import com.crm.entities.Staff;
import com.crm.service.yyl.ActivityService;
import com.crm.service.yyl.PrincipallService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import com.crm.vo.yyl.ActivityVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@RestController
public class ActivtiyController {
    @Autowired
    ActivityService activityService;
    @Autowired
    PrincipallService pr;
    @Autowired
    private ReturnContent returnContent;

    //查询所有
    @RequestMapping("/activity_select")
    public RestContent select(){
        return returnContent.getContent(activityService.select(),"数据获取成功","数据获取失败");
    }
    //查询市场活动名称
    @RequestMapping("/activity_vague")
    public RestContent vague(String acName){
        return returnContent.getContent(activityService.vague(acName),"数据获取成功","数据获取失败");
    }
    //高级查询
    @RequestMapping("/activity_actCost")
    public RestContent actCost(String acStarttime, String acStarttimes, String acType, Integer acState){

        return returnContent.getContent(activityService.actCost(acStarttime, acStarttimes, acType, acState),"数据获取成功","数据获取失败");
    }
    //新增
    @RequestMapping("/activity_add")
    public void add(Activity ruleForm){
        System.err.println("哈哈哈");
        System.err.println(ruleForm.getAcStarttime()+"开始时间");
        System.out.println(ruleForm.getStaffId()+"负责人");
            if(ruleForm.getAcId()==null){
                Staff st=pr.staff_name(ruleForm.getStaffId());
                activityService.add(ruleForm);
            }else {
                activityService.amend(ruleForm);
            }
    }
    //删除
    @RequestMapping("/activity_delect")
    public void cancel(Integer acId){
       activityService.cancel(acId);
    }
    //批量删除
    @RequestMapping("/activity_batch")
    public void upstate(@RequestBody List<ActivityVo> list){
        activityService.upstate(list);
    }
}
