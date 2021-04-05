package com.crm.dao.sdn;

import com.crm.vo.sdn.ReturnsVo;
import com.crm.vo.sdn.TicketVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 *回款计划
 */
@Mapper
@Repository
public interface ReturnsDao {
        //查询回款计划
        List<ReturnsVo> findAllReturns(String contractName);

/*        List<ReturnsVo> findAllReturns(ReturnsVo returnsVo);*/

      /*  //删除回款计划
        void deleReturns(Integer rId);*/

}