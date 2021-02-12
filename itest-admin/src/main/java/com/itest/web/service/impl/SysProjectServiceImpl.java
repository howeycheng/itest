package com.itest.web.service.impl;

import com.itest.web.dao.SysProjectDao;
import com.itest.web.domain.SysProject;
import com.itest.web.service.ISysProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 程浩 on 2021/1/6
 */
@Service
public class SysProjectServiceImpl implements ISysProjectService {
    @Autowired
    private SysProjectDao projectDao;

    @Override
    public SysProject selectProjectById(Integer projectId) {
        return projectDao.selectByPrimaryKey(projectId);
    }
}
