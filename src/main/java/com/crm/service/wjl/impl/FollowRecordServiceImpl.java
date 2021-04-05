package com.crm.service.wjl.impl;

import com.crm.dao.wjl.FollowRecordDao;
import com.crm.entities.FollowRecord;
import com.crm.entities.Record;
import com.crm.service.wjl.FollowPlanService;
import com.crm.service.wjl.FollowRecordService;

import com.crm.vo.wjl.FollowRecordVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class FollowRecordServiceImpl implements FollowRecordService {

    @Resource
    private FollowRecordDao recorddao;

    @Override
    public List<FollowRecordVo> SelectRecordAll() {

        return recorddao.SelectRecordAll();
    }

    @Override
    public void addFollowRecord(FollowRecordVo followRecordvo) {
        followRecordvo.setCreateTime(new Timestamp(new Date().getTime()));
        recorddao.addFollowRecord(followRecordvo);
    }

    @Override
    public void deleteFollowRecord(int id) {
        recorddao.deleteFollowRecord(id);
    }


}
