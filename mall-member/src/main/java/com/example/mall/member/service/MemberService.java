package com.example.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.example.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author keran
 * @email csuheshibo@163.com
 * @date 2021-07-18 00:00:15
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

