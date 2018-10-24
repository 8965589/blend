package com.ander.blend.controller;

import com.ander.blend.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sqlTrain")
public class AllController {
    @Autowired
    DepartmentsService departmentsService;

    @Autowired
    EmployeesService employeesService;

    @Autowired
    JobGradesService jobGradesService;
    @Autowired
    JobsService jobsService;
    @Autowired
    LocationsService locationsService;

    @RequestMapping("/inint")
    public void initData() throws Exception{
        //初始化员工
        employeesService.init();
        //初始化工作表
        //jobsService.init();
        //初始化岗位表
        //departmentsService.init();
        //初始化 区域表
       // locationsService.init();
        //初始化 职称等级表
        //jobGradesService.init();



    }







}
