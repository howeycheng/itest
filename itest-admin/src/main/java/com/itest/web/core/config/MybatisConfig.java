package com.itest.web.core.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 程浩 on 2021/1/10
 */
@Configuration
@MapperScan("com.itest.web.dao")
public class MybatisConfig {
}
