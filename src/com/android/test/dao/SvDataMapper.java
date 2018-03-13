package com.android.test.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.android.test.entity.Sv_tab;

@Repository
public interface SvDataMapper {

	public List<Sv_tab> getAllSvTabs();
}
