package com.crm.service.wjl;

import com.crm.entities.FollowRecord;
import com.crm.vo.wjl.FollowRecordVo;

import java.util.List;

public interface FollowRecordService {
    //查询所有跟进记录
    public List<FollowRecordVo> SelectRecordAll();
    //新增跟进记录
    public void addFollowRecord(FollowRecordVo followRecordvo);
    //删除跟进记录
    public void deleteFollowRecord(int id);

}
