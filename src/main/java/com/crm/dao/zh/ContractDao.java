package com.crm.dao.zh;

import com.crm.vo.zh.ContractVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ContractDao {
    //查询所有销售合同
    public List<ContractVo> getContractAll();
    //新增销售合同
    public boolean addContract(ContractVo contractVo);
    //根据销售合同id查询
    @Select("select * from contract as co,staff as st,customer as cu where co.staff_id=st.staff_id and co.cu_id=cu.cu_id and co.contract_id=#{orderId}")
    public ContractVo getContractByContractId(Integer contractId);
    //新增销售合同
    public boolean updateContract(ContractVo contractVo);
}
