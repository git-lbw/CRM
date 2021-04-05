package com.crm.controller.wjl;



import com.crm.entities.Task;

import com.crm.service.wjl.TaskService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 任务 前端控制器
 */
@RestController
@Slf4j
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private ReturnContent returnContent;

    @Autowired
    private TaskService taskService;

    //分页查询所有任务
    @GetMapping("/gettask/{page}/{limit}")
    public RestContent getStaffById(@PathVariable int page, @PathVariable int limit){
        Page<Task> pa = PageHelper.startPage(page, limit);
        List<Task> list= taskService.SelectTaskAll();
        long total=pa.getTotal();
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("list", list);
        map.put("total", total);
        log.info("结果"+list);
        return returnContent.getContent(map,"数据获取成功","数据获取失败");
    }


}
