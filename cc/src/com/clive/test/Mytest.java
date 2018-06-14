package com.clive.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.clive.bean.Bean;
import com.clive.bean.Demo;
import com.clive.day13service.DemoService;

import demo2.democontext;
import demo3.Demo3;
public class Mytest {
  @Test
  public void testSpring() {
	ApplicationContext aContext= new ClassPathXmlApplicationContext("ac.xml");
	com.clive.demo.Demo spring =  (com.clive.demo.Demo) aContext.getBean("demoSpring");
	spring.demo1();
	
  }
  @Test
  public void testSpring2() {
	  ApplicationContext aContext= new ClassPathXmlApplicationContext("ac.xml");
	  Bean bean = (Bean) aContext.getBean("bean");
	  System.out.println(bean);
  }
  @Test
  public void testSpring3() {
	  ApplicationContext aContext= new ClassPathXmlApplicationContext("ac.xml");
	democontext  bean =  (democontext) aContext.getBean("democontextImpl");
	 bean.demo();
  }
  @Test
  public void testAop() {
	  ApplicationContext aContext=new ClassPathXmlApplicationContext("ac.xml");
	   Demo3 demo3= (Demo3) aContext.getBean("demo3Impl");
	   demo3.demoAop();
  }
  @Test
  public void testSql() {
	  ApplicationContext aContext=new ClassPathXmlApplicationContext("ac.xml");
	  JdbcTemplate jdbcTemplate = (JdbcTemplate) aContext.getBean("jdbcTemplate");
	    List<Demo> query = jdbcTemplate.query("select*from damo",new MyRowMapper());
	  	System.out.println(query);
  }
  
  @Test
  public void testSql3() {
	  ApplicationContext aContext=new ClassPathXmlApplicationContext("ac.xml");
	  DemoService  bean = (DemoService) aContext.getBean("demoServiceImpl");
	 //bean.updateDemo1();
	 
	 bean.updateDemo2();
  }
}
