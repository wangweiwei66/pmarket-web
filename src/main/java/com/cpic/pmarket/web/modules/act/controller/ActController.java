package com.cpic.pmarket.web.modules.act.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpic.pmarket.web.common.utils.R;
import com.cpic.pmarket.web.modules.act.entity.ActEntity;
import com.cpic.pmarket.web.modules.act.service.ActService;


@RestController
@RequestMapping("/sys/user")
public class ActController  {
	
	@Autowired
	private ActService actService;

	
	@RequestMapping("/list")
	public R list(ActEntity act){

		List<ActEntity> actList = actService.queryList(act);
	
		return R.success().put("actList", actList);
	}

	@RequestMapping("/save")
	public R save(@RequestBody ActEntity act){
		
		actService.save(act);
		
		return R.success();
	}
	
	
}
