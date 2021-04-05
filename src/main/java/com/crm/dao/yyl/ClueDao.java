package com.crm.dao.yyl;

import com.crm.entities.Clue;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ClueDao {
    //查询所有
    public List<Map<String,Object>> clue_select();
    //查询线索名称
    public List<Map<String,Object>> clue_name(@Param("clName") String clName);
    //查询线索公海所有
    public List<Map<String,Object>> select_hight();
    //查询线索公海名称
    public List<Map<String,Object>> clue_namehight(@Param("clNames") String clNames);
    //线索高级查询
    public List<Map<String,Object>> clue_actCost(@Param("clTime") String clTime,
                                                 @Param("clTimes") String clTimes,
                                                 @Param("clFollow") String clFollow,
                                                 @Param("clSource") String clSource,
                                                 @Param("clHigh") String clHigh,
                                                 @Param("clState") Integer clState);
    //线索新增
    public void clue_newly(Clue clue);
    //线索修改
    public void clue_compile(Clue clue);
    //回归到线索公海/删除
    public void clue_regression(@Param("clId") Integer clId);
    //重新分配负责人
    public void clue_allocation(@Param("staffId") Integer staffId,
                                @Param("clId") Integer clId);
}
