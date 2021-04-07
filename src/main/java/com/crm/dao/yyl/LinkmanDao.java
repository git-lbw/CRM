package com.crm.dao.yyl;

import com.crm.entities.Linkman;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface LinkmanDao {
    //查询联系人所有
    public List<Map<String,Object>> linkman_select();
    //查询联系人名称
    public List<Map<String,Object>> linkman_name(@Param("liName") String liName);
    //新增
    public void linkman_increased(Linkman linkman);
    //修改
    public void linkman_amend(Linkman linkman);
}
