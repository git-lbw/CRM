package com.crm.dao.wjl;

import com.crm.entities.Task;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 任务 mapper接口
 */
@Mapper
public interface TaskDao {
    //查询我负责的任务
    public List<Task> SelectTaskAll();

}
