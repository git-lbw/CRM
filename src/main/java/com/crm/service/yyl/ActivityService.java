package com.crm.service.yyl;

import com.crm.dao.yyl.ActivityDao;
import com.crm.entities.Activity;
import com.crm.vo.yyl.ActivityVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ActivityService {
    @Autowired
    ActivityDao activityDao;
    //查询所有
    public List<Map<String,Object>> select(){
        return activityDao.select();
    }
    //查询市场活动名称
    public List<Map<String,Object>> vague(String acName){
        return activityDao.vague(acName);
    }
    //高级查询
    public List<Map<String,Object>> actCost(String acStarttime,String acStarttimes,String acType,Integer acState,String acName){
        return activityDao.actCost(acStarttime, acStarttimes, acType, acState,acName);
    }
    //新增
    public void add(Activity activity){
        activityDao.add(activity);
    }

    //修改
    public void amend(Activity activity){
        activityDao.amend(activity);
    }


    //删除
    public void cancel(Integer acId){
        activityDao.cancel(acId);
    }

    /*批量删除*/
    public void upstate(List<ActivityVo> list) {
       list.forEach(s->{
           activityDao.cancel(s.getAcId());
       });
    }

}
