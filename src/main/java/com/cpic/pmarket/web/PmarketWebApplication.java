package com.cpic.pmarket.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(scanBasePackages = {"com.cpic.caf.admin.data", "com.cpic.framework.admin.base"})
@MapperScan(basePackages = {"com.cpic.caf.admin.data.mapper", "com.cpic.framework.admin.base.mapper"})
@EnableCaching
public class PmarketWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PmarketWebApplication.class, args);
    }
}
