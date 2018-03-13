package com.android.test.entity;

import java.util.List;

public class XvData {

	public XvData() {
		super();
	}

	public XvData(Xv_page xv_page, List<Xv_tab> xvTabs) {
		super();
		this.xv_page = xv_page;
		this.xvTabs = xvTabs;
	}

	public Xv_page xv_page;
	
	public List<Xv_tab> xvTabs;

	public Xv_page getXv_page() {
		return xv_page;
	}

	public void setXv_page(Xv_page xv_page) {
		this.xv_page = xv_page;
	}

	public List<Xv_tab> getXvTabs() {
		return xvTabs;
	}

	public void setXvTabs(List<Xv_tab> xvTabs) {
		this.xvTabs = xvTabs;
	}
	
	
}
