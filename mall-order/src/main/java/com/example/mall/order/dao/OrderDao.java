package com.example.mall.order.dao;

import com.example.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author keran
 * @email csuheshibo@163.com
 * @date 2021-07-18 00:04:30
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
