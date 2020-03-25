package com.dxt.third.core.dao;

import com.dxt.third.core.entity.Product;
import com.dxt.third.core.entity.ProductExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ProductMapper {


    void insert(Product product);


    /**
     * 根据订单单号和商品编码查询商品串号
     */
    String findProudctSerial(@Param("orderNo") String orderNo,@Param("insertSerial") Integer insertSerial);

    /**
     * 根据订单单号获取商品列表
     * @param orderNo
     * @return
     */
    List<Product> findProductList(String orderNo);

    /**
     * 获取商品详细信息
     * @param orderNo
     * @param productId
     * @return
     */
    Product findProductById(@Param("orderNo") String orderNo, @Param("productId") String productId);

    /**
     * 更新商品信息
     * @param product
     */
    void updateProductSerial(Product product);
}