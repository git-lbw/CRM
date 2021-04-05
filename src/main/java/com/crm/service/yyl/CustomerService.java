package com.crm.service.yyl;

import com.crm.dao.yyl.CustomerDao;
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
}
