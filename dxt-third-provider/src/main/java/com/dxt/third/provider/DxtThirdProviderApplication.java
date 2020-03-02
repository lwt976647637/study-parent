package com.dxt.third.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
@ComponentScan(basePackages = {"com.dxt"})
@MapperScan("com.dxt.third.core.dao")
public class DxtThirdProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DxtThirdProviderApplication.class, args);
    }

}
