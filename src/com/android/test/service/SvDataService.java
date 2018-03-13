package com.android.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.android.test.dao.SvDataMapper;
import com.android.test.entity.Sv_tab;

@Service
public class SvDataService {

	@Autowired
	public SvDataMapper svDataMapper;
	
	public List<Sv_tab> getAllSvData(){
		return svDataMapper.getAllSvTabs();
	}
}
