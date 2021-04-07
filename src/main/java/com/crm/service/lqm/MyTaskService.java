package com.crm.service.lqm;

import com.crm.entities.Task;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MyTaskService {
    public List<Task> getMyaTask(@Param("uid") int uid, @Param("state") int state);
}
