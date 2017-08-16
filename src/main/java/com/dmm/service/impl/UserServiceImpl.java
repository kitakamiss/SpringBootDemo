package com.dmm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dmm.dao.UserMapper;
import com.dmm.model.User;
import com.dmm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserMapper userMapper;
	
	@Override
	public User getUser(Long userid) {
		User user = userMapper.selectByPrimaryKey(userid);
		return user;
	}
	

}
