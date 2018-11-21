package com.ander.blend.sqlTrain.service;

import com.ander.blend.sqlTrain.domain.Student;
import com.ander.blend.sqlTrain.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {


    @Autowired
    StudentMapper studentMapper;

    public List<Student> selectOne() {
        return studentMapper.selectOne();
    }


    public List<Map> selectSan() {
        return studentMapper.selectSan();
    }



    public  List<HashMap<String, Object>>  selectAvg() {

        List<HashMap<String, Object>> avg = studentMapper.selectAvg();

        return avg;

    }

    public List<Map>  findLi() {
        return studentMapper.findLi();


    }
}
