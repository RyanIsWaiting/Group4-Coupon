package com.icbc.group4.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.icbc.group4.dao.ISeckillDao;

@Service
public class SeckillService implements ISeckillService{
	
	private ISeckillDao seckillDao;
	
	public List<Map<String, Object>> queryAllCoupons() {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, Object> queryCouponById(Map<String, Object> m) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Map<String, Object>> queryOrderByUserIdAndCouponId(Map<String, Object> m) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer updateCoupon(Map<String, Object> m) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer insertOrder(Map<String, Object> m) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
