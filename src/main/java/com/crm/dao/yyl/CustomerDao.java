package com.crm.dao.yyl;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface CustomerDao {
    //查询客户所有
    public List<Map<String,Object>> customer_select();
    //查询客户名称
    public List<Map<String,Object>> customer_name(@Param("cuName") String cuName);
    //查询客户公海所有
    public List<Map<String,Object>> customer_selecthight();
    //查询客户公海名称
    public List<Map<String,Object>> customer_hightname(@Param("cuNames") String cuNames);
    //查询客户高级查询
    public List<Map<String,Object>> customer_advanced(@Param("cuTime") String cuTime,
                                                      @Param("cuTimes") String cuTimes,
                                                      @Param("cuState") String cuState,
                                                      @Param("cuSource") String cuSource,
                                                      @Param("cuHigh") String cuHigh,
                                                      @Param("cuRank") String cuRank);
}
