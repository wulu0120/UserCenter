package com.wulu.usercenter.service;
import java.util.Date;

import com.wulu.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void testAddUser(){
        User user = new User();
        user.setUsername("wulu");
        user.setUserAccount("wulu0120");
        user.setAvatarUrl("https://636f-codenav-8grj8px727565176-1256524210.tcb.qcloud.la/img/logo.png");
        user.setGender(0);
        user.setUserPassword("xxx");
        user.setEmail("456");
        user.setPhone("123");

        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertEquals(true, result);
    }

    @Test
    void userRegister() {
        String userAccount = "wulu";
        String userPassword = "";
        String checkPassword = "123456";
        long result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);

        userAccount = "wu";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);

        userAccount = "wulu";
        userPassword = "123456";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);

        userAccount = "wu lu";
        userPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);

        checkPassword = "123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);

        userAccount = "dogwulu";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);

        userAccount = "wulu";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
    }
}