package com.cpic.pmarket.web.modules.act.entity;

import java.io.Serializable;


public class ActEntity implements Serializable {
    private static final long serialVersionUID = 1L;
	
	private Long actId;

	private String actNname;

	public Long getActId() {
		return actId;
	}

	public void setActId(Long actId) {
		this.actId = actId;
	}

	public String getActNname() {
		return actNname;
	}

	public void setActNname(String actNname) {
		this.actNname = actNname;
	}

	
	
}
