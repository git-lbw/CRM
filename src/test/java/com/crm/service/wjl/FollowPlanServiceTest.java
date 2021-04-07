package com.crm.service.wjl;

import com.crm.entities.FollowPlan;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class FollowPlanServiceTest {

    //    @Resource
//    FollowPlanDao followPlanDao;

    @Resource
    FollowPlanService followPlanService;

    @Test
    void selectAll() {
        List<FollowPlan> followPlans = followPlanService.selectAll();
        Assert.assertNotNull(followPlans);
        Assert.assertEquals(followPlans.get(0).getPlanContent(), "星期二干活");
    }

    @Test
    void deletePlan() {
    }


}