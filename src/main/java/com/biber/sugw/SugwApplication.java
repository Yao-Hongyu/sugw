package com.biber.sugw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.biber.sugw.mappers")
public class SugwApplication {

    public static void main(String[] args) {
        SpringApplication.run(SugwApplication.class, args);
    }

}
