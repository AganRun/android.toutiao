package com.android.test.entity;

public class Sv_tab {

	public int sv_id;
	
	public String sv_title;
	
	public String sv_play;
	
	public String sv_praise;
	
	public String sv_from;
	
	public String sv_from_url;
	
	public int sv_discuss;
	
	public String sv_video_url;
	
	public String sv_bg_url;
	

	public Sv_tab() {
		super();
	}

	public Sv_tab(int sv_id, String sv_title, String sv_play, String sv_praise, String sv_from, String sv_from_url,
			int sv_discuss, String sv_video_url, String sv_bg_url) {
		super();
		this.sv_id = sv_id;
		this.sv_title = sv_title;
		this.sv_play = sv_play;
		this.sv_praise = sv_praise;
		this.sv_from = sv_from;
		this.sv_from_url = sv_from_url;
		this.sv_discuss = sv_discuss;
		this.sv_video_url = sv_video_url;
		this.sv_bg_url = sv_bg_url;
	}

	public int getSv_id() {
		return sv_id;
	}

	public void setSv_id(int sv_id) {
		this.sv_id = sv_id;
	}

	public String getSv_title() {
		return sv_title;
	}

	public void setSv_title(String sv_title) {
		this.sv_title = sv_title;
	}

	public String getSv_play() {
		return sv_play;
	}

	public void setSv_play(String sv_play) {
		this.sv_play = sv_play;
	}

	public String getSv_praise() {
		return sv_praise;
	}

	public void setSv_praise(String sv_praise) {
		this.sv_praise = sv_praise;
	}

	public String getSv_from() {
		return sv_from;
	}

	public void setSv_from(String sv_from) {
		this.sv_from = sv_from;
	}

	public String getSv_from_url() {
		return sv_from_url;
	}

	public void setSv_from_url(String sv_from_url) {
		this.sv_from_url = sv_from_url;
	}

	public int getSv_discuss() {
		return sv_discuss;
	}

	public void setSv_discuss(int sv_discuss) {
		this.sv_discuss = sv_discuss;
	}

	public String getSv_video_url() {
		return sv_video_url;
	}

	public void setSv_video_url(String sv_video_url) {
		this.sv_video_url = sv_video_url;
	}

	public String getSv_bg_url() {
		return sv_bg_url;
	}

	public void setSv_bg_url(String sv_bg_url) {
		this.sv_bg_url = sv_bg_url;
	}

	@Override
	public String toString() {
		return "Sv_tab [sv_id=" + sv_id + ", sv_title=" + sv_title + ", sv_play=" + sv_play + ", sv_praise=" + sv_praise
				+ ", sv_from=" + sv_from + ", sv_from_url=" + sv_from_url + ", sv_discuss=" + sv_discuss
				+ ", sv_video_url=" + sv_video_url + ", sv_bg_url=" + sv_bg_url + "]";
	}
	
	

}
