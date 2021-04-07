package com.crm.service.lqm;

import com.crm.entities.Staff;
import org.springframework.stereotype.Service;

@Service
public interface StaffService {
    public Staff getStaffById(int id);
}
