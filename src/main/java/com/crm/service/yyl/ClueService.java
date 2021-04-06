package com.crm.service.yyl;

import com.crm.dao.yyl.ClueDao;
import com.crm.entities.Clue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ClueService {
    @Autowired
    ClueDao clueDao;
    //查询所有
    public List<Map<String,Object>> clue_select(){
        return clueDao.clue_select();
    }
    //查询线索名称
    public List<Map<String,Object>> clue_name(String clName){
        return clueDao.clue_name(clName);
    }
    //查询线索公海所有
    public List<Map<String,Object>> select_hight(){
        return clueDao.select_hight();
    }
    //查询线索公海名称
    public List<Map<String,Object>> clue_namehight(String clNames){
        return clueDao.clue_namehight(clNames);
    }
    //线索高级查询
   public List<Map<String,Object>> clue_actCost(String clTime,String clTimes,String clFollow,
                                                String clSource,String clHigh,Integer clState,String clName){
       return clueDao.clue_actCost(clTime, clTimes, clFollow, clSource, clHigh, clState,clName);
   }
   //线索新增
    public void clue_newly(Clue clue){
        clueDao.clue_newly(clue);
    }
    //线索修改
    public void clue_compile(Clue clue){
        clueDao.clue_compile(clue);
    }
    //回归线索公海/删除
    public void clue_regression(Integer clId){
        clueDao.clue_regression(clId);
    }
    //重新分配负责人
    public void clue_allocation(Integer staffId,Integer clId){
        clueDao.clue_allocation(staffId, clId);
    }
}
