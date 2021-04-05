package com.crm.service.sdn;

import com.crm.dao.sdn.ReturnsDao;
import com.crm.vo.sdn.ReturnsVo;
import com.crm.vo.sdn.TicketVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 *回款计划
 */
@Service
@Transactional
public class ReturnsService {
    @Autowired
    ReturnsDao returnsDao;

    //查询回款计划
    public List<ReturnsVo> findAllReturns(String contractName){
        return returnsDao.findAllReturns(contractName);
    }

/*    public List<ReturnsVo> findAllReturns(ReturnsVo returnsVo){
        return returnsDao.findAllReturns(returnsVo);
    }*/

/*
    //删除回款计划
    public void deleReturns(List<ReturnsVo> returnsVos){
        returnsVos.forEach(list ->{
            returnsDao.deleReturns(list.getrId());
        });
    }
*/


}
