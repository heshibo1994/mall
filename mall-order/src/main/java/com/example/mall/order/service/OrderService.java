package com.example.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.example.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author keran
 * @email csuheshibo@163.com
 * @date 2021-07-18 00:04:30
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

