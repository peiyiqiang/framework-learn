package org.example.util;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logger {

    public void before() {
        System.out.println("前置通知");
    }

    public void afterReturning()
    {
        System.out.println("后置通知");
    }

    public void afterThrowing() {
        System.out.println("异常通知");
    }

    public void after() {
        System.out.println("最终通知");
    }

    public Object around(ProceedingJoinPoint pjp) {
        Object rtValue = null;
        try {
            Object[] args = pjp.getArgs();

            System.out.println("前置通知");

            rtValue = pjp.proceed(args);

            System.out.println("后置通知");

        } catch (Throwable e) {
            System.out.println("异常通知");
        } finally {
            System.out.println("最终通知");
            return rtValue;
        }




    }

}
