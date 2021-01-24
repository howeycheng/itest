package com.itest.web.service;

import com.itest.web.domain.Project;

import java.util.List;

/**
 * 项目 业务层
 *
 * @author cheng hao
 */
public interface ISysProjectService {
    /**
     * 通过用户ID查询用户
     *
     * @param projectId 项目ID
     * @return 项目对象信息
     */
    public Project selectProjectById(Integer projectId);
}
