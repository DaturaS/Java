package demo3.impl;

import org.springframework.stereotype.Repository;

import demo3.Demo3;

@Repository
public class Demo3Impl implements Demo3 {

	
	public void demoAop() {
		
		System.out.println("面向切面，如同动态代理");

	}

}
