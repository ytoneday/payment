package com.atguigu.wx.payment.service.impl;

import com.atguigu.wx.payment.entity.OrderInfo;
import com.atguigu.wx.payment.mapper.OrderInfoMapper;
import com.atguigu.wx.payment.service.OrderInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {

}
