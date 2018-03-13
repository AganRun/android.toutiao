package com.android.test.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.android.test.entity.Xv_page;
import com.android.test.entity.Xv_tab;

@Repository
public interface XvDataMapper {

	public List<Xv_page> getAllPages();
	
	public List<Xv_tab> getTabsByPageId(int page_id);
}
