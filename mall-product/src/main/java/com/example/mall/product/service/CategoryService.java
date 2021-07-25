package com.example.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.example.mall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author keran
 * @email csuheshibo@163.com
 * @date 2021-07-17 22:09:45
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);


    /**
     * 查出所有分类以及子分类，以树结构进行组装
     */
    List<CategoryEntity> listWithTree();
}

