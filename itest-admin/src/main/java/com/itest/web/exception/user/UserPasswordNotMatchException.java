package com.itest.web.exception.user;/*
 * @author  程浩
 * @date  2021/1/14 13:44
 */


/**
 * @author chenghao3
 */
public class UserPasswordNotMatchException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserPasswordNotMatchException() {
        super("user.password.not.match", null);
    }
}
