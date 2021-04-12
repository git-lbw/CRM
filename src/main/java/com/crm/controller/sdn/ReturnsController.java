package com.crm.controller.sdn;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.crm.entities.CommonResult;
import com.crm.entities.Returns;
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

import java.sql.Date;
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

    //添加回款计划
    @GetMapping("/addReturns")
    public RestContent addReturns(Returns returns){
        returns.setRBeenp(0);
        returns.setRBeenm(0);
        returns.setRDate(new Date(System.currentTimeMillis()));
        Boolean addReturns=returnsService.addReturns(returns);
        return returnContent.getContent(addReturns,"添加成功！","添加失败！");
    }

    //根据合同id查询是否有该回款计划
    @GetMapping("/findReturnsByContractId")
    public RestContent findReturnsByContractId(Integer contractId){
        List<Returns> returns = returnsService.findReturnsByContractId(contractId);
        return returnContent.getContent(returns,"添加成功！","添加失败！");
    };

    //查询回款计划
    @GetMapping("/findAllReturns")
    public RestContent findAllReturns(Integer pageNum,Integer size,String search){
        ReturnsVo returnsVo= JSONObject.toJavaObject(JSON.parseObject(search),ReturnsVo.class);
        Map<String,Object> map = new HashMap<String, Object>();
        Page<Object> page = PageHelper.startPage(pageNum,size);
        List<ReturnsVo> returns = returnsService.findAllReturns(returnsVo);
        map.put("rows",returns);
        map.put("total",page.getTotal());
        return returnContent.getContent(map,"查询成功！","查询失败！");
    }


    /*饼状视图*/
    @GetMapping("/findReturnsV")
    @ResponseBody
    public List<ReturnsVo> findReturnsView(@RequestParam("pieValue") String pieValue){
        return returnsService.findReturnsView(pieValue);
    }


}
