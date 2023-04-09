package com.miles.springbootmall.dao;

import com.miles.springbootmall.constant.ProductCategory;
import com.miles.springbootmall.dto.ProductRequest;
import com.miles.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
