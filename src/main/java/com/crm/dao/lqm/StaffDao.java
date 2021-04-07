package com.crm.dao.lqm;


import com.crm.entities.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StaffDao {
    /**
     * 根据id查询员工
     * @param id
     * @return
     */
    @Select("select * from staff where staff_id=#{id}")
    public Staff getStaffById(@Param("id") int id);

    /**
     * 查询所有员工
     * @return
     */
    @Select("select * from staff")
    public List<Staff> getAllStaff();


    /**
     * 员工登录
     * @param account
     * @param password
     * @return
     */
    @Select("select * from staff where staff_account=#{account} and staff_password=#{password}")
    public Staff staffLogin(@Param("account") String account, @Param("password") String password);
}
