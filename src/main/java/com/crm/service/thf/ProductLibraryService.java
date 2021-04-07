package com.crm.service.thf;

import com.crm.entities.Product;
import com.crm.vo.thf.ProductLibraryVo;

import java.util.List;

public interface ProductLibraryService {
    //查询产品表所有产品
    List<ProductLibraryVo> getAllProductLibraryVo();
    //新增产品数据
    Product insertProduct(Product product);
    //修改产品数据
    Product updateProduct(Product product);
    //删除产品数据
    Product deleteProductById(Integer productId);
}
