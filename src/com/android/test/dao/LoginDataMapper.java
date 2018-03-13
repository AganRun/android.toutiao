package com.android.test.dao;

import org.springframework.stereotype.Repository;

import com.android.test.entity.Login;

@Repository
public interface LoginDataMapper {
	
	public String getName(String tel);
	
	public void setName(Login login);
	
	public void addUser(Login login);
	
	public Login queryLoginByTel(String tel);
	
	public void deleteLoginByTel(String tel);

	public Login getLoginByName(String name);
}
