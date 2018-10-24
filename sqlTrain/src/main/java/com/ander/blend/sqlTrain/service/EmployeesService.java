package com.ander.blend.sqlTrain.service;

import com.ander.blend.sqlTrain.dao.EmployeesMapper;
import com.ander.blend.sqlTrain.domain.Employees;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeesService {
    @Autowired
    private EmployeesMapper employeesMapper;

    /**
     *

    @Autowired
    DepartmentsMapper departmentsMapper;
    @Autowired
    JobGradesMapper jobGradesMapper;
    @Autowired
    JobsMapper jobsMapper;
    @Autowired
    LocationsMapper locationsMapper;

     */

    public void init()  throws Exception{
        Employees employ1 = new Employees();
        employ1.setEmployeeId(1);
        employ1.setFirstName("employ1");
        employ1.setLastName("employ1");
        employ1.setEmail("employ1mail");
        employ1.setPhoneNumber("employ1phonenumber");
        employ1.setHireDate(DateUtils.parseDate("2018-01-01","yyyy-MM-dd"));
        employ1.setJobId("job1");//插入job 1
        employ1.setSalary(1000);
        employ1.setCommissionPct(1000);//hr提成
        employ1.setManagerId(5);//经理id是5
        employ1.setDepartmentId(1);//插入部门 1
        employeesMapper.insert(employ1);
    }

}
