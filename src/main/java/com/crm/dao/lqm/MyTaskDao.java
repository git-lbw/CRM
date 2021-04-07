package com.crm.dao.lqm;

import com.crm.entities.Task;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MyTaskDao {
    /**
     * 根据id和任务代办状态id查询此负责人所有的待办事项或未办事项
     * @param uid
     * @param state
     * @return
     */
    @Select("select * from task where staff_id=#{uid} and task_to = #{state}")
    public List<Task> getMyaTask(@Param("uid") int uid, @Param("state") int state);
}
