package com.ander.blend.sqlTrain.mapper;

import com.ander.blend.sqlTrain.domain.Course;
import org.springframework.stereotype.Repository;

/**
 * CourseMapper继承基类
 */
@Repository
public interface CourseMapper extends MyBatisBaseDao<Course, Course> {
}