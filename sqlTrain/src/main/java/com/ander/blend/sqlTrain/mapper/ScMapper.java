package com.ander.blend.sqlTrain.mapper;

import com.ander.blend.sqlTrain.domain.Sc;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * ScMapper继承基类
 */
@Repository
public interface ScMapper extends MyBatisBaseDao<Sc, Sc> {
    List<HashMap<String, Object>> selectAvg();
}