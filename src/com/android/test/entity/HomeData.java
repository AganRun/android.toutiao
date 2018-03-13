package com.android.test.entity;

import java.util.ArrayList;

public class HomeData {

	public HomePage homepage;
	
	public ArrayList<HomeTab> hometabs;

	public HomePage getHomepage() {
		return homepage;
	}

	public void setHomepage(HomePage homepage) {
		this.homepage = homepage;
	}

	public ArrayList<HomeTab> getHometabs() {
		return hometabs;
	}

	public void setHometabs(ArrayList<HomeTab> hometabs) {
		this.hometabs = hometabs;
	}

	@Override
	public String toString() {
		return "HomeData [homepage=" + homepage + ", hometabs=" + hometabs + "]";
	}
	
	
	
}
