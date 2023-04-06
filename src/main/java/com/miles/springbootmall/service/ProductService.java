package com.miles.springbootmall.service;

import com.miles.springbootmall.dto.ProductRequest;
import com.miles.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
