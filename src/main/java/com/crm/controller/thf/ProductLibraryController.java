package com.crm.controller.thf;

import com.crm.entities.Product;
import com.crm.service.thf.impl.ImpProductLibraryService;
import com.crm.vo.thf.ProductLibraryVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/product")
public class ProductLibraryController {
    @Autowired
    private ImpProductLibraryService impProductLibraryService;

    //查询所有产品信息
    @GetMapping("/findAllProduct")
    public @ResponseBody
    List<ProductLibraryVo> findAllProduct(){
        return impProductLibraryService.getAllProductLibraryVo();
    }

    //新增产品信息
    @GetMapping("/insertProduct")
    public @ResponseBody
    List<ProductLibraryVo> insertProduct(Product product){
         impProductLibraryService.insertProduct(product);
         return  impProductLibraryService.getAllProductLibraryVo();
    }
    //修改产品信息
    @GetMapping("/updateProduct")
    public @ResponseBody
    List<ProductLibraryVo> updateProduct(Product product){
        impProductLibraryService.updateProduct(product);
        return impProductLibraryService.getAllProductLibraryVo();
    }
    //删除产品信息
    @GetMapping("/deleteProductById")
    public @ResponseBody
    List<ProductLibraryVo> deleteProductById(Integer productId){
        impProductLibraryService.deleteProductById(productId);
        return impProductLibraryService.getAllProductLibraryVo();
    }
}
