package com.itest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by 程浩 on 2021/1/3
 */


@SpringBootApplication()
public class ITestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ITestApplication.class, args);
    }
}
