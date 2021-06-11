package com.icbc.group4.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.icbc.group4.domain.Category;

@Repository
@Mapper
public interface ICategoryDao {
	List<Category> getAllCategories();
}
