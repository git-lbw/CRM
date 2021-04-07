package com.crm.service.lqm;

import com.crm.entities.*;
import com.crm.vo.lqm.HomeLinkManVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HomePageService {
    public List<Customer> NewCustomerData();

    public List<HomeLinkManVo> NewContactData();

    public List<SalesLeads> NewOpportunityData();

    public List<Clue> NewClueData();

    public List<Orders> NewSalesOrderData();

    public List<Orders> NewSalesData();

    public List<Activity> CreateActivity();

    public List<Clue> getNoFollowClue();

    public List<Customer> getNoFollowCustomer();
}
