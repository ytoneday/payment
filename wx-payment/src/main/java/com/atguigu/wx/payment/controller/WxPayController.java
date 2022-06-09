package com.atguigu.wx.payment.controller;

import com.atguigu.payment.common.Common.R;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author:YT
 * @Date:2022/6/9 - 06 - 09 - 17:53
 */
@RestController
@RequestMapping("/api/wx-pay")
@Api(tags = "微信支付")
@Slf4j
@CrossOrigin
public class WxPayController {

    @GetMapping("/wx-test")
    public R test(){
        return R.ok().data("测试","微信支付测试");
    }
}
