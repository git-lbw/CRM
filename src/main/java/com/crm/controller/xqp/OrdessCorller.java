package com.crm.controller.xqp;

import com.alibaba.fastjson.JSONObject;
import com.crm.entities.Orders;
import com.crm.entities.Staff;
import com.crm.service.lqm.StaffService;
import com.crm.service.xqp.OrderssService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import com.crm.vo.xqp.YearVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/xqp")
public class OrdessCorller {
    @Autowired
    private ReturnContent returnContent;
    @Autowired
    private OrderssService orderssService;

    @GetMapping("/getmonth/{year}")
    public RestContent getmonth(@PathVariable("year") String year){
        System.out.println(year);
        YearVO yearVO = orderssService.getmonth(year);
        return returnContent.getContent(yearVO,"数据获取成功","数据获取失败");
    }

    @GetMapping("/getAll")
    public RestContent getmonth(){
        List<String> all = orderssService.getAll();
        return returnContent.getContent(all,"数据获取成功","数据获取失败");
    }

    @GetMapping("/hke/{year}")
    public RestContent hke(@PathVariable("year") String year){
        YearVO yearVO = orderssService.hke(year);
        return returnContent.getContent(yearVO,"数据获取成功","数据获取失败");
    }

    @GetMapping("/getyear")
    public RestContent getyear(){
        List<String> all = orderssService.getyear();
        return returnContent.getContent(all,"数据获取成功","数据获取失败");
    }

    @GetMapping("/khs/{year}")
    public RestContent khs(@PathVariable("year") String year){
        System.err.println(year);
        Map<Long,Long> map=new HashMap<>();
        List<Map<String,Long>> arr= orderssService.khs(year);
        for (Map<String, Long> stringStringMap : arr) {
            map.put(stringStringMap.get("MONTH(cu_time)"),stringStringMap.get("count(1)"));
        }
        for (Map.Entry<Long, Long> aLong : map.entrySet()) {
            System.err.println(aLong);
        }
        return returnContent.getContent(map,"数据获取成功","数据获取失败");
    }

    @GetMapping("/jhs/{year}")
    public RestContent jhs(@PathVariable("year") String year){
        System.err.println(year);
        Map<Long,Long> map=new HashMap<>();
        List<Map<String,Long>> arr= orderssService.jhs(year);
        for (Map<String, Long> stringStringMap : arr) {
            map.put(stringStringMap.get("MONTH(create_time)"),stringStringMap.get("count(1)"));
        }
        for (Map.Entry<Long, Long> aLong : map.entrySet()) {
            System.err.println(aLong);
        }
        return returnContent.getContent(map,"数据获取成功","数据获取失败");
    }

    @GetMapping("/dds/{year}")
    public RestContent dds(@PathVariable("year") String year){
        System.err.println(year);
        Map<Long,Long> map=new HashMap<>();
        List<Map<String,Long>> arr= orderssService.dds(year);
        for (Map<String, Long> stringStringMap : arr) {
            map.put(stringStringMap.get("MONTH(fixture_date)"),stringStringMap.get("count(1)"));
        }
        for (Map.Entry<Long, Long> aLong : map.entrySet()) {
            System.err.println(aLong);
        }
        return returnContent.getContent(map,"数据获取成功","数据获取失败");
    }

    @GetMapping("/xss/{year}")
    public RestContent xss(@PathVariable("year") String year){
        System.err.println(year);
        Map<Long,Long> map=new HashMap<>();
        List<Map<String,Long>> arr= orderssService.xss(year);
        for (Map<String, Long> stringStringMap : arr) {
            map.put(stringStringMap.get("MONTH(fixture_date)"),stringStringMap.get("count(1)"));
        }
        for (Map.Entry<Long, Long> aLong : map.entrySet()) {
            System.err.println(aLong);
        }
        return returnContent.getContent(map,"数据获取成功","数据获取失败");
    }

    @GetMapping("/top/{year}")
    public RestContent top10(@PathVariable("year") String year){
        System.err.println(year);
        Map<Long,Long> map=new HashMap<>();
        List<Map<String,Long>> arr= orderssService.top10(year);
        for (Map<String, Long> stringStringMap : arr) {
            map.put(stringStringMap.get("cu_name"),stringStringMap.get("order_money"));
        }
        for (Map.Entry<Long, Long> aLong : map.entrySet()) {
            System.err.println(aLong);
        }
        return returnContent.getContent(map,"数据获取成功","数据获取失败");
    }


}
