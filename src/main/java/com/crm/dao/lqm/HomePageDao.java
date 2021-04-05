package com.crm.dao.lqm;

import com.crm.entities.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface HomePageDao {
    /**
     * 查询本月新增客户
     * @return
     */
    @Select("SELECT * from customer WHERE DATE_FORMAT( cu_time, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' )")
    public List<Customer> NewCustomerData();
    /**
     * 查询本月新增联系人
     * @return
     */
    public List<Customer> NewContactData();
    /**
     * 查询本月新增销售机会
     * @return
     */
    public List<Customer> NewOpportunityData();
    /**
     * 查询本月新增线索
     * @return
     */
    public List<Customer> NewClueData();
    /**
     * 查询本月新增销售订单
     * @return
     */
    public List<Customer> NewSalesOrderData();
    /**
     * 查询本月新增销售额
     * @return
     */
    public List<Customer> NewSalesData();
    /**
     * 查询本月新增回款额
     * @return
     */
    public List<Customer> NewPaymentData();
    /**
     * 查询近期创建客户
     * @return
     */
    public List<Customer> CreateCustomers();
    /**
     * 查询近期创建客户
     * @return
     */
    public List<Customer> CreateContact();
    /**
     * 查询近期创建客户
     * @return
     */
    public List<Customer> CreateOpportunity();
    /**
     * 查询近期创建客户
     * @return
     */
    public List<Customer> CreateClue();
    /**
     * 查询近期创建客户
     * @return
     */
    public List<Customer> CreateOrders();
    /**
     * 查询近期创建客户
     * @return
     */
    public List<Customer> CreateMarketing();
    /**
     * 查询未跟进线索
     * @return
     */
    public List<Customer> NoFollowClue();
    /**
     * 查询未跟进客户
     * @return
     */
    public List<Customer> NoFollowCustomer();
    /**
     * 查询未跟进机会
     * @return
     */
    public List<Customer> NoFollowOpportunity();
}
