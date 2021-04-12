package com.crm.service.zh;

import com.crm.vo.zh.ContractVo;

import java.util.List;

public interface ContractService {
    //查询所有销售合同
    public List<ContractVo> getContractAll();
    //新增销售合同
    public boolean addContract(ContractVo contractVo);
    //根据销售合同id查询
    public ContractVo getContractByContractId(Integer contractId);
    //新增销售合同
    public boolean updateContract(ContractVo contractVo);
}
