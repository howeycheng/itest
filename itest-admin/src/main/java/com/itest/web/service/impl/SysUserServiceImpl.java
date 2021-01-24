package com.itest.web.service.impl;

import com.itest.web.dao.SysUserDao;
import com.itest.web.domain.SysUser;
import com.itest.web.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 程浩 on 2021/1/10
 *
 * @author chenghao3
 */
@Service
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public List<SysUser> selectUserList(SysUser user) {
        return null;
    }

    @Override
    public SysUser selectUserByUserName(String userName) {
        return sysUserDao.selectByUserName(userName);
    }

    @Override
    public SysUser selectUserById(Long userId) {
        return null;
    }

    @Override
    public String selectUserRoleGroup(String userName) {
        return null;
    }

    @Override
    public String selectUserPostGroup(String userName) {
        return null;
    }

    @Override
    public String checkUserNameUnique(String userName) {
        return null;
    }

    @Override
    public String checkPhoneUnique(SysUser user) {
        return null;
    }

    @Override
    public String checkEmailUnique(SysUser user) {
        return null;
    }

    @Override
    public void checkUserAllowed(SysUser user) {

    }

    @Override
    public int insertUser(SysUser user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return sysUserDao.insert(user);
    }

    @Override
    public int updateUser(SysUser user) {
        return 0;
    }

    @Override
    public int updateUserStatus(SysUser user) {
        return 0;
    }

    @Override
    public int updateUserProfile(SysUser user) {
        return 0;
    }

    @Override
    public boolean updateUserAvatar(String userName, String avatar) {
        return false;
    }

    @Override
    public int resetPwd(SysUser user) {
        return 0;
    }

    @Override
    public int resetUserPwd(String userName, String password) {
        return 0;
    }

    @Override
    public int deleteUserById(Long userId) {
        return 0;
    }

    @Override
    public int deleteUserByIds(Long[] userIds) {
        return 0;
    }

    @Override
    public String importUser(List<SysUser> userList, Boolean isUpdateSupport, String operName) {
        return null;
    }
}
