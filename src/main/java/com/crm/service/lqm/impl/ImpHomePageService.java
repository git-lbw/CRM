package com.crm.service.lqm.impl;

import com.crm.dao.lqm.HomePageDao;
import com.crm.entities.Customer;
import com.crm.service.lqm.HomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ImpHomePageService implements HomePageService {
    @Resource
    private HomePageDao homePageDao;

    @Override
    public List<Customer> NewCustomerData() {
        return homePageDao.NewCustomerData();
    }
}
