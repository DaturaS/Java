package demo2.impl;



import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.clive.bean.Bean;
import com.clive.bean.x;

import demo2.democontext;
//注解方式在spring中注册类的指定对象
//@Component(value="democontext")
//如果没有value spring会以类名作为id名称 但是首字母是小写
/**
 * spring 3.0 后
 * @Component注解 细分为
 * @Service:业务层
 * @Repository：持久层：dao
 * @Controller :控制层
 * @author Administrator
 *
 */
//创建多例，默认的是单例
//@Scope(value="prototype")
@Repository
public class DemocontextImpl implements democontext {
	/**
	 *@Value("name") 普通类型的注入
	 *@Autowired   对象类型自动注入（注入的是子类对象，但是有多个子类的时候无法实习自动注入）
	 *@Resource(name="userDaoImpl") 可以指定那个子类被注入对象类型注入
	 *@PostConstruct 替代的是bean标签里面的init-method属性
	 *@PreDestroy 替代的是bean标签里面的destroy-method属性

	 */
	@Value("name")
	private String  name;
	@Value("age")
	private String age;
	@Resource(name="c")
	private x bean;
	@Resource(name="bean")
	private x bean2;
     public void demo(){
      System.out.println("注解成功"+bean+bean2);

	}

}
