package com.crm.service.zh.impl;

import com.crm.dao.zh.ContractDao;
import com.crm.entities.Contract;
import com.crm.service.zh.ContractService;
import com.crm.vo.zh.ContractVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ImplContractService implements ContractService {
    @Resource
    private ContractDao contractDao;

    @Override
    public List<ContractVo> getContractAll() {
        return contractDao.getContractAll();
    }

    @Override
    public boolean addContract(ContractVo contractVo) {
        int i=10/0;
        return contractDao.addContract(contractVo);
    }

    @Override
    public ContractVo getContractByContractId(Integer contractId) {
        return contractDao.getContractByContractId(contractId);
    }

    @Override
    public boolean updateContract(ContractVo contractVo) {
        return contractDao.updateContract(contractVo);
    }
}
