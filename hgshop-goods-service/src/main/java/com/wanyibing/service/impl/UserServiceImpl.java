package com.wanyibing.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AfterDomainEventPublication;

import com.wanyibing.config.AdminProperties;
import com.wanyibing.service.UserService;


/**
 * 
 * @author zhuzg
 *
 */
@Service(interfaceClass=UserService.class,version="1.0.0")
public class UserServiceImpl implements UserService{

	@Autowired
	AdminProperties adminPro;
	
	@Override
	public boolean login(String userName, String passWord) {
		// 判断用户和密码是否偶尔u照顾文件 一致
		return (adminPro.getAdminName().equals(userName) 
			&& adminPro.getPassword().equals(passWord));	
			
		
	}

}
