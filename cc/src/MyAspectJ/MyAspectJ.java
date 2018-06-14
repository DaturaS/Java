package MyAspectJ;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Repository;
@Repository
public class MyAspectJ {
public void startLog() {
	System.out.println("开启日志");
}
public void commitLog() {
	System.out.println("提交日志");
}
//环绕通知
public void around(ProceedingJoinPoint point) {
	System.out.println("开启事物");
	try {
		point.proceed();
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("关闭事物");
}
}