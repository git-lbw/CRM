package com.crm.service.thf.impl;

import com.crm.dao.thf.ProductDao;
import com.crm.dao.thf.ProductLibraryVoDao;
import com.crm.entities.Product;
import com.crm.service.thf.ProductLibraryService;
import com.crm.vo.thf.ProductLibraryVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;


@Service
public class ImpProductLibraryService implements ProductLibraryService {
    @Resource
    private ProductLibraryVoDao productLibraryVoDao;

    @Resource
    private ProductDao productDao;

    //查询产品表所有产品
    @Override
    public List<ProductLibraryVo> getAllProductLibraryVo() {
        return productLibraryVoDao.getAllProductLibraryVo();
    }
    //新增产品数据
    @Override
    public Product insertProduct(Product product) {
        product.setProductCreationtime(new Date());
        if ( product.getInventoryQuantity() > 0) {
            product.setInventorystatusId(1);
        }else {
            product.setInventorystatusId(2);
        }
        productDao.insertProduct(product);
        return null;
    }

    //修改产品数据
    @Override
    public Product updateProduct(Product product) {
        product.setProductCreationtime(new Date());
        if ( product.getInventoryQuantity() > 0) {
            product.setInventorystatusId(1);
        }else {
            product.setInventorystatusId(2);
        }
        productDao.updateProduct(product);
        return null;
    }

    //删除产品数据
    @Override
    public Product deleteProductById(Integer productId) {
        productDao.deleteProductById(productId);
        return null;
    }
}
