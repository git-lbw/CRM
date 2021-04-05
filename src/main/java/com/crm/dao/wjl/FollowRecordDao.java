package com.crm.dao.wjl;

import com.crm.entities.FollowRecord;
import com.crm.entities.Record;
import com.crm.vo.wjl.FollowRecordVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 跟进记录 mapper接口
 */
@Mapper
public interface FollowRecordDao {

    //查询所有跟进记录
    public List<FollowRecordVo> SelectRecordAll();
    //新增跟进记录
    public void addFollowRecord(FollowRecordVo followRecordvo);
    //删除跟进记录
    public void deleteFollowRecord(int id);

}
