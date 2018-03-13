package com.android.test.entity;

import java.util.ArrayList;

/**
 * 每个page页面中ListView的条目显示内容
 * @author admin
 *
 */
public class HomeTab {
	
	public int tab_id;
	
	public int page_id;
	
	public String tab_title;
	
	public String tab_from;
	
	public int tab_discuss;
	
	public String tab_time;
	
	public String tab_url;
	
	public ArrayList<HomeTabImg> hometabimgs;

	public int getTab_id() {
		return tab_id;
	}

	public void setTab_id(int tab_id) {
		this.tab_id = tab_id;
	}

	public int getPage_id() {
		return page_id;
	}

	public void setPage_id(int page_id) {
		this.page_id = page_id;
	}

	public String getTab_title() {
		return tab_title;
	}

	public void setTab_title(String tab_title) {
		this.tab_title = tab_title;
	}

	public String getTab_from() {
		return tab_from;
	}

	public void setTab_from(String tab_from) {
		this.tab_from = tab_from;
	}

	public int getTab_discuss() {
		return tab_discuss;
	}

	public void setTab_discuss(int tab_discuss) {
		this.tab_discuss = tab_discuss;
	}

	public String getTab_time() {
		return tab_time;
	}

	public void setTab_time(String tab_time) {
		this.tab_time = tab_time;
	}

	public String getTab_url() {
		return tab_url;
	}

	public void setTab_url(String tab_url) {
		this.tab_url = tab_url;
	}

	public ArrayList<HomeTabImg> getHometabimgs() {
		return hometabimgs;
	}

	public void setHometabimgs(ArrayList<HomeTabImg> hometabimgs) {
		this.hometabimgs = hometabimgs;
	}

	@Override
	public String toString() {
		return "HomeTab [tab_id=" + tab_id + ", page_id=" + page_id + ", tab_title=" + tab_title + ", tab_from="
				+ tab_from + ", tab_discuss=" + tab_discuss + ", tab_time=" + tab_time + ", tab_url=" + tab_url
				+ ", hometabimgs=" + hometabimgs + "]";
	}
	
}
