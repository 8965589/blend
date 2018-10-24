package com.ander.blend.server;

import com.ander.blend.server.config.EnvConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
@Import({EnvConfig.class})
public class StartServer {
    public static void main(String[] args) {
        SpringApplication.run(StartServer.class, args);
    }
}