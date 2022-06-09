package com.atguigu.wx.payment;

import com.atguigu.wx.payment.config.WxPayConfig;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.security.PrivateKey;

@SpringBootTest
class WxPaymentApplicationTests {

    @Resource
    private WxPayConfig wxPayConfig;

    @Test
    void getPrivateKey() {

        //获取私钥路径
        String privateKeyPath = wxPayConfig.getPrivateKeyPath();

        //获取商户私钥
        PrivateKey privateKey = wxPayConfig.getPrivateKey(privateKeyPath);

        System.out.println(privateKey.toString());
    }

}
