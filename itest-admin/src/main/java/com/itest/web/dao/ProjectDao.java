package com.itest.web.dao;

import com.itest.web.domain.Project;

public interface ProjectDao {
    Project selectByPrimaryKey(Integer projectId);
}