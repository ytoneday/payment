package com.atguigu.wx.payment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.atguigu.wx.payment.mapper")
public class WxPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxPaymentApplication.class, args);
    }

}
