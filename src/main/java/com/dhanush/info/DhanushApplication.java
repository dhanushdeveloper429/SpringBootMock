package com.dhanush.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication(scanBasePackages={"com.dhanush.info"})

public class DhanushApplication extends SpringBootServletInitializer {

              private static Class<DhanushApplication> application = DhanushApplication.class;
              
              @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
                             return builder.sources(application);
    }

    public static void main(String[] args) {
        SpringApplication.run(application, args);
}}
