package com.crm.service.lqm;

import com.crm.entities.Staff;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StaffService {
    public Staff getStaffById(int id);

    public List<Staff> getAllStaff();

    public Staff staffLogin(@Param("account") String account, @Param("password") String password);
}
