package com.crm.dao.wjl;

import com.crm.entities.TaskProgress;
import com.crm.vo.wjl.FollowRecordVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TaskProgressDao {
    //任务进展查询
    public List<TaskProgress> selectTaskProgressAll(int taskId);

    //添加任务进展
    public void addTaskProgress(TaskProgress taskProgress);

    //删除任务进展
    public void deleteTaskProgress(int progressId);

}
