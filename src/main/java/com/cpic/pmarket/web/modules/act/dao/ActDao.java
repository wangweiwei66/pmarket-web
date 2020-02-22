package com.cpic.pmarket.web.modules.act.dao;

import org.apache.ibatis.annotations.Mapper;

import com.cpic.pmarket.web.modules.act.entity.ActEntity;


@Mapper
public interface ActDao extends BaseDao<ActEntity> {
	
	/**
	 * 根据用户名，查询系统用户
	 */
	ActEntity queryByUserName(String username);
	

}
