package com.crm.service.lqm;

import com.crm.entities.Clue;
import com.crm.entities.Customer;
import com.crm.entities.Orders;
import com.crm.entities.SalesLeads;
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


}
