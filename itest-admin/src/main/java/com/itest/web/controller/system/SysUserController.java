package com.itest.web.controller.system;


import com.itest.web.constant.Constants;
import com.itest.web.controller.core.BaseController;
import com.itest.web.domain.AjaxResult;
import com.itest.web.domain.LoginBody;
import com.itest.web.domain.SysUser;
import com.itest.web.service.ISysUserService;
import com.itest.web.service.impl.SysLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户信息
 *
 * @author
 */
@RestController
@RequestMapping("/system/user")
public class SysUserController extends BaseController {
    @Autowired
    private ISysUserService iSysUserService;



    /**
     * 查询用户
     */
    @GetMapping("/{userName}")
    public AjaxResult add(@PathVariable String userName) {
        return AjaxResult.success(iSysUserService.selectUserByUserName(userName));
    }


    /**
     * 新增用户
     */
    @PostMapping("/add")
    public AjaxResult add(@RequestBody SysUser user) {
        if (iSysUserService.insertUser(user) != 0) {
            return AjaxResult.success();
        } else {
            return AjaxResult.error();
        }
    }


}
