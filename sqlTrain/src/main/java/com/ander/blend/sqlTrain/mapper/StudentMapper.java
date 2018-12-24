package com.ander.blend.sqlTrain.mapper;

import com.ander.blend.sqlTrain.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * StudentMapper继承基类
 */
@Repository
public interface StudentMapper extends MyBatisBaseDao<Student, Student> {
    List<Student> selectOne();

    List<Map> selectSan();

    List<HashMap<String, Object>> selectAvg();

    List<Map> findLi();

    List<HashMap<String, Object>> findNoZS(Map map);
}