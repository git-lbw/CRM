package com.crm.controller.xqp;

import com.crm.entities.Customer;
import com.crm.service.xqp.OrderssService;
import com.crm.service.yyl.ClueService;
import com.crm.service.yyl.CustomerService;
import com.crm.service.zh.SalesLeadsService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import com.crm.vo.zh.SalesLeadsVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/xqp")
@RestController
public class BiaogeCorller {
    @Autowired
    private SalesLeadsService salesLeadsService;

    @Autowired
    private ReturnContent returnContent;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ClueService clueService;

    @Autowired
    private OrderssService orderssService;

    //机会分页
    @GetMapping("/jhall/{year}/{pageNum}/{pageSize}")
    public RestContent jhall(@PathVariable("year")String year,@PathVariable("pageNum")Integer pageNum, @PathVariable("pageSize")Integer pageSize){
        Map<String,Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, pageSize);
        List<SalesLeadsVo> jihui = salesLeadsService.jhall(year);
        map.put("rows",jihui);
        map.put("total",page.getTotal());
        return returnContent.getContent(map,"数据获取成功","数据获取失败");
    }

    //客户分页
    @GetMapping("/khall/{year}/{pageNum}/{pageSize}")
    public RestContent khall(@PathVariable("year")String year, @PathVariable("pageNum")Integer pageNum, @PathVariable("pageSize")Integer pageSize){
        System.err.println("客户分页");
        Map<String,Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, pageSize);
        List<Map<Object,String>> kehu = customerService.khall(year);
        map.put("rows",kehu);
        map.put("total",page.getTotal());
        return returnContent.getContent(map,"数据获取成功","数据获取失败");
    }

    //线索分页
    @GetMapping("/xsall/{year}/{pageNum}/{pageSize}")
    public RestContent xsall(@PathVariable("year")String year, @PathVariable("pageNum")Integer pageNum, @PathVariable("pageSize")Integer pageSize){
        System.err.println("线索分页");
        Map<String,Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, pageSize);
        List<Map<Object,String>> xiansuo = clueService.xsall(year);
        map.put("rows",xiansuo);
        map.put("total",page.getTotal());
        return returnContent.getContent(map,"数据获取成功","数据获取失败");
    }

    //回款分页
    @GetMapping("/hikuai/{year}/{pageNum}/{pageSize}")
    public RestContent hikuai(@PathVariable("year")String year, @PathVariable("pageNum")Integer pageNum, @PathVariable("pageSize")Integer pageSize){
        System.err.println("回款分页");
        Map<String,Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, pageSize);
        List<Map<Object,String>> hikuai = orderssService.hikuai(year);
        map.put("rows",hikuai);
        map.put("total",page.getTotal());
        return returnContent.getContent(map,"数据获取成功","数据获取失败");
    }

    @GetMapping("/topp/{year}")
    public List<Map<Object,Object>> top(@PathVariable("year")String year){
        List<Map<Object,Object>> top = orderssService.top(year);
        return top;
    }

//    //客户TOP10分页
//    @GetMapping("/top/{year}/{pageNum}/{pageSize}")
//    public RestContent top(@PathVariable("year")String year, @PathVariable("pageNum")Integer pageNum, @PathVariable("pageSize")Integer pageSize){
//        System.err.println("客户TOP10分页");
//        Map<String,Object> map = new HashMap<>();
//        Page<Object> page = PageHelper.startPage(pageNum, pageSize);
//        List<Map<Object,Object>> top = orderssService.top(year);
//        map.put("rows",top);
//        map.put("total",page.getTotal());
//        return returnContent.getContent(map,"数据获取成功","数据获取失败");
//    }


    //合同分页
    @GetMapping("/hetong/{year}/{pageNum}/{pageSize}")
    public RestContent hetong(@PathVariable("year")String year, @PathVariable("pageNum")Integer pageNum, @PathVariable("pageSize")Integer pageSize){
        System.err.println("合同分页");
        Map<String,Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, pageSize);
        List<Map<Object,String>> hetong = orderssService.hetong(year);
        map.put("rows",hetong);
        map.put("total",page.getTotal());
        return returnContent.getContent(map,"数据获取成功","数据获取失败");
    }

    //销售漏斗分页
    @GetMapping("/xiaoshould/{year}/{pageNum}/{pageSize}")
    public RestContent xiaoshou(@PathVariable("year")String year, @PathVariable("pageNum")Integer pageNum, @PathVariable("pageSize")Integer pageSize){
        System.err.println("销售漏斗分页年份"+year);
        System.err.println("销售漏斗分页");
        Map<String,Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, pageSize);
        List<Map<Object,String>> xiaoshould = orderssService.xiaoshould(year);
        map.put("rows",xiaoshould);
        map.put("total",page.getTotal());
        return returnContent.getContent(map,"数据获取成功","数据获取失败");
    }

    //产品销售统计分页
    @GetMapping("/chanping/{year}/{pageNum}/{pageSize}")
    public RestContent chanping(@PathVariable("year")String year, @PathVariable("pageNum")Integer pageNum, @PathVariable("pageSize")Integer pageSize){
        System.err.println("产品销售统计分页");
        Map<String,Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, pageSize);
        List<Map<Object,String>> chanping = orderssService.chanping(year);
        map.put("rows",chanping);
        map.put("total",page.getTotal());
        return returnContent.getContent(map,"数据获取成功","数据获取失败");
    }



}
