package com.crm.controller.sdn;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.crm.service.sdn.RecordService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import com.crm.vo.sdn.RecordVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *回款记录
 */
@RestController
@Slf4j
public class RecordController {
    @Autowired
    private ReturnContent returnContent;

    @Autowired
    RecordService recordService;

    //查询所有回款记录
   @GetMapping("/findAllrecords")
    public RestContent findAllRecord(Integer pageNum,Integer size,String contractName){
       Map<String,Object> map=new HashMap<String, Object>();
       Page<Object> page= PageHelper.startPage(pageNum,size);
       List<RecordVo> record=recordService.findAllRecord(contractName);
       map.put("rows",record);
       map.put("total",page.getTotal());
       return returnContent.getContent(map,"查询成功！","查询失败");
   }

    //查询所有回款计划
    @GetMapping("/findreturn")
    public RestContent findReturns(){
        return returnContent.getContent(recordService.findReturns(),"查询成功！","查询失败");

    }

    //新增回款记录
   @RequestMapping("/saveRecords")
    public void saveRecord(String huikuan){
       RecordVo re = JSONObject.toJavaObject(JSON.parseObject(huikuan),RecordVo.class);
       recordService.saveRecord(re);

   }




}
