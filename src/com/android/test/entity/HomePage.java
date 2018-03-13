package com.android.test.entity;

/**
 * 新聞ViewPager的每個page頁面的標題
 * @author admin
 *
 */
public class HomePage {
	
	public int page_id;
	
	public String page_title;

	public int getPage_id() {
		return page_id;
	}

	public void setPage_id(int page_id) {
		this.page_id = page_id;
	}

	public String getPage_title() {
		return page_title;
	}

	public void setPage_title(String page_title) {
		this.page_title = page_title;
	}

	@Override
	public String toString() {
		return "Homepage [page_id=" + page_id + ", page_title=" + page_title + "]";
	}
	
	

}
