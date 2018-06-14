package com.clive.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Bean implements x{
	public Bean(String xy) {
		System.out.println("通过构造方法实现"+xy);
	}
 public void setList(List<String> list) {
		this.list = list;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
private String name2;
 private  String age;
 private String time;
 private List<String> list;
 private Set<String> set;
 private Map<String, String> map;
 
public void setName2(String name2) {
	this.name2 = name2;
}
public void setAge(String age) {
	this.age = age;
}
public void setTime(String time) {
	this.time = time;
}
@Override
public String toString() {
	return "Bean [name2=" + name2 + ", age=" + age + ", time=" + time + ", list=" + list + ", set=" + set + ", map="
			+ map + "]";
}


}
