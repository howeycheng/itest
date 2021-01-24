package com.itest.web.exception.user;/*
 * @author  程浩
 * @date  2021/1/14 13:52
 */

import com.itest.web.exception.BaseException;

public class UserException extends BaseException {
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args) {
        super("user", code, args, null);
    }
}
