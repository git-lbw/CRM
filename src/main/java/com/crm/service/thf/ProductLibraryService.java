package com.crm.service.thf;

import com.crm.vo.thf.ProductLibraryVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ProductLibraryService {
    //分页查询产品表所有产品
    List<ProductLibraryVo> getAllProductLibraryVo();
}
