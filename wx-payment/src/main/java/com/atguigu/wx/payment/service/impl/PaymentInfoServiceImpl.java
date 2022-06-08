package com.atguigu.wx.payment.service.impl;

import com.atguigu.wx.payment.entity.PaymentInfo;
import com.atguigu.wx.payment.mapper.PaymentInfoMapper;
import com.atguigu.wx.payment.service.PaymentInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoMapper, PaymentInfo> implements PaymentInfoService {

}
