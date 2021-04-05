package com.crm.controller.wjl;


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
@RequestMapping("/followrecord")
public class FollowRecordController {

    @Autowired
    private ReturnContent returnContent;

    @Autowired
    private FollowRecordService followRecordService;

   //查询所有更进记录
    @GetMapping("/getfollow/{page}/{limit}")
    public RestContent getStaffById(@PathVariable int page,@PathVariable int limit){
        Page<FollowRecordVo> pa = PageHelper.startPage(page, limit);
        List<FollowRecordVo> list= followRecordService.SelectRecordAll();
        long total=pa.getTotal();
         // BeanUtils.copyProperties(list.get(i),voss1);
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("list", list);
        map.put("total", total);
        return returnContent.getContent(map,"数据获取成功","数据获取失败");
    }

    //新增跟进记录
    @PostMapping("/addfollowrecord")
    public void getRecordById(@RequestBody FollowRecordVo followRecordVo){
        followRecordService.addFollowRecord(followRecordVo);
    }

    //删除单个跟进记录
    @DeleteMapping("/deletefollowrecord/{id}")
    public void deleteRecord(@PathVariable int id){
        followRecordService.deleteFollowRecord(id);
    }
}
