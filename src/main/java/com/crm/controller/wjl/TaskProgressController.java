package com.crm.controller.wjl;

import com.crm.entities.Task;
import com.crm.entities.TaskProgress;
import com.crm.service.wjl.TaskProgressService;
import com.crm.service.wjl.TaskService;
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

/**
 * 任务进展 前端控制器
 */
@RestController
@Slf4j
@RequestMapping("/taskprogress")
public class TaskProgressController {

    @Autowired
    private ReturnContent returnContent;

    @Autowired
    private TaskProgressService taskProgressService;

    //分页查询所有任务进展
    @GetMapping("/gettaskprogress/{page}/{limit}/{taskId}")
    public RestContent getStaffById(@PathVariable int page, @PathVariable int limit,@PathVariable int taskId){
        Page<TaskProgress> pa = PageHelper.startPage(page, limit);
        List<TaskProgress> list= taskProgressService.selectTaskProgressAll(taskId);
        long total=pa.getTotal();
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("list", list);
        map.put("total", total);
        log.info("结果"+list);
        return returnContent.getContent(map,"数据获取成功","数据获取失败");
    }

    //新增进展任务
    @GetMapping("/addTaskProgress")
    public void addTaskProgress( TaskProgress taskProgress){
        taskProgressService.addTaskProgress(taskProgress);
    }

    //删除进展任务
    @DeleteMapping("/addTaskProgress/{progressId}")
    public void deletePlan(@PathVariable int progressId){
        taskProgressService.deleteTaskProgress(progressId);
    }


}
