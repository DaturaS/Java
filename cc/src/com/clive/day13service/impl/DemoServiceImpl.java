package com.clive.day13service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.clive.day13dao.DemoDao;
import com.clive.day13service.DemoService;
@Service
//@Transactional放在配置到类上面，则表示 这个类下面的所有方法都是增强的（申明式事务管理）
public class DemoServiceImpl implements DemoService {
	@Autowired
    DemoDao demoda;
	public void updateDemo1() {
    	demoda.addDemo();
    	Show();
		demoda.uodateDemo();

	}
	private void Show() {
		System.out.println("事务控制"+1/0);
		
	}
	
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED)
	public void updateDemo2() {
		demoda.addDemo();
    	Show();
		demoda.uodateDemo();
		
	}

}
