package com.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class PerformMatch {
	@Pointcut("execution(* *.play1stInning(..))")
	public void first(){
		
	}
	@Pointcut("execution(* *.play2ndInning(..))")
	public void second(){
		
	}
	@Pointcut("execution(* *.*(..))")
	public void allpoint(){
		
	}
	@Before(value = "first()")
public void getSponsors(){
	System.out.println("get the sponsors");
}
	@Before(value = "allpoint()")
public void prepareGround(){
	System.out.println("preparing the ground for match");
}
	@Before(value = "first()")
	public void toss(){
		System.out.println("toss for match");
	}
	@Around("allpoint()")
	public void refreshment(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("refreshment for the players");
		try {
			Object value=proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@AfterReturning(value = "second()")
public void prizeCeremony(){
	System.out.println("prize distribution program");
}
	
	@AfterThrowing(value = "allpoint()",throwing="exception")
public void matchAbandoned(Object exception){
		System.out.println("error occured"+exception);
	System.out.println("match has been stopped due to some reasons");
}
	
}
