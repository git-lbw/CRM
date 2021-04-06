package com.crm.dao.yyl;

import com.crm.entities.Activity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ActivityDao {
    //查询所有
    public List<Map<String,Object>> select();
    //查询市场活动名称
    public List<Map<String,Object>> vague(@Param("acName") String acName);
    //高级查询
    public List<Map<String,Object>> actCost(@Param("acStarttime") String acStarttime,
                                            @Param("acStarttimes") String acStarttimes,
                                            @Param("acType") String acType,
                                            @Param("acState") Integer acState,
                                            @Param("acName") String acName);
    //新增
    public void add(Activity activity);

    //修改
    public void amend(Activity activity);

    //删除
    public void  cancel(@Param("acId") Integer acId);
}
