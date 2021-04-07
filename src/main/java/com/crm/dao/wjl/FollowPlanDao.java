package com.crm.dao.wjl;

import com.crm.entities.Customer;
import com.crm.entities.FollowPlan;
import com.crm.entities.Resources;
import com.crm.vo.wjl.FollowPlanResourcesVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 跟进计划 mapper接口
 */
@Mapper
public interface FollowPlanDao {

    //查询所有计划
    public List<FollowPlan> selectAll();

    //根据类型删除计划
    public void deletePlan(int planId);

    //查询计划资源
    public String getResources(int resourcesId);

    //查询计划资源名称
//    public List<Customer> getResourcesName(String resou);

    //根据id查询资源数据i
    public List<Customer> getCustomerById(int rid);

    //新增跟进计划
    public int addPlan(FollowPlan followPlan);




}
