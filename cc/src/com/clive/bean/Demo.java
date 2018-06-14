package com.clive.bean;

import java.util.function.Predicate;

public class Demo {
private String id;
private String name;
private String money;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMoney() {
	return money;
}
public void setMoney(String money) {
	this.money = money;
}
@Override
public String toString() {
	return "Demo [id=" + id + ", name=" + name + ", money=" + money + "]";
}
public void demo1() {
	// TODO Auto-generated method stub
	
}


}
