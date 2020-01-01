package com.greenism.token.service.impl;

import com.greenism.token.bean.User;
import com.greenism.token.mapper.UserMapper;
import com.greenism.token.result.Result;
import com.greenism.token.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:UserServiceImpl
 * Package:com.greenism.token.service.impl
 * Description
 *
 * @data:2020/1/1 15:32
 * @author:jiahongjie
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userDao;

    @Override
    public User queryUser() {
        return userDao.selectUser();
    }

    @Override
    public User queryUserByUsername(String username) {
        return userDao.selectUserByUsername(username);
    }
}
