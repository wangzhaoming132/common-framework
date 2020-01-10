package com.web.commonframework;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CommonframeworkApplication {

    public static void main(String[] args) {

        SpringApplication.run(CommonframeworkApplication.class, args);
    }

}
