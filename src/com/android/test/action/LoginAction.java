package com.android.test.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.android.test.entity.Login;
import com.android.test.service.LoginService;
import com.google.gson.Gson;

import utils.SmsDemo;

/**
 * 向新闻主页传递数据
 * @author admin
 *
 */
@Controller
@RequestMapping("/login")
public class LoginAction {
	
	public String MESNUM;
	
	@Autowired
	public LoginService loginService;	
	
	//安卓请求发送验证码
	@RequestMapping("/sendMes")
	public void sendData(String command,String phone, HttpServletResponse response) throws Exception{
		response.setContentType("text/plain; charset=UTF-8");
		if(command.equals("getMesNumFromServer")){
			
			Gson gson = new Gson();
			Map map = new HashMap();
			int num = (int)((Math.random()*9+1)*1000);
			MESNUM = Integer.toString(num);
			map.put("code", MESNUM);
			
	    	SmsDemo.sendSms( phone, gson.toJson(map));
			
			response.getWriter().write(gson.toJson("SendMesNumOk"));
		}
	}
	
	//判断用户输入的验证码是否正确
	@RequestMapping("/isRightMesNum")
	public void isRightMesNum(String command,String mesNum, String phone, HttpServletResponse response) throws Exception{
		response.setContentType("text/plain; charset=UTF-8");
		if(command.equals("isRightMesNum")){
			//命令通过，允许操作
			
			if(mesNum.equals(MESNUM)){
				//验证码正确
				loginService.addUser(phone);
				response.getWriter().write("CorrectMesNum");
			}else{
				//验证码错误
				response.getWriter().write("ErrorMesNum");
			}
		}
	}
	
	//使用默认的名字登录
	@RequestMapping("/userDefaultName")
	public void userDefaultName(String command, String phone, HttpServletResponse response) throws Exception{
		response.setContentType("text/plain; charset=UTF-8");
		if(command.equals("useDefaultName")){
			//命令通过，允许操作
			Login login = loginService.queryLoginByTel(phone);
			login.setName(phone);
			loginService.setName(login);
			response.getWriter().write("DefaultNameCorrect");
		}
	}
	
	//保存用户输入的新名字
	@RequestMapping("/saveName")
	public void saveName(String command,String phone, String newName, HttpServletResponse response) throws Exception{
		response.setContentType("text/plain; charset=UTF-8");
		if(command.equals("saveName")){
			//命令通过，允许操作
			if(loginService.isExistByName(newName)){
				//如果用户名存在
				response.getWriter().write("ExistNameError");
			}else{
				//输入的用户名不存在
				Login login = loginService.queryLoginByTel(phone);
				login.setName(newName);
				loginService.setName(login);	//更新名字
				response.getWriter().write("SaveNameCorrect");
			}
		}	
	}
	
	
	//测试时用于根据手机号删除数据库信息
	@RequestMapping("/deleteData")
	public void userDefaultName(String tel) throws Exception{
		loginService.deleteLoginByTel(tel);
	}
	
	
	
	
	
	
	

}
