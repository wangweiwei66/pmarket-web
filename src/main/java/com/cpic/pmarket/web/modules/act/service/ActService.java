package com.cpic.pmarket.web.modules.act.service;

import java.util.List;

import com.cpic.pmarket.web.modules.act.entity.ActEntity;

public interface ActService {
	
	List<ActEntity> queryList(ActEntity act);
	
	int queryTotal(ActEntity act);
	
	void save(ActEntity act);

	void update(ActEntity act);
	
	void delete(String actId);
	
}
