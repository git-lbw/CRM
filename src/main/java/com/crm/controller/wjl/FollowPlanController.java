package com.crm.controller.wjl;


import com.crm.entities.FollowPlan;
import com.crm.service.wjl.FollowPlanService;
import com.crm.service.wjl.FollowRecordService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import com.crm.vo.wjl.FollowRecordVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
跟进记录 前端控制器
 */
@RestController
@Slf4j
@RequestMapping("/follow")
public class FollowPlanController {

    @Autowired
    private ReturnContent returnContent;

    @Autowired
    private FollowPlanService followPlanService;

    //查询所有跟进计划
    @GetMapping("/getplan/{page}/{limit}")
    public RestContent getPlanById(@PathVariable int page,@PathVariable int limit){
        Page<FollowPlan> pa = PageHelper.startPage(page, limit);
        List<FollowPlan>  list= followPlanService.selectAll();
        long total=pa.getTotal();

        Map<String, Object> map=new HashMap<String, Object>();
        map.put("list", list);
        map.put("total", total);
        return returnContent.getContent(map,"数据获取成功","数据获取失败");
    }

    //取消更进计划
    @DeleteMapping("/deleteplan/{planId}")
    public void deletePlan(@PathVariable int planId){
        followPlanService.deletePlan(planId);
    }

    //资源获取
    @GetMapping("/get/{resourcesId}")
    public RestContent getPlan(@PathVariable int resourcesId){
        return returnContent.getContent(followPlanService.getResources(resourcesId),"数据获取成功","数据获取失败");
    }
//    //获得关联资源
//    @GetMapping("/getresou/{resou}")
//    public RestContent getPlansou(@PathVariable String resou){
//        return returnContent.getContent(followPlanService.getResourcesName(resou),"数据获取成功","数据获取失败");
//    }

    //客户资源
    @GetMapping("/getCustomer/{rid}")
    public RestContent getPlanCustomer(@PathVariable int rid){
        return returnContent.getContent(followPlanService.getCustomerById(rid),"数据获取成功","数据获取失败");
    }

    //新建跟进计划
    @GetMapping("/addPlan")
    public RestContent addPlan(FollowPlan followPlan){
        return returnContent.getContent(followPlanService.addPlan(followPlan),"数据获取成功","数据获取失败");
    }




}
