package com.crm.dao.lqm;


import com.crm.entities.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StaffDao {
    public Staff getStaffById(@Param("id") int id);
}
