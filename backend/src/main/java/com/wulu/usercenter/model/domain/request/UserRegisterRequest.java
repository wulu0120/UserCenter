package com.wulu.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author wulu
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -7595715443451601879L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;

}
