package com.example.baitapspring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.example.baitapspring.user.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before: " + joinPoint.getSignature().getName());
    }

    @AfterReturning("execution(* com.example.baitapspring.user.*.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("After Returning: " + joinPoint.getSignature().getName());
    }

}
