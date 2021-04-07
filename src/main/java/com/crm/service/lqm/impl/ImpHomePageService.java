package com.crm.service.lqm.impl;

import com.crm.dao.lqm.HomePageDao;
import com.crm.entities.Clue;
import com.crm.entities.Customer;
import com.crm.entities.Orders;
import com.crm.entities.SalesLeads;
import com.crm.service.lqm.HomePageService;
import com.crm.vo.lqm.HomeLinkManVo;
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

    @Override
    public List<HomeLinkManVo> NewContactData() {
        return homePageDao.NewContactData();
    }

    @Override
    public List<SalesLeads> NewOpportunityData() {
        return homePageDao.NewOpportunityData();
    }

    @Override
    public List<Clue> NewClueData() {
        return homePageDao.NewClueData();
    }

    @Override
    public List<Orders> NewSalesOrderData() {
        return homePageDao.NewSalesOrderData();
    }
}
