package com.atguigu.wx.payment.service.impl;

import com.atguigu.wx.payment.entity.Product;
import com.atguigu.wx.payment.mapper.ProductMapper;
import com.atguigu.wx.payment.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
