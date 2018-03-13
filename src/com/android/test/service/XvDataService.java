package com.android.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.android.test.dao.XvDataMapper;
import com.android.test.entity.XvData;
import com.android.test.entity.Xv_page;
import com.android.test.entity.Xv_tab;
import com.google.gson.Gson;

@Service
public class XvDataService {

	@Autowired
	public XvDataMapper xvDataMapper;
	
	public List<Xv_page> getAllPages(){
		return xvDataMapper.getAllPages();
	}
	
	public ArrayList<XvData> getData(){
		ArrayList<Xv_page> pages = (ArrayList<Xv_page>) xvDataMapper.getAllPages();
		ArrayList<XvData> xvDatas = new ArrayList<XvData>();
		for(int i=0; i<pages.size(); i++){
			XvData xvData = new XvData();
			
			xvData.setXv_page(pages.get(i));
			ArrayList<Xv_tab> tabs = (ArrayList<Xv_tab>) 
					xvDataMapper.getTabsByPageId(pages.get(i).getXv_page_id());
			xvData.setXvTabs(tabs);
			
			xvDatas.add(xvData);
		}
		
		return xvDatas;
	}
}
