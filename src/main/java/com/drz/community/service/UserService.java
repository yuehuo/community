package com.drz.community.service;

import com.drz.community.dao.UserMapper;
import com.drz.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired(required = false)
    private UserMapper userMapper;
    public User findUserById(int id) {
        return userMapper.selectById(id);
    }
}
