package com.crm.service.lqm.impl;

import com.crm.dao.lqm.MyTaskDao;
import com.crm.entities.Task;
import com.crm.service.lqm.MyTaskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ImpMyTaskService implements MyTaskService {
    @Resource
    private MyTaskDao myTaskDao;
    @Override
    public List<Task> getMyaTask(int uid, int state) {
        return myTaskDao.getMyaTask(uid,state);
    }
}
