package com.dxt.third.task;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
@ComponentScan(basePackages = {"com.dxt"})
@MapperScan("com.dxt.third.core.dao")
/**
 * 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
 */
@EnableTransactionManagement
public class DxtThirdTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(DxtThirdTaskApplication.class, args);
    }

}
