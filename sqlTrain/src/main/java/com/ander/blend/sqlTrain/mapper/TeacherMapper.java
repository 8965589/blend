package com.ander.blend.sqlTrain.mapper;

import com.ander.blend.sqlTrain.domain.Teacher;
import org.springframework.stereotype.Repository;

/**
 * TeacherMapper继承基类
 */
@Repository
public interface TeacherMapper extends MyBatisBaseDao<Teacher, Teacher> {
}