package com.itest.web.dao;

import com.itest.web.domain.SysRoleMenu;

public interface SysRoleMenuDao {
    int deleteByPrimaryKey(Long roleId);

    int insert(SysRoleMenu record);

    int insertSelective(SysRoleMenu record);

    SysRoleMenu selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(SysRoleMenu record);

    int updateByPrimaryKey(SysRoleMenu record);
}