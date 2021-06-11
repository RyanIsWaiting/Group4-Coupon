package com.icbc.group4.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.icbc.group4.domain.Admin;

@Repository
@Mapper
public interface IAdminDao {
	Admin login(@Param("account")String account, @Param("password")String password);
}
