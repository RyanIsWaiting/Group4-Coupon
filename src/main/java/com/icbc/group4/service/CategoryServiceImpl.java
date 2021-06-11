package com.icbc.group4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icbc.group4.dao.ICategoryDao;
import com.icbc.group4.domain.Category;

@Service
public class CategoryServiceImpl implements ICategoryService{

	@Autowired
	private ICategoryDao categoryDao;
	
	public List<Category> getAllCategories() {
		List<Category> list = categoryDao.getAllCategories();
		System.out.println(list);
		return list;
	}

}
