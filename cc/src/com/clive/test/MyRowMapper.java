package com.clive.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.clive.bean.Demo;


public class MyRowMapper implements RowMapper<Demo>{
    @Override
	public Demo mapRow(ResultSet re, int num) throws SQLException {
		// TODO Auto-generated method stub
    	
    		Demo demo = new Demo();
    		demo.setId(re.getString("id"));
    		demo.setName(re.getString("name"));
    		demo.setMoney(re.getString("money"));
    		return demo;
    	
    	
    	
		
	}

}
