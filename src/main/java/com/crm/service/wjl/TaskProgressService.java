package com.crm.service.wjl;

import com.crm.entities.TaskProgress;

import java.util.List;

public interface TaskProgressService {
    //任务进展查询
    public List<TaskProgress> selectTaskProgressAll(int taskId);

    //添加任务进展
    public void addTaskProgress(TaskProgress taskProgress);

    //删除任务进展
    public void deleteTaskProgress(int progressId);
}
