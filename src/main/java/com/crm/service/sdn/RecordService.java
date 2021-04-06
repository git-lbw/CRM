package com.crm.service.sdn;

import com.crm.dao.sdn.RecordDao;
import com.crm.dao.sdn.ReturnsDao;
import com.crm.vo.sdn.RecordVo;
import com.crm.vo.sdn.TicketVo;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
/**
 *回款记录
 */
@Service
@Transactional
public class RecordService {
    @Autowired
    RecordDao recordDao;

    //查询所有回款记录
    public List<RecordVo> findAllRecord(String contractName){
        return recordDao.findAllRecord(contractName);
    }

    //查询所有回款计划
    public List<RecordVo> findReturns(){
        return recordDao.findReturns();
    }

    //新增回款记录
    public void saveRecord(RecordVo recordVo){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
        String str="HKJL"+sdf.format(date);
        recordVo.setReId(str);

        //对应期数=已回期数加1
        Integer qishu=Integer.valueOf(recordVo.getrBeenp()+1);
        recordVo.setRePeriods(qishu);

        //应对金额
        recordVo.setReMoney(Double.valueOf(recordVo.getrMaym()));
        recordDao.saveRecord(recordVo);


        //修改回款计划中的已回期数、已回金额
        recordDao.updateReturn(recordVo.getReBeenm(),recordVo.getrId());

        //判断 已回期数是否 = 总期数  判断是不是在回最后一期
        Boolean isOk=recordVo.getrBeenp()+1==recordVo.getrMayp();

        //修改回款状态
        if(isOk){
            recordDao.updateReturnState(recordVo.getrId());
        }

        //新增开票
/*        String str2="KP"+sdf.format(date);
        TicketVo kaipiao=new TicketVo(str2,str,recordVo.getReMoney(),new Date(),recordVo.getStaffId(),recordVo.getCuId(),0);
        recordDao.saveKaiPiao(kaipiao);*/

    }
}
