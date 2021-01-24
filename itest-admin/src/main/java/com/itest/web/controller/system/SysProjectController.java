package com.itest.web.controller.system;

import com.itest.web.controller.core.BaseController;
import com.itest.web.service.ISysProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 程浩 on 2021/1/6
 *
 * @author chenghao3
 */
@RestController
@RequestMapping("/system/project")
public class SysProjectController extends BaseController {
    @Autowired
    private ISysProjectService iSysProjectService;

    @GetMapping("/list")
    public String getProjectList() {
        return String.valueOf(iSysProjectService.selectProjectById(0));
    }

}
