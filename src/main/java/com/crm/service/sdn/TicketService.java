package com.crm.service.sdn;

import com.crm.dao.sdn.TicketDao;
import com.crm.vo.sdn.TicketVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 *开票
 */
@Service
@Transactional
public class TicketService {
    @Autowired
    TicketDao ticketDao;

    //查询开票
    public List<TicketVo> findAllTicket(Integer kId){
        return ticketDao.findAllTicket(kId);
    }

    //查询开票记录
    public List<TicketVo> findTicketJL(Integer kId){
        return ticketDao.findTicketJL(kId);
    }

    //开票办理 修改票据状态
    public void updateKState(Integer kId){
        ticketDao.updateKState(kId);
    };

}
