package com.crm.controller.sdn;

import com.crm.service.sdn.TicketService;
import com.crm.utils.RestContent;
import com.crm.utils.ReturnContent;
import com.crm.vo.sdn.TicketVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *开票
 */
@RestController
@Slf4j
public class TicketController {
    @Autowired
    private ReturnContent returnContent;

    @Autowired
    TicketService ticketService;

    //所有开票
    @GetMapping("/findAllTickets")
    public RestContent findAllTicket(Integer pageNum,Integer size,Integer kId){
        Map<String,Object> map=new HashMap<String, Object>();
        Page<Object> page= PageHelper.startPage(pageNum,size);
        List<TicketVo> ticket=ticketService.findAllTicket(kId);
        map.put("rows",ticket);
        map.put("total",page.getTotal());
        return returnContent.getContent(map,"查询成功！","查询失败");
    }

    //查询开票记录
    @GetMapping("/findTicketJiLu")
    public RestContent findTicketJL(Integer pageNum,Integer size,Integer kId){
        Map<String,Object> map=new HashMap<String, Object>();
        Page<Object> page= PageHelper.startPage(pageNum,size);
        List<TicketVo> tickets=ticketService.findTicketJL(kId);
        map.put("rows",tickets);
        map.put("total",page.getTotal());
        return returnContent.getContent(map,"查询成功！","查询失败");
    }

    //开票办理 修改票据状态
/*    @PostMapping("/updateKState")
    public void updateKState(TicketVo ticketVo){
        ticketService.updateKState(ticketVo);
    }*/
}
