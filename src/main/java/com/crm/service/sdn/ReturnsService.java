package com.crm.service.sdn;

import com.crm.dao.sdn.ReturnsDao;
import com.crm.entities.Returns;
import com.crm.vo.sdn.ReturnsVo;
import com.crm.vo.sdn.TicketVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
/**
 *回款计划
 */
@Service
@Transactional
public class ReturnsService {
    @Autowired
    ReturnsDao returnsDao;

    //添加回款计划
    public Boolean addReturns(Returns returns){
        return returnsDao.addReturns(returns);
    }

    //根据合同id查询是否有该回款计划
    public List<Returns> findReturnsByContractId(Integer contractId){
        return returnsDao.findReturnsByContractId(contractId);
    };

    //查询回款计划
    public List<ReturnsVo> findAllReturns(ReturnsVo returnsVo){
        return returnsDao.findAllReturns(returnsVo);
    }


    //回款状态视图
    public List<ReturnsVo> findReturnsView(String pieValue) {
        List<ReturnsVo> list = new ArrayList<>();
        if (pieValue.equals("回款状态")) {
            list = returnsDao.findReturnsView();
            list.forEach(c -> {
                if (c.getType().equals("0")) {
                    c.setType("回款中");
                } else if (c.getType().equals("1")) {
                    c.setType("结束");
                }
            });
        }
        return list;
    }

}
