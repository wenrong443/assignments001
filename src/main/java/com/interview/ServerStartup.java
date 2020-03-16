package com.interview;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.interview.mapper")
public class ServerStartup {
    public static void main(String[] args) {
        SpringApplication.run(ServerStartup.class, args);
    }
}
