package com.crm.controller.sdn;

import com.crm.entities.CommonResult;
import com.crm.service.sdn.ReturnsService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import com.crm.vo.sdn.ReturnsVo;
import com.crm.vo.sdn.TicketVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *回款计划
 */
@RestController
@Slf4j
public class ReturnsController {
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    ReturnsService returnsService;

    //查询回款计划
    @GetMapping("/findAllReturns")
    public RestContent findAllReturns(Integer pageNum,Integer size,String contractName){
        Map<String,Object> map = new HashMap<String, Object>();
        Page<Object> page = PageHelper.startPage(pageNum,size);
        List<ReturnsVo> returns = returnsService.findAllReturns(contractName);
        map.put("rows",returns);
        map.put("total",page.getTotal());
        return returnContent.getContent(map,"查询成功！","查询失败！");
    }


/*    @GetMapping("/findAllReturns")
    public RestContent findAllReturns(Integer pageNum,Integer size,String search){
        ReturnsVo returnsVo= JSONObject.toJavaObject(JSON.parseObject(search),ReturnsVo.class);
        Map<String,Object> map = new HashMap<String, Object>();
        Page<Object> page = PageHelper.startPage(pageNum,size);
        List<ReturnsVo> returns = returnsService.findAllReturns(returnsVo);
        map.put("rows",returns);
        map.put("total",page.getTotal());
        return returnContent.getContent(map,"查询成功！","查询失败！");
    }*/
/*
    //批量删除
    @RequestMapping("/deleAllreturns")
    public void deleReturns(@RequestBody List<ReturnsVo> returnsVos){
        returnsService.deleReturns(returnsVos);
    }
*/

}
