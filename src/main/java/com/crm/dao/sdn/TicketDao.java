package com.crm.dao.sdn;


import com.crm.vo.sdn.TicketVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 *开票
 */
@Mapper
@Repository
public interface TicketDao {
    //查询开票
    List<TicketVo> findAllTicket(Integer kId);

    //查询开票记录
    List<TicketVo> findTicketJL(Integer kId);

    //办理开票，修改票据状态
    void updateKState(Integer kId);
}
