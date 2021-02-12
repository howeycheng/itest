package com.itest.web.dao;

import com.itest.web.domain.SysProject;

public interface SysProjectDao {
    int deleteByPrimaryKey(Integer projectId);

    int insert(SysProject record);

    int insertSelective(SysProject record);

    SysProject selectByPrimaryKey(Integer projectId);

    int updateByPrimaryKeySelective(SysProject record);

    int updateByPrimaryKey(SysProject record);
}