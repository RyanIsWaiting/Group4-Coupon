package com.icbc.group4.service;

import java.util.List;
import java.util.Map;

public interface ISeckillService {
    List<Map<String, Object>> queryAllCoupons();

    Map<String, Object> queryCouponById(Map<String, Object> m);

    List<Map<String, Object>> queryOrderByUserIdAndCouponId(Map<String, Object> m);

    Integer updateCoupon(Map<String, Object> m);

    Integer insertOrder(Map<String, Object> m);
}
