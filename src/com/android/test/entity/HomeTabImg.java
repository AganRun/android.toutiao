package com.android.test.entity;

/**
 * list中的item显示的图片
 * @author admin
 *
 */
public class HomeTabImg {

	public String img_id;
	
	public int tab_id;
	
	public String img_url;

	public String getImg_id() {
		return img_id;
	}

	public void setImg_id(String img_id) {
		this.img_id = img_id;
	}

	public int getTab_id() {
		return tab_id;
	}

	public void setTab_id(int tab_id) {
		this.tab_id = tab_id;
	}

	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	@Override
	public String toString() {
		return "HomeTabImg [img_id=" + img_id + ", tab_id=" + tab_id + ", img_url=" + img_url + "]";
	}
	
	
}
