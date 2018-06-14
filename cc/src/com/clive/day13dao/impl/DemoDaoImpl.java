package com.clive.day13dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import com.clive.day13dao.DemoDao;

public class DemoDaoImpl extends JdbcDaoSupport implements DemoDao  {
 
	@Override
	public void addDemo() {
	this.getJdbcTemplate().update("UPDATE damo SET money = money-100 WHERE id = 1");
	

	}

	@Override
	public void uodateDemo() {
		this.getJdbcTemplate().update("UPDATE damo SET money = money+100 WHERE id = 2");

	}

}
