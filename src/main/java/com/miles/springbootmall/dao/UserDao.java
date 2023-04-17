package com.miles.springbootmall.dao;

import com.miles.springbootmall.dto.UserRegisterRequest;
import com.miles.springbootmall.model.User;

public interface UserDao {

    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User getUserByEmail(String email);
}
