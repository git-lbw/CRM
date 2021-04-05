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
            "      sum(case month(re_date) when '1'  then re_money else 0 end) as Jan,\n" +
            "      sum(case month(re_date) when '2'  then re_money else 0 end) as Feb,\n" +
            "      sum(case month(re_date) when '3'  then re_money else 0 end) as Mar,\n" +
            "      sum(case month(re_date) when '4'  then re_money else 0 end) as Apr,\n" +
            "      sum(case month(re_date) when '5'  then re_money else 0 end) as May,\n" +
            "      sum(case month(re_date) when '6'  then re_money else 0 end) as June,\n" +
            "      sum(case month(re_date) when '7'  then re_money else 0 end) as July,\n" +
            "      sum(case month(re_date) when '8'  then re_money else 0 end) as Aug,\n" +
            "      sum(case month(re_date) when '9'  then re_money else 0 end) as Sept,\n" +
            "      sum(case month(re_date) when '10' then re_money  else 0 end) as Oct,\n" +
            "      sum(case month(re_date) when '11' then re_money  else 0 end) as Nov,\n" +
            "      sum(case month(re_date) when '12' then re_money  else 0 end) as Dece\n" +
            " from record\n" +
            " where year(re_date)=#{year}")
    YearVO hke(String year);

    //回款额年份
    List<String> getyear();

    @Select("select MONTH(cu_time),count(1) from customer where YEAR(cu_time) = #{year} GROUP BY MONTH(cu_time);")
    List<Map<String,Long>> khs(String year);

    @Select("select MONTH(create_time),count(1) from sales_leads where year(create_time)=#{year} group by month(create_time);\n")
    List<Map<String,Long>> jhs(String year);

    @Select("select MONTH(fixture_date),count(1) from orders where year(fixture_date)=#{year} group by month(fixture_date);\n")
    List<Map<String,Long>> dds(String year);

    @Select("select MONTH(cl_time),count(1) from clue where year(cl_time)=#{year} group by month(cl_time);\n")
    List<Map<String,Long>> xss(String year);

    @Select("\n" +
            "select  c.cu_name,o.order_money\n" +
            "from orders o \n" +
            "left join customer c\n" +
            "on o.cu_id=c.cu_id\n" +
            "where year(o.fixture_date)=#{year}\n" +
            "ORDER BY o.order_money asc\n" +
            "LIMIT 10")
    List<Map<String,Long>> top10(String year);

    @Select("select MONTH(create_time),count(1) from contract where year(create_time)=#{year} group by month(create_time);\n")
    List<Map<String,Long>> hts(String year);




}