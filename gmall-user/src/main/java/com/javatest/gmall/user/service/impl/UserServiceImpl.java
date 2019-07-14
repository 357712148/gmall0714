package com.javatest.gmall.user.service.impl;

import com.javatest.gmall.user.mapper.UserInfoMapper;
import com.javatest.gmall.user.pojo.UserInfo;
import com.javatest.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liwen406
 * @Title: UserServiceImpl
 * @Description:
 * @date 2019/7/14 / 11:45
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> userInfoList() {
        return userInfoMapper.findAll();
    }
}
