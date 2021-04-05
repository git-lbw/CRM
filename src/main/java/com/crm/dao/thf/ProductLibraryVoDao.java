package com.crm.dao.thf;

import com.crm.vo.thf.ProductLibraryVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductLibraryVoDao {
    //查询所有产品信息
    List<ProductLibraryVo> getAllProductLibraryVo();
}
