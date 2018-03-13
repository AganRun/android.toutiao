package com.android.test.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.android.test.dao.HomeDataMapper;
import com.android.test.entity.HomeData;
import com.android.test.entity.HomePage;
import com.android.test.entity.HomeTab;
import com.android.test.entity.HomeTabImg;

@Service
public class HomeDataService {

	@Autowired
	public HomeDataMapper homeDataMapper;
	
	/**
	 * 将数据库中的数据查询并封装成HomeData对象
	 * @return
	 */
	public ArrayList<HomeData> getHomeData(){
		ArrayList<HomeData> homeDataList = new ArrayList<HomeData>(12);
		
		ArrayList<HomePage> pageList = new ArrayList<HomePage>(11);
		pageList = (ArrayList<HomePage>) homeDataMapper.getAllPages();
		for (HomePage homePage : pageList) {
			
			//根据page_id得到pageTabList
			ArrayList<HomeTab> homeTabList = new ArrayList<HomeTab>(8);
			homeTabList = (ArrayList<HomeTab>) homeDataMapper.getHomeTabByPageId(homePage.getPage_id());
			
			ArrayList<HomeTabImg> homeTabImgList;
			for (int i=0; i<homeTabList.size(); i++) {
				homeTabImgList = (ArrayList<HomeTabImg>) homeDataMapper.getImgByTabId(homeTabList.get(i).getTab_id());
				homeTabList.get(i).setHometabimgs(homeTabImgList);
			}
			
			HomeData homeData = new HomeData();
			homeData.setHomepage(homePage);
			homeData.setHometabs(homeTabList);
			homeDataList.add(homeData);
			
//			System.out.println("--->" + homeData.toString());
		}
		return homeDataList;
	}
	
	//根据page_id得到改页的全部homeTabs
	public ArrayList<HomeTab> getHomeTabsByPageId(String page_id){
		ArrayList<HomeTab> homeTabs = new ArrayList<HomeTab>();
		homeTabs = (ArrayList<HomeTab>) homeDataMapper.getHomeTabByPageId(Integer.parseInt(page_id));
		ArrayList<HomeTabImg> homeTabImgList;
		for (int i=0; i<homeTabs.size(); i++) {
			homeTabImgList = (ArrayList<HomeTabImg>) homeDataMapper.getImgByTabId(homeTabs.get(i).getTab_id());
			homeTabs.get(i).setHometabimgs(homeTabImgList);
		}
		return homeTabs;
	}
	
	public ArrayList<HomeTab> getHistoryByTabs(String ids){
		ArrayList<HomeTab> tabs = new ArrayList<HomeTab>();
		String[] arrayId = ids.split(",");
		if(arrayId[0] == null || arrayId[0] == ""){
			return null;
		}else{
			for(int i=0; i<arrayId.length; i++){
				HomeTab tab = homeDataMapper.getTabById(Integer.parseInt(arrayId[i]));
				ArrayList<HomeTabImg> homeTabImgList = (ArrayList<HomeTabImg>) homeDataMapper.getImgByTabId(tab.getTab_id());
				tab.setHometabimgs(homeTabImgList);
				tabs.add(tab);
			}
			return tabs;
		}
	}
}
