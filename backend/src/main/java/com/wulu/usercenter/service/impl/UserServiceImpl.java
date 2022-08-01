package com.wulu.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wulu.usercenter.model.domain.User;
import com.wulu.usercenter.service.UserService;
import com.wulu.usercenter.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author wljudii
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2022-08-01 22:40:29
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




