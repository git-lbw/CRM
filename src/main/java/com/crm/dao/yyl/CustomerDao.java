package com.crm.dao.yyl;

import com.crm.entities.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface CustomerDao {
    //查询客户和客户公海
    public List<Customer> customer_all();

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
                                                      @Param("cuRank") String cuRank,
                                                      @Param("cuName") String cuName);

    //新增客户
    public void cutomer_insert(Customer customer);

    //编辑客户
    public void cutomer_update(Customer customer);

    //客户归回客户公海
    public void cutomer_flyback(@Param("cuId") Integer cuId);

    //重新分配负责人
    public void cutomer_allocation(@Param("staffId") Integer staffId,
                                   @Param("cuId") Integer cuId);
    //查询客户编号
    public Customer customer_num(@Param("cuId") Integer cuId);
}
