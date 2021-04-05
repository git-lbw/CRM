package com.crm.dao.thf;

import com.crm.vo.thf.WarehouseFlowVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WarehouseFlowVoDao {
    //查询所有出入库流水
    List<WarehouseFlowVo> findAllWarehouseFlowVo();
}
