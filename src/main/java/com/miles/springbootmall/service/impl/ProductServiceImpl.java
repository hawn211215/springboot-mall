package com.miles.springbootmall.service.impl;

import com.miles.springbootmall.constant.ProductCategory;
import com.miles.springbootmall.dao.ProductDao;
import com.miles.springbootmall.dto.ProductQueryParams;
import com.miles.springbootmall.dto.ProductRequest;
import com.miles.springbootmall.model.Product;
import com.miles.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> getProducts(ProductQueryParams productQueryParams) {
        return productDao.getProducts(productQueryParams);
    }

    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
