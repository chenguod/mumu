package com.cgd.xxljobadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class XxlJobAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(XxlJobAdminApplication.class, args);
    }

}
