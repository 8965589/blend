package com.ander.blend.sqlTrain.service;

import com.ander.blend.sqlTrain.domain.Student;
import com.ander.blend.sqlTrain.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    @Autowired
    StudentMapper studentMapper;

    public List<Student> selectOne() {
        return studentMapper.selectOne();
    }
}
