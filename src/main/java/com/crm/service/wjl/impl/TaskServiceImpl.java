package com.crm.service.wjl.impl;

import com.crm.dao.wjl.TaskDao;
import com.crm.entities.Staff;
import com.crm.entities.Task;
import com.crm.service.wjl.TaskService;
import com.crm.vo.wjl.TaskVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
@Service
public class TaskServiceImpl implements TaskService {

    @Resource
    private TaskDao taskDao;


    @Override
    public List<Task> SelectTaskAll(String taskName) {
        return taskDao.SelectTaskAll(taskName);
    }


    @Override
    public int deleteTaskById(int id) {
        return taskDao.deleteTaskById(id);
    }

    @Override
    public int wcTaskById(int id) {
        return taskDao.wcTaskById(id);
    }

    @Override
    public Task getTaskById(int id) {
        return taskDao.getTaskById(id);
    }

    @Override
    public List<Staff> getStaffAll() {
        return taskDao.getStaffAll();
    }

    @Override
    public int addTask(Task task) {
        task.setCreateTime(new Timestamp(new Date().getTime()));
        return taskDao.addTask(task);
    }



    @Override
    public int xiugaiTask(Task task) {
        task.setCreateTime(new Timestamp(new Date().getTime()));
        return taskDao.xiugaiTask(task);
    }

    @Override
    public List<TaskVo> selectAll(String name) {
        return taskDao.selectAll(name);
    }




}
