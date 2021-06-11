package com.icbc.group4.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.icbc.group4.domain.User;

@Repository
@Mapper
public interface IUserDao {
	User checkUser(@Param("phoneNumber")String phoneNumber, @Param("identityNumber")String identityNumber);
	Long register(@Param("userName")String userName, @Param("phoneNumber")String phoneNumber, @Param("identityNumber")String identityNumber);
}
