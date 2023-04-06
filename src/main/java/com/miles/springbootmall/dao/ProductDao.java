package com.miles.springbootmall.dao;

import com.miles.springbootmall.dto.ProductRequest;
import com.miles.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
