package com.ander.blend.sqlTrain.dao;

import com.ander.blend.sqlTrain.domain.Employees;
import org.apache.ibatis.annotations.Mapper;

/**
 * EmployeesMapper继承基类
 */
@Mapper
public interface EmployeesMapper extends MyBatisBaseDao<Employees, Integer> {

}