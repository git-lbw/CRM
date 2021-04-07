package com.crm.service.wjl.impl;

import com.crm.dao.wjl.FollowPlanDao;
import com.crm.entities.Customer;
import com.crm.entities.FollowPlan;
import com.crm.service.wjl.FollowPlanService;
import com.crm.vo.wjl.FollowPlanResourcesVo;
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

    @Override
    public String getResources(int resourcesId) {
        return followPlanService.getResources(resourcesId);
    }



    @Override
    public List<Customer> getCustomerById(int rid) {

        return followPlanService.getCustomerById(rid);
    }

    @Override
    public int addPlan(FollowPlan followPlan) {
        return followPlanService.addPlan(followPlan);
    }

}
