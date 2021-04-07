package com.crm.service.lqm.impl;

import com.crm.dao.lqm.StaffDao;
import com.crm.entities.Staff;
import com.crm.service.lqm.StaffService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;

@SpringBootTest
class ImpStaffServiceTest {
    @Resource
    StaffDao staffDao;
    @Resource
    StaffService staffService;
    @Test
    void getStaffById() {
        Staff staff = staffService.getStaffById(1);
        Assert.assertNotNull(staff);
        Assert.assertEquals(staff.getStaffName(),"稂清明");
        Assert.assertEquals(staff.getStaffAccount(),"lqm001");
    }
}