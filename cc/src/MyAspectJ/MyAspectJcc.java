package MyAspectJ;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Repository;
@Repository
@Aspect
public class MyAspectJcc {
	@Before(value="execution(* *..*.demoAop())")
	public void startLog() {
		System.out.println("kaiq日志");
	}
	@AfterReturning(value="execution(* *..*.demoAop())")
	public void commitLog() {
		System.out.println("hui日志");
	}
	//环绕通知
	public void around(ProceedingJoinPoint point) {
		System.out.println("事物");
		try {
			point.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("关闭事物");
	}
}
