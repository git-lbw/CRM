package com.crm.dao.sdn;

import com.crm.vo.sdn.RecordVo;
import com.crm.vo.sdn.TicketVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
/**
 *回款记录
 */
@Mapper
@Repository
public interface RecordDao {
    //查询回款记录
    List<RecordVo> findAllRecord(String contractName);

    //查询回款计划
    List<RecordVo> findReturns();

    //新增回款记录
    void saveRecord(RecordVo recordVo);

    //修改回款计划中的已回期数、已回金额
    void updateReturn(@Param("rmoney") Double rmoney, @Param("rId") Integer rId);

    //修改回款状态
    void updateReturnState(Integer rId);

    //新增开票
    void saveKaiPiao(TicketVo ticketVo);

}
