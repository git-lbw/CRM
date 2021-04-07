package com.crm.controller.lqm;

import com.crm.entities.Task;
import com.crm.service.lqm.MyTaskService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/lqm")
public class MyTaskController {
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private MyTaskService myTaskService;

    @GetMapping("/getMyTask/{uid}/{state}")
    public RestContent getMyTask(@PathVariable("uid")int uid,@PathVariable("state")int state){
        List<Task> myaTask = myTaskService.getMyaTask(uid, state);
        log.info(myaTask+"");
        return returnContent.getContent(myaTask,"任务获取成功","任务获取失败");
    }
}
