package com.android.test.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.android.test.entity.Sv_tab;
import com.android.test.service.SvDataService;
import com.google.gson.Gson;

@Controller
@RequestMapping("/svAction")
public class SvDataAction {
	
	@Autowired
	public SvDataService svDataService;

	@RequestMapping("/getAllData")
	public void getXvAllData(String command, HttpServletResponse response) throws IOException{
		response.setContentType("text/plain; charset=UTF-8");
		
		ArrayList<Sv_tab> svTabs = (ArrayList<Sv_tab>) svDataService.getAllSvData();
		
		Gson gson = new Gson();
		response.getWriter().write(gson.toJson(svTabs));
	}
}
