package com.clive.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="c")
public class bean2 implements x{
	@Value("bean2")
public String name;

@Override
public String toString() {
	return "bean2 [name=" + name + "]";
}

}
