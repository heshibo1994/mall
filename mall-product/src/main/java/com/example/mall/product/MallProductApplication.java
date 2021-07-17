package com.example.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1)导入依赖
 *  mybatis-plus
 * 2)配置
 *  配置数据源
 *      导入数据源驱动
 *      在application.yml配置数据源信息
 *  配置mybatis-plus
 *      使用MapperScan
 *      告诉自定义sql的地址
 *
 */
@MapperScan("com.example.mall.product.dao")
@SpringBootApplication
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
