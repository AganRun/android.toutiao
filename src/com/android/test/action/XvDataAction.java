package com.android.test.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.android.test.entity.XvData;
import com.android.test.service.XvDataService;
import com.google.gson.Gson;

@Controller
@RequestMapping("/XvData")
public class XvDataAction {

	@Autowired
	public XvDataService xvService;
	
	/**
	 * 获取西瓜视频的全部数据
	 */
	@RequestMapping("/getMainData")
	public void getXvAllData(String command, HttpServletResponse response) throws IOException{
		response.setContentType("text/plain; charset=UTF-8");
		
		ArrayList<XvData> xvDatas = xvService.getData();
		
		Gson gson = new Gson();
		response.getWriter().write(gson.toJson(xvDatas));
	}
	
}
