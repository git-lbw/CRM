package com.crm.service.lqm;

import com.crm.entities.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HomePageService {
    public List<Customer> NewCustomerData();
}
