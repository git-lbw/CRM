package com.crm.service.wjl.impl;

import com.crm.dao.wjl.TaskDao;
import com.crm.entities.Task;
import com.crm.service.wjl.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TaskServiceImpl implements TaskService {

    @Resource
    private TaskDao taskDao;


    @Override
    public List<Task> SelectTaskAll() {
        return taskDao.SelectTaskAll();
    }
}
