package com.ander.blend.sqlTrain.mapper;

import com.ander.blend.sqlTrain.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * StudentMapper继承基类
 */
@Repository
public interface StudentMapper extends MyBatisBaseDao<Student, Student> {
    List<Student> selectOne();
}