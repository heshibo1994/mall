package com.example.mall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 远程调用远程服务
 * 1.引入open-feign
 * 2. 编写一个接口，告知spring-cloud这个接口需要调用远程服务
 *      2.1 申明接口的每一个方法来源于那个远程服务的请求
 * 3. 开启远程调用的功能 @EnableFeignClients
 */
@MapperScan("com.example.mall.member.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.example.mall.member.feign")
public class MallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallMemberApplication.class, args);
    }

}
