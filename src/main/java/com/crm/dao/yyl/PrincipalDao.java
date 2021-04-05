package com.crm.dao.yyl;

import com.crm.entities.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PrincipalDao {
    //查询所有
    public List<Staff> select();
    //查询名字
    public Staff staff_name(@Param("staffId") Integer staffId);
}
