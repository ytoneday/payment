package com.atguigu.wx.payment.controller;

import com.atguigu.payment.common.Common.R;
import com.atguigu.wx.payment.entity.Product;
import com.atguigu.wx.payment.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:YT
 * @Date:2022/6/8 - 06 - 08 - 15:07
 */
@RestController
@RequestMapping("/api/product")
@CrossOrigin //跨域
@Api(tags = "商品管理")
public class ProductController {

    @Autowired
    private ProductService productService;

    @ApiOperation("测试接口")
    @GetMapping("/test")
    public R test(){

        return R.ok().data("message","hello world");
    }

    @ApiOperation("获取商品列表")
    @GetMapping("/list")
    public R list(){
        List<Product> list = productService.list(null);
        return R.ok().data("list",list);
    }
}
