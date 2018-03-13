package com.android.test.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.android.test.entity.HomeData;
import com.android.test.entity.HomeTab;
import com.android.test.service.HomeDataService;
import com.google.gson.Gson;

/**
 * 向新闻主页传递数据
 * @author admin
 *
 */
@Controller
@RequestMapping("/homeData")
public class HomeDataAction {
	
	@Autowired 
	public HomeDataService homeDataService;
	
	//向安卓发送Home页面相关数据
	@RequestMapping("/send")
	public void sendData(String command, HttpServletResponse response) throws Exception{
		response.setContentType("text/plain; charset=UTF-8");
		if(command.equals("getHomeDataRequest")){
			ArrayList<HomeData> homeDataList = homeDataService.getHomeData();
			Gson gson = new Gson();
			response.getWriter().write(gson.toJson(homeDataList));
		}
	}
	
	//根据page_id向安卓端发送数据
	@RequestMapping("/getByPageId")
	public void getByPageId(String command, String page_id, HttpServletResponse response) throws Exception{
		response.setContentType("text/plain; charset=UTF-8");
		if(command.equals("getDataByPageId")){
			ArrayList<HomeTab> homeTabs = homeDataService.getHomeTabsByPageId(page_id);
			Gson gson = new Gson();
			response.getWriter().write(gson.toJson(homeTabs));
		}
	}
	
	//根据历史的id获取数据
	@RequestMapping("/getHistory")
	public void getHistoryData(String command, String tab_ids, HttpServletResponse response) throws Exception{
		response.setContentType("text/plain; charset=UTF-8");
		ArrayList<HomeTab> homeTabs = homeDataService.getHistoryByTabs(tab_ids);
		Gson gson = new Gson();
		response.getWriter().write(gson.toJson(homeTabs));
	}
	

}
