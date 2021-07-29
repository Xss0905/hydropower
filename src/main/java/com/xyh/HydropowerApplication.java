package com.xyh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@MapperScan
@SpringBootApplication
public class HydropowerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HydropowerApplication.class, args);
    }



}
