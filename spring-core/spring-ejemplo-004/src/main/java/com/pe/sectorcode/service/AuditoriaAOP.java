package com.pe.sectorcode.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuditoriaAOP
{

  @Before("execution(* com.pe.sectorcode.beans.*.*(..))")
  public void beforeAdvice(JoinPoint jp)
  {
    System.out.println("Auditoría antes del método: " + jp.getSignature());

    for (Object o : jp.getArgs()) {
      System.out.println("Parametro :" + o.toString());
    }

  }

  @AfterReturning("execution(* com.pe.sectorcode.beans.*.*(..))")
  public void afterAdvice(JoinPoint jp)
  {
    System.out.println("Auditoría después del método: " + jp.getSignature());
  }

  @AfterThrowing("execution(* com.pe.sectorcode.beans.*.*(..))")
  public void afterExcepcion(JoinPoint jp)
  {
    System.out.println("Auditoría después de la excepción: " + jp.getSignature());
  }
}
