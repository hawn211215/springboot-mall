package com.miles.springbootmall.service;

import com.miles.springbootmall.constant.ProductCategory;
import com.miles.springbootmall.dto.ProductQueryParams;
import com.miles.springbootmall.dto.ProductRequest;
import com.miles.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
