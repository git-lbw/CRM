package com.crm.service.wjl;

import com.crm.entities.Staff;
import com.crm.entities.Task;
import com.crm.vo.wjl.TaskVo;

import java.util.List;

public interface TaskService {

    public List<Task> SelectTaskAll(String taskName);

    //删除我负责的任务
    public int deleteTaskById(int id);

    //完成任务
    public int wcTaskById(int id);

    //查询单个任务
    public Task getTaskById(int id);

    //查询所有员工
    public List<Staff> getStaffAll();

    //新增任务
    public int addTask(Task task);

    //修改任务
    public int xiugaiTask(Task task);

    //查询所有任务及其员工
    public List<TaskVo> selectAll(String taskName);

}
