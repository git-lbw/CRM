package com.crm.controller.thf;

import com.crm.service.thf.ProductLibraryService;
import com.crm.vo.thf.ProductLibraryVo;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/product")
public class ProductLibraryController {
    @Autowired
    private ProductLibraryService productLibraryService;

    //查询所有产品信息
    @GetMapping("findAllProduct")
    public @ResponseBody
    List<ProductLibraryVo> findAllProduct(){
        return productLibraryService.getAllProductLibraryVo();
    }

    //查询所有
}
