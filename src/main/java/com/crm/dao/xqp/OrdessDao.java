package com.crm.dao.xqp;

import com.crm.entities.Orders;
import com.crm.vo.xqp.YearVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrdessDao {

    //销售额
    @Select("select\n" +
            "      sum(case month(fixture_date) when '1'  then order_money else 0 end) as Jan,\n" +
            "      sum(case month(fixture_date) when '2'  then order_money else 0 end) as Feb,\n" +
            "      sum(case month(fixture_date) when '3'  then order_money else 0 end) as Mar,\n" +
            "      sum(case month(fixture_date) when '4'  then order_money else 0 end) as Apr,\n" +
            "      sum(case month(fixture_date) when '5'  then order_money else 0 end) as May,\n" +
            "      sum(case month(fixture_date) when '6'  then order_money else 0 end) as June,\n" +
            "      sum(case month(fixture_date) when '7'  then order_money else 0 end) as July,\n" +
            "      sum(case month(fixture_date) when '8'  then order_money else 0 end) as Aug,\n" +
            "      sum(case month(fixture_date) when '9'  then order_money else 0 end) as Sept,\n" +
            "      sum(case month(fixture_date) when '10' then order_money  else 0 end) as Oct,\n" +
            "      sum(case month(fixture_date) when '11' then order_money  else 0 end) as Nov,\n" +
            "      sum(case month(fixture_date) when '12' then order_money  else 0 end) as Dece\n" +
            " from orders\n" +
            " where year(fixture_date)=#{year};")
    YearVO dde(String year);

    //销售额年份
    List<String> getAll();

    //回款额
    @Select(" select\n" +
            "      sum(case month(re_date) when '1'  then re_beenm else 0 end) as Jan,\n" +
            "      sum(case month(re_date) when '2'  then re_beenm else 0 end) as Feb,\n" +
            "      sum(case month(re_date) when '3'  then re_beenm else 0 end) as Mar,\n" +
            "      sum(case month(re_date) when '4'  then re_beenm else 0 end) as Apr,\n" +
            "      sum(case month(re_date) when '5'  then re_beenm else 0 end) as May,\n" +
            "      sum(case month(re_date) when '6'  then re_beenm else 0 end) as June,\n" +
            "      sum(case month(re_date) when '7'  then re_beenm else 0 end) as July,\n" +
            "      sum(case month(re_date) when '8'  then re_beenm else 0 end) as Aug,\n" +
            "      sum(case month(re_date) when '9'  then re_beenm else 0 end) as Sept,\n" +
            "      sum(case month(re_date) when '10' then re_beenm  else 0 end) as Oct,\n" +
            "      sum(case month(re_date) when '11' then re_beenm  else 0 end) as Nov,\n" +
            "      sum(case month(re_date) when '12' then re_beenm  else 0 end) as Dece\n" +
            " from record\n" +
            " where year(re_date)=#{year}")
    YearVO hke(String year);

    //回款额年份
    List<String> getyear();

    //客户数
    @Select("select MONTH(cu_time),count(1) from customer where YEAR(cu_time) = #{year} GROUP BY MONTH(cu_time);")
    List<Map<String,Long>> khs(String year);

    //机会数
    @Select("select MONTH(create_time),count(1) from sales_leads where year(create_time)=#{year} group by month(create_time);\n")
    List<Map<String,Long>> jhs(String year);

    //订单数
    @Select("select MONTH(fixture_date),count(1) from orders where year(fixture_date)=#{year} group by month(fixture_date);\n")
    List<Map<String,Long>> dds(String year);

    //线索数
    @Select("select MONTH(cl_time),count(1) from clue where year(cl_time)=#{year} group by month(cl_time);\n")
    List<Map<String,Long>> xss(String year);

    //top10客户
    @Select("\n" +
            "select  c.cu_name,o.order_money\n" +
            "from orders o \n" +
            "left join customer c\n" +
            "on o.cu_id=c.cu_id\n" +
            "where year(o.fixture_date)=#{year}\n" +
            "ORDER BY o.order_money asc\n" +
            "LIMIT 10")
    List<Map<String,Long>> top10(String year);

    //合同书
    @Select("select MONTH(create_time),count(1) from contract where year(create_time)=#{year} group by month(create_time);\n")
    List<Map<String,Long>> hts(String year);

    //产品销售
    @Select("\tselect p.product_name,p.product_price from orders o\n" +
            "\t\t\t\t\t\tinner join order_details od on o.order_id=od.order_id\n" +
            "\t\t\t\t\t\tinner join product p on od.product_id=p.product_id\n" +
            "\t\t\t\t\t\twhere year(o.fixture_date)=#{year}\n" +
            "            ORDER BY p.product_price desc\n" +
            "            LIMIT 10")
    List<Map<String,Long>> cp(String year);

    //销售漏斗
    @Select("select c.sales_state as name,count(1) as value from sales_leads c where year(create_time)=#{yeara} group by c.sales_state;\n")
    List<Map<String,Long>> xsld(String year);

    //查询所有订单
//    @Select("select * from orders o\n" +
//            "left join staff s on o.staff_id=s.staff_id\n" +
//            "left join customer c on o.cu_id=c.cu_id\n" +
//            "where year(o.fixture_date)=#{year}")
//    List<Orders> orderall(String year);

    //查询客户年份
    List<String> getkhyear();

    //查询订单年份
    List<String> getddyear();

    //查询线索年份
    List<String> getxsyear();

    //查询top10客户年份
    List<String> gettopyear();

    //查询合同年份
    List<String> gethtyear();

    //查询漏斗年份
    List<String> getldyear();

    //查询产品销售年份
    List<String> getcpxsyear();

    //查询机会年份
    List<String> getjhyear();

    //回款分页查询
    @Select("\tselect * from returns r \n" +
            "\t\t\t\tleft join contract c on r.contract_id=c.contract_id\n" +
            "\t\t\t\tleft join staff s on c.staff_id=s.staff_id\n" +
            "\t\t\t\tleft join customer cc on  c.cu_id=cc.cu_id\n" +
            "\t\t\t\tleft join record rr on rr.r_id=r.r_id\n" +
            "\t\t\t\twhere year(rr.re_date)=#{year}")
    List<Map<Object,String>> hikuai(String year);

    //客户TOP10分页
    @Select("select  * \n"+
            "from orders o \n" +
            "left join customer c\n" +
            "on o.cu_id=c.cu_id\n" +
            "left join staff s on o.staff_id=s.staff_id\n" +
            "where year(o.fixture_date)=#{year}\n" +
            "ORDER BY o.order_money desc")
    List<Map<Object,Object>> top(String year);

    //合同分页
    @Select("\t\t\t\t\n" +
            "select * from contract c \n" +
            "left join staff s on c.staff_id=s.staff_id\n" +
            "left join customer cc on c.cu_id=cc.cu_id\n" +
            "where year(c.create_time)=#{year}")
    List<Map<Object,String>> hetong(String year);

    //销售漏斗分页
    @Select("select * from sales_leads s \n" +
            "left join staff ss on s.staff_id=ss.staff_id\n" +
            "left join customer c on s.cu_id=c.cu_id\n" +
            "where year(create_time)=#{year}")
    List<Map<Object,String>> xiaoshould(String year);

    //产品销售分页
    @Select("\tselect * from orders o\n" +
            "\t\t\t\t\t\tinner join staff s on o.staff_id=s.staff_id\n" +
            "\t\t\t\t\t\tinner join customer c on  o.cu_id=c.cu_id\n" +
            "\t\t\t\t\t\tinner join order_details od on o.order_id=od.order_id\n" +
            "\t\t\t\t\t\tinner join product p on od.product_id=p.product_id\n" +
            "\t\t\t\t\t\twhere year(o.fixture_date)=#{year}")
    List<Map<Object,String>> chanping(String year);



}
