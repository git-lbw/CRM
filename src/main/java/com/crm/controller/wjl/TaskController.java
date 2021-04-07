package com.crm.controller.wjl;



import com.crm.entities.Task;

import com.crm.entities.TaskProgress;
import com.crm.service.wjl.TaskService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import com.crm.vo.wjl.TaskVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public RestContent getTaskById(@PathVariable int page, @PathVariable int limit, String taskName){
        Page<Task> pa = PageHelper.startPage(page, limit);
        List<Task> list= taskService.SelectTaskAll(taskName);
        long total=pa.getTotal();
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("list", list);
        map.put("total", total);
        log.info("结果"+list);
        return returnContent.getContent(map,"数据获取成功","数据获取失败");
    }

    //删除单个任务
    @DeleteMapping("/deletetask/{taskId}")
    public RestContent deleteTask(@PathVariable int taskId){
        return returnContent.getContent(taskService.deleteTaskById(taskId),"数据删除成功","数据删除失败");
    }

    //完成任务
    @GetMapping("/wctask/{taskId}")
    public RestContent wcTask(@PathVariable int taskId){
        return returnContent.getContent(taskService.wcTaskById(taskId),"数据修改成功","数据修改失败");
    }

    //查询单个任务信息
    @GetMapping("/dangtask/{taskId}")
    public RestContent dangtask(@PathVariable int taskId){
        return returnContent.getContent(taskService.getTaskById(taskId),"数据获取成功","数据获取失败");
    }

    //查询所有员工
    @GetMapping("/staff")
    public RestContent staffAll(){
        return returnContent.getContent(taskService.getStaffAll(),"数据获取成功","数据获取失败");
    }

    //新增任务
    @GetMapping("/addTask")
    public void addTaskProgress(Task task){
        taskService.addTask(task);
    }

    //修改任务
    @GetMapping("/xuagaiTask")
    public RestContent xuagaiTask(Task task){
        return returnContent.getContent(taskService.xiugaiTask(task),"数据获取成功","数据获取失败");
    }

    //查询所有任务
    @GetMapping("/gettaskAll/{page}/{limit}")
    public RestContent getStaffById(@PathVariable int page, @PathVariable int limit, String taskName){
        Page<TaskVo> pa = PageHelper.startPage(page, limit);
        List<TaskVo> list= taskService.selectAll(taskName);
        long total=pa.getTotal();
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("list", list);
        map.put("total", total);
        log.info("结果"+list);
        return returnContent.getContent(map,"数据获取成功","数据获取失败");
    }

}
