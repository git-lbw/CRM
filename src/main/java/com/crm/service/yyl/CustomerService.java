package com.crm.service.yyl;

import com.crm.dao.yyl.CustomerDao;
import com.crm.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class CustomerService {
    @Autowired
    CustomerDao customerDao;
    //查询客户和客户公海
    public List<Map<String,Object>> customer_all(){
        return customerDao.customer_all();
    }
    //查询所有
    public List<Map<String,Object>> customer_select(){
        return customerDao.customer_select();
    }
    //查询客户名称
    public List<Map<String,Object>> customer_name(String cuName){
        return customerDao.customer_name(cuName);
    }
    //查询客户公海所有
    public List<Map<String,Object>> customer_selecthight(){
        return customerDao.customer_selecthight();
    }
    //查询客户公海名称
    public List<Map<String,Object>> customer_hightname(String cuNames){
        return customerDao.customer_hightname(cuNames);
    }
    //高级查询客户
    public List<Map<String,Object>> customer_advanced(String cuTime,String cuTimes,String cuState,String cuSource,String cuHigh,String cuRank){
        return customerDao.customer_advanced(cuTime, cuTimes, cuState, cuSource, cuHigh, cuRank);
    }
    //客户新增
    public void cutomer_insert(Customer customer){
        customerDao.cutomer_insert(customer);
    }
    //客户修改
    public void cutomer_update(Customer customer){
        customerDao.cutomer_update(customer);
    }
    //客户归回客户公海
    public void cutomer_flyback(Integer cuId){
        customerDao.cutomer_flyback(cuId);
    }

    //重新分配负责人
    public void cutomer_allocation(Integer staffId,Integer cuId){
        customerDao.cutomer_allocation(staffId, cuId);
    }
}
