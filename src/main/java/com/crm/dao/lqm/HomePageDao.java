package com.crm.dao.lqm;

import com.crm.entities.*;
import com.crm.vo.lqm.HomeLinkManVo;
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
    public List<HomeLinkManVo> NewContactData();
    /**
     * 查询本月新增销售机会
     * @return
     */
    @Select("select * from sales_leads WHERE DATE_FORMAT( create_time, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' )")
    public List<SalesLeads> NewOpportunityData();
    /**
     * 查询本月新增线索
     * @return
     */
    @Select("SELECT * FROM clue WHERE DATE_FORMAT( cl_time, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' )")
    public List<Clue> NewClueData();
    /**
     * 查询本月新增销售订单
     * @return
     */
    @Select("SELECT * FROM orders WHERE DATE_FORMAT( create_time, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' )")
    public List<Orders> NewSalesOrderData();
    /**
     * 查询本月新增销售额
     * @return
     */
    @Select("SELECT * FROM orders WHERE order_state!='未开始' and DATE_FORMAT( create_time, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' )")
    public List<Orders> NewSalesData();
    /**
     * 查询本月新增回款额
     * @return
     */

    public List<Customer> NewPaymentData();
    /**
     * 查询近期创建市场活动
     * @return
     */
    @Select("select * from activity")
    public List<Activity> CreateActivity();
    /**
     * 查询未跟进线索
     * @return
     */
    @Select("SELECT * FROM clue WHERE cl_follow='未联系' and DATE_FORMAT( cl_time, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' )")
    public List<Clue> getNoFollowClue();
    /**
     * 查询未跟进联系人
     * @return
     */
    @Select("SELECT * from customer where cu_state = '' or ISNULL(cu_state)")
    public List<Customer> getNoFollowCustomer();
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
