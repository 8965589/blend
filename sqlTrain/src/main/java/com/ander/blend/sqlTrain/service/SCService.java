package com.ander.blend.sqlTrain.service;

import com.ander.blend.sqlTrain.mapper.ScMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class SCService {

    @Autowired
    ScMapper scMapper;

    public  List<HashMap<String, Object>>  selectAvg() {

        List<HashMap<String, Object>> avg = scMapper.selectAvg();

        return avg;

    }
}
