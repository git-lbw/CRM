package com.crm.controller.xqp;

import com.crm.service.zh.SalesLeadsService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import com.crm.vo.zh.OrdersVo;
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

    //机会分页
    @GetMapping("/jhall/{year}/{pageNum}/{pageSize}")
    public RestContent jhall(@PathVariable("year")String year,@PathVariable("pageNum")Integer pageNum, @PathVariable("pageSize")Integer pageSize){
        Map<String,Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, pageSize);
        List<SalesLeadsVo> orderall = salesLeadsService.jhall(year);
        map.put("rows",orderall);
        map.put("total",page.getTotal());
        return returnContent.getContent(map,"数据获取成功","数据获取失败");
    }



}
