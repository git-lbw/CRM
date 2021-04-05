package com.crm.service.wjl;

import com.crm.entities.FollowPlan;

import java.util.List;

public interface FollowPlanService {

    public List<FollowPlan> selectAll();

    //根据id删除计划
    public void deletePlan(int planId);
}
