package com.itest.web.dao;

import com.itest.web.domain.SysUserProjectRole;

public interface SysUserProjectRoleDao {
    int deleteByPrimaryKey(Long roleId);

    int insert(SysUserProjectRole record);

    int insertSelective(SysUserProjectRole record);

    SysUserProjectRole selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(SysUserProjectRole record);

    int updateByPrimaryKey(SysUserProjectRole record);
}