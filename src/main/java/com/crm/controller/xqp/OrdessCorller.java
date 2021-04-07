package com.crm.controller.xqp;

import com.crm.entities.Clue;
import com.crm.service.xqp.OrderssService;
import com.crm.service.zh.OrdersService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import com.crm.vo.xqp.YearVO;
import com.crm.vo.zh.OrdersVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
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

    @Autowired
    private OrdersService ordersService;

    @Autowired
    private Clue clue;



    @GetMapping("/getmonth/{year}")
    public RestContent getmonth(@PathVariable("year") String year){
        System.out.println(year);
        System.err.println("销售额图表");
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
            map.put(stringStringMap.get("MONTH(cl_time)"),stringStringMap.get("count(1)"));
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

    @GetMapping("/hts/{year}")
    public RestContent hts(@PathVariable("year") String year){
        System.err.println(year);
        Map<Long,Long> map=new HashMap<>();
        List<Map<String,Long>> arr= orderssService.hts(year);
        for (Map<String, Long> stringStringMap : arr) {
            map.put(stringStringMap.get("MONTH(create_time)"),stringStringMap.get("count(1)"));
        }
        for (Map.Entry<Long, Long> aLong : map.entrySet()) {
            System.err.println(aLong);
        }
        return returnContent.getContent(map,"数据获取成功","数据获取失败");
    }

    @GetMapping("/cp/{year}")
    public RestContent cp(@PathVariable("year") String year){
        System.err.println(year);
        Map<Long,Long> map=new HashMap<>();
        List<Map<String,Long>> arr= orderssService.cp(year);
        for (Map<String, Long> stringStringMap : arr) {
            map.put(stringStringMap.get("product_name"),stringStringMap.get("product_price"));
        }
        for (Map.Entry<Long, Long> aLong : map.entrySet()) {
            System.err.println(aLong);
        }
        return returnContent.getContent(map,"数据获取成功","数据获取失败");
    }

    @GetMapping("/xsld/{year}")
    public RestContent xsld(@PathVariable("year") String year){
        System.err.println(year+"销售漏斗");
        Map<Long,Long> map=new HashMap<>();
        List<Map<String,Long>> arr= orderssService.xsld(year);
        for (Map<String, Long> stringStringMap : arr) {
            map.put(stringStringMap.get("name"),stringStringMap.get("value")*100);
        }
        for (Map.Entry<Long, Long> aLong : map.entrySet()) {
            System.err.println(aLong);
        }
        return returnContent.getContent(map,"数据获取成功","数据获取失败");
    }




    //分页
    @GetMapping("/orderall/{year}/{pageNum}/{pageSize}")
        public RestContent orderall(@PathVariable("year")String year,@PathVariable("pageNum")Integer pageNum,@PathVariable("pageSize")Integer pageSize){
        Map<String,Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, pageSize);
        List<OrdersVo> orderall = ordersService.orderssall(year);
        map.put("rows",orderall);
        map.put("total",page.getTotal());
        return returnContent.getContent(map,"数据获取成功","数据获取失败");
    }

    @GetMapping("/getkhyear")
    public List<String> getkhyear(){
        System.err.println("客户年份");
        List<String> nf = orderssService.getkhyear();
        return nf;
    }

    @GetMapping("/getddyear")
    public List<String> getddyear(){
        List<String> dd = orderssService.getddyear();
        return dd;
    }

    @GetMapping("/getxsyear")
    public List<String> getxsyear(){
        List<String> dd = orderssService.getxsyear();
        return dd;
    }

    @GetMapping("/gettopyear")
    public List<String> gettopyear(){
        List<String> dd = orderssService.gettopyear();
        return dd;
    }

    @GetMapping("/gethtyear")
    public List<String> gethtyear(){
        List<String> dd = orderssService.gethtyear();
        return dd;
    }

    @GetMapping("/getldyear")
    public List<String> getldyear(){
        List<String> dd = orderssService.getldyear();
        return dd;
    }

    @GetMapping("/getcpxsyear")
    public List<String> getcpxsyear(){
        List<String> dd = orderssService.getcpxsyear();
        return dd;
    }

    @GetMapping("/getjhyear")
    public List<String> getjhyear(){
        List<String> dd = orderssService.getjhyear();
        return dd;
    }


}
