package com.crm.dao.thf;

import com.crm.entities.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ProductDao {
    //新增产品数据
    @Insert("insert into product(product_id," +
            "product_name," +
            "staff_id," +
            "productunit_id," +
            "inventorystatus_id," +
            "inventory_quantity," +
            "product_model," +
            "product_description," +
            "product_creationtime," +
            "productclassification_id," +
            "product_price)  " +
            "value(null,#{productName}," +
            "#{staffId}," +
            "#{productunitId}," +
            "#{inventorystatusId}," +
            "#{inventoryQuantity}," +
            "#{productModel}," +
            "#{productDescription}," +
            "#{productCreationtime}," +
            "#{productclassificationId}," +
            "#{productPrice})")
        void insertProduct(Product product);

    //修改产品数据
    @Update("update product set product_name = #{productName}," +
            "staff_id = #{staffId}," +
            "productunit_id= #{productunitId}," +
            "inventorystatus_id = #{inventorystatusId}," +
            "inventory_quantity = #{inventoryQuantity}," +
            "product_model = #{productModel}," +
            "product_description = #{productDescription}," +
            "product_creationtime = #{productCreationtime}," +
            "productclassification_id = #{productclassificationId}," +
            "product_price = #{productPrice} ," +
            "product_creationtime = #{productCreationtime}" +
            "where product_id = #{productId}")
    void updateProduct(Product product);

    @Delete("DELETE FROM product WHERE product_id = #{productId}")
    //删除产品数据
    void deleteProductById(Integer productId);
}
