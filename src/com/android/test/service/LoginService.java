package com.android.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.android.test.dao.LoginDataMapper;
import com.android.test.entity.Login;

@Service
public class LoginService {

	@Autowired
	public LoginDataMapper loginMapper;
	
	public String getName(String tel){
		return loginMapper.getName(tel);
	}
	
	public void setName(Login login){
		loginMapper.setName(login);
	}
	
	public void addUser(String tel){
		Login login = new Login(tel, " ", "");
		loginMapper.addUser(login);
	}
	
	public Login queryLoginByTel(String tel){
		return loginMapper.queryLoginByTel(tel);
	}
	
	public void deleteLoginByTel(String tel){
		loginMapper.deleteLoginByTel(tel);
	}
	
	public boolean isExistByName(String name){
		Login login = loginMapper.getLoginByName(name);
		if(login == null){
			return false;
		}
		return true;
		
	}
}
