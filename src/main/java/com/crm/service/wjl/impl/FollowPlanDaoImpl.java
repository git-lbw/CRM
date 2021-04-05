package com.crm.service.wjl.impl;

import com.crm.dao.wjl.FollowPlanDao;
import com.crm.entities.FollowPlan;
import com.crm.service.wjl.FollowPlanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FollowPlanDaoImpl implements FollowPlanService {

    @Resource
    private FollowPlanDao followPlanService;

    @Override
    public List<FollowPlan> selectAll() {
        return followPlanService.selectAll();
    }

    @Override
    public void deletePlan(int planId) {
        followPlanService.deletePlan(planId);
    }
}
