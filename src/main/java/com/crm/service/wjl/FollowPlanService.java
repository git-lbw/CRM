package com.crm.service.wjl;

import com.crm.entities.Customer;
import com.crm.entities.FollowPlan;
import com.crm.vo.wjl.FollowPlanResourcesVo;

import java.util.List;

public interface FollowPlanService {

    public List<FollowPlan> selectAll();

    //根据id删除计划
    public void deletePlan(int planId);

    //查询资源
    public String getResources(int resourcesId);

//    //查询客户
//    public List<Customer> getResourcesName(String resou);

    //根据id查询资源数据
    public List<Customer> getCustomerById(int rid);

    //新增跟进计划
    public int addPlan(FollowPlan followPlan);
}
