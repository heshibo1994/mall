package com.example.mall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mall.coupon.entity.SmsCouponEntity;
import com.example.mall.coupon.service.SmsCouponService;
import com.common.utils.PageUtils;
import com.common.utils.R;


/**
 * 优惠券信息
 *
 * @author keran
 * @email csuheshibo@163.com
 * @date 2021-07-17 23:53:52
 */
@RefreshScope
@RestController
@RequestMapping("coupon/smscoupon")
public class SmsCouponController {
    @Autowired
    private SmsCouponService smsCouponService;

    // 测试Nacos配置中心
    @Value("${mall.coupon.name}")
    private String name;

    @RequestMapping("/test/config")
    public R test() {
        return R.ok().put("name", name);
    }

    // 测试Feign远程调用
    @RequestMapping("/member/list")
    public R memberCoupons() {
        SmsCouponEntity smsCouponEntity = new SmsCouponEntity();
        smsCouponEntity.setCouponName("满100减10");
        return R.ok().put("coupons", Arrays.asList(smsCouponEntity));
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:smscoupon:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = smsCouponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:smscoupon:info")
    public R info(@PathVariable("id") Long id) {
        SmsCouponEntity smsCoupon = smsCouponService.getById(id);

        return R.ok().put("smsCoupon", smsCoupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("coupon:smscoupon:save")
    public R save(@RequestBody SmsCouponEntity smsCoupon) {
        smsCouponService.save(smsCoupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:smscoupon:update")
    public R update(@RequestBody SmsCouponEntity smsCoupon) {
        smsCouponService.updateById(smsCoupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("coupon:smscoupon:delete")
    public R delete(@RequestBody Long[] ids) {
        smsCouponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
