package com.crm.service.thf.impl;

import com.crm.dao.thf.ProductLibraryVoDao;
import com.crm.service.thf.ProductLibraryService;
import com.crm.vo.thf.ProductLibraryVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ImpProductLibraryService implements ProductLibraryService {
    @Resource
    private ProductLibraryVoDao productLibraryVoDao;

    @Override
    public List<ProductLibraryVo> getAllProductLibraryVo() {
        return productLibraryVoDao.getAllProductLibraryVo();
    }
}
