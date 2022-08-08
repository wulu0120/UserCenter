package com.wulu.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author wulu
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = -4464694050593718169L;

    private String userAccount;
    private String userPassword;

}