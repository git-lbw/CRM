package com.crm.dao.zh;

import com.crm.vo.zh.ContractVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ContractDao {
    //查询所有销售合同
    public List<ContractVo> getContractAll();
    //新增销售合同
    public boolean addContract(ContractVo contractVo);
}
