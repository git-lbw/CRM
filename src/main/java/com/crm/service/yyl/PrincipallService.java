package com.crm.service.yyl;


import com.crm.dao.lqm.StaffDao;
import com.crm.dao.yyl.PrincipalDao;
import com.crm.entities.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PrincipallService {
    @Autowired
    PrincipalDao principalDao;
    //查询所有
    public List<Staff> select(){
        return principalDao.select();
    }
    //查询名称
    public Staff staff_name(Integer staffId){
        return principalDao.staff_name(staffId);
    }
}
