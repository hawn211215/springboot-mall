package com.miles.springbootmall.dao;

import com.miles.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
