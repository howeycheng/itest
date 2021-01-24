package com.itest.web.controller.system;

import com.itest.web.constant.Constants;
import com.itest.web.domain.AjaxResult;
import com.itest.web.domain.LoginBody;
import com.itest.web.service.impl.SysLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 程浩 on 2021/1/10
 * @author chenghao3
 */
@RestController
@RequestMapping()
public class SysLoginController {
    @Autowired
    private SysLoginService loginService;

    /**
     * 登录方法
     *
     * @param loginBody 登录信息
     * @return 结果
     */
    @PostMapping("/login")
    public AjaxResult login(@RequestBody LoginBody loginBody) {
        AjaxResult ajax = AjaxResult.success();
        // 生成令牌
        String token = loginService.login(loginBody.getUsername(), loginBody.getPassword());
        ajax.put(Constants.TOKEN, token);
        return ajax;
    }
}
