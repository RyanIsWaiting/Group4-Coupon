package com.icbc.group4.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ISeckillDao {
    List<Map<String, Object>> queryAllCoupons();

    Map<String, Object> queryCouponById(Map<String, Object> m);

    List<Map<String, Object>> queryOrderByUserIdAndCouponId(Map<String, Object> m);

    Integer updateCoupon(Map<String, Object> m);

    Integer insertOrder(Map<String, Object> m);
}
