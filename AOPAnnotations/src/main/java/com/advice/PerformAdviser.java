package com.advice;

import org.aspectj.lang.annotation.*;


@Aspect
public class PerformAdviser {
	@Before(value = "audience()")
public void takeSeats(){
	System.out.println("audience take seats");
}
	@Before(value = "audience()")
public void turnMobiles(){
	System.out.println("audience turning off mobiles");
}
	@AfterReturning(value = "audience()")
public void applaud(){
	System.out.println("audience applauding");
}
	@AfterThrowing(value = "audience()",throwing="exception")
public void moneyRefund(Object exception){
		System.out.println("error occured"+exception);
	System.out.println("audience asking refunds");
}
	@Pointcut("execution(* *.perform(..))")
	public void audience(){
		
	}

}
