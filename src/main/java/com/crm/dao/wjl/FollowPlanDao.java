package com.crm.dao.wjl;

import com.crm.entities.FollowPlan;
import com.crm.entities.Resources;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 跟进计划 mapper接口
 */
@Mapper
public interface FollowPlanDao {

    //查询所有计划
    public List<FollowPlan> selectAll();

    //根据类型删除计划
    public void deletePlan(int planId);

}
