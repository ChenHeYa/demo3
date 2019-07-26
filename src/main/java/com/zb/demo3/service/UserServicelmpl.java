package com.zb.demo3.service;

import com.zb.demo3.dao.UserMapper;
import com.zb.demo3.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicelmpl implements  UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findInfo(User user) {
        return userMapper.findInfo(user);
    }

}
