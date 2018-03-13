package com.android.test.entity;

public class Login {
	
	
	public Login() {
		super();
	}

	public Login(String tel, String name, String password) {
		super();
		this.tel = tel;
		this.name = name;
		this.password = password;
	}

	public String tel;
	
	public String name;
	
	public String password;

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [tel=" + tel + ", name=" + name + ", password=" + password + "]";
	}
	
}
