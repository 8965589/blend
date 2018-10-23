package com.ander.aspect;

import com.ander.domain.SysLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SysLogService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public boolean save(SysLog sysLogBO) {
        logger.info(sysLogBO.getParams());
        logger.info(sysLogBO.toString());
        return true;
    }
}
