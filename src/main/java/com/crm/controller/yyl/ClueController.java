package com.crm.controller.yyl;

import com.crm.entities.Clue;
import com.crm.entities.Staff;
import com.crm.service.yyl.ClueService;
import com.crm.service.yyl.PrincipallService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ClueController {
    @Autowired
    ClueService clueService;
    @Autowired
    PrincipallService pr;
    @Autowired
    private ReturnContent returnContent;
    //查询所有
    @RequestMapping("/clue_select")
    public RestContent clue_select(){
        return returnContent.getContent(clueService.clue_select(),"数据获取成功","数据获取失败");
    }
    //查询线索名称
    @RequestMapping("/clue_selectName")
    public RestContent clue_name(String clName){
        return returnContent.getContent(clueService.clue_name(clName),"数据获取成功","数据获取失败");
    }
    //查询线索公海所有
    @RequestMapping("/clue_selecthight")
    public RestContent select_hight(){
        return returnContent.getContent(clueService.select_hight(),"数据获取成功","数据获取失败");
    }
    //查询线索公海名称
    @RequestMapping("/clue_hightname")
    public RestContent clue_namehight(String clNames){
        return returnContent.getContent(clueService.clue_namehight(clNames),"数据获取成功","数据获取失败");
    }

    //线索高级查询
    @RequestMapping("/clue_actCost")
    public RestContent clue_actCost(String clTime,String clTimes,String clFollow,String clSource,String clHigh,Integer clState){

        return returnContent.getContent(clueService.clue_actCost(clTime, clTimes, clFollow, clSource, clHigh, clState),"数据获取成功","数据获取失败");
    }

    //线索新增
    @RequestMapping("/clue_newly")
    public void newly(Clue ruleForm){
        if(ruleForm.getClId()==null){
            Staff st=pr.staff_name(ruleForm.getStaffId());
            clueService.clue_newly(ruleForm);
        }else {
            clueService.clue_compile(ruleForm);
        }
    }

    //回归线索公海/删除
    @RequestMapping("/clue_regression")
    public void clue_regression(Integer clId){
        clueService.clue_regression(clId);
    }
    //重新分配负责人
    @RequestMapping("/clue_allocation")
    public void clue_allocation(Integer staffId,Integer clId){
        clueService.clue_allocation(staffId, clId);
    }
}
