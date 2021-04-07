package com.crm.service.wjl.impl;

import com.crm.dao.wjl.TaskProgressDao;
import com.crm.entities.TaskProgress;
import com.crm.service.wjl.TaskProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class TaskProgressServiceImpl implements TaskProgressService {
    @Resource
    private TaskProgressDao taskProgressDao;

    @Override
    public List<TaskProgress> selectTaskProgressAll(int taskId) {
        return taskProgressDao.selectTaskProgressAll(taskId);
    }

    @Override
    public void addTaskProgress(TaskProgress taskProgress) {
        taskProgress.setCreateTime(new Timestamp(new Date().getTime()));
        taskProgressDao.addTaskProgress(taskProgress);
    }

    @Override
    public void deleteTaskProgress(int progressId) {
        taskProgressDao.deleteTaskProgress(progressId);
    }

}
