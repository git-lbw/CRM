package com.crm.service.lqm.impl;

import com.crm.dao.lqm.StaffDao;
import com.crm.entities.Staff;
import com.crm.service.lqm.StaffService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ImpStaffService implements StaffService {

    @Resource
    private StaffDao staffDao;

    public Staff getStaffById(int id) {
        return staffDao.getStaffById(id);
    }
}
