package com.miles.springbootmall.service.impl;

import com.miles.springbootmall.dao.UserDao;
import com.miles.springbootmall.dto.UserRegisterRequest;
import com.miles.springbootmall.model.User;
import com.miles.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

}
