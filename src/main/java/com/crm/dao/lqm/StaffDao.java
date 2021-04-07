package com.crm.dao.lqm;


import com.crm.entities.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StaffDao {

    @Select("select * from staff where staff_id=#{id}")
    public Staff getStaffById(@Param("id") int id);
}
