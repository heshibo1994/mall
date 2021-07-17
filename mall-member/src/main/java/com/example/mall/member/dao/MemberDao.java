package com.example.mall.member.dao;

import com.example.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author keran
 * @email csuheshibo@163.com
 * @date 2021-07-18 00:00:15
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
