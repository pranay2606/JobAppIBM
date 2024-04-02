package com.job.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class JobAspect {
	
	@Before(value = "execution(* com.job.controller.JobRestController.*(..))")
	public void beforeAdvise(JoinPoint jp) {
		System.out.println("Before Called "+jp.getSignature());
	}
	
	@After(value = "execution(* com.job.controller.JobRestController.*(..))")
	public void afterAdvise(JoinPoint jp) {
		System.out.println("After Called "+jp.getSignature());
	}
	@AfterReturning(value = "execution(* com.job.controller.JobRestController.*(..))")
	public void afterRetrunAdvise(JoinPoint jp) {
		System.out.println("After Return Called "+jp.getSignature());
	}
	
}
