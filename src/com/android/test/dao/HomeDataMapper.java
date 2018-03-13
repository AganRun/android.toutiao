package com.android.test.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.android.test.entity.HomePage;
import com.android.test.entity.HomeTab;
import com.android.test.entity.HomeTabImg;

@Repository
public interface HomeDataMapper {
	
	public List<HomePage> getAllPages();
	
	public List<HomeTab> getHomeTabByPageId(int page_id);
	
	public List<HomeTabImg> getImgByTabId(int tab_id);
	
	public HomeTab getTabById(int id);

}
