package com.lifecycle;
import javax.annotation.*;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CustBean implements InitializingBean , DisposableBean{

	String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
public CustBean(){
	System.out.println("inside the constructor");
}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("disposable bean called");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("initializing bean called");
	}
	public void init(){
		System.out.println("from custom init method");
	}

	public void customDestroy(){
		System.out.println("destroying custom destroy method");
	}
	@PreDestroy
	public void annodestroy(){
		System.out.println("destroy using @@ annotation");
	}
	@PostConstruct
	public void annoinit(){
		System.out.println("init using @@ annotation");
	}
}
