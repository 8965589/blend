package com.ander.blend.server.config;

import com.ander.blend.common.base.Constants;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Created by zhouhh2 on 2017/1/5.
 */

@Configuration
@PropertySources({
        @PropertySource({Constants.CFG_FILE_DB}),
        @PropertySource({Constants.CFG_FILE_MYBATIS})

})
@ComponentScan({"com.ander"})//因为引入jar
@EnableAsync
public class EnvConfig {
}
