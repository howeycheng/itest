package com.itest.web.utils;

import java.util.UUID;

/**
 * @author  程浩
 * @date  2021/1/14 15:46
 */
public class IdUtils {
    /**
     * 获取随机UUID
     *
     * @return 随机UUID
     */
    public static String randomUUID() {
        return UUID.randomUUID().toString();
    }
}
