package com.miles.springbootmall.service;

import com.miles.springbootmall.dto.UserRegisterRequest;
import com.miles.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);

}
