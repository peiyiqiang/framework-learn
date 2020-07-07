package org.example.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("logger")
@Aspect
public class Logger {
    //注解建议用环绕通知。
    //后置通知与异常通知/最终通知的执行顺序有问题

    @Pointcut("execution(* org.example.service.impl.*.*(..)))")
    private void pt() {}

//    @Before("pt()")
    public void before() {
        System.out.println("前置通知");
    }

//    @AfterReturning("pt()")
    public void afterReturning()
    {
        System.out.println("后置通知");
    }

//    @AfterThrowing("pt()")
    public void afterThrowing() {
        System.out.println("异常通知");
    }

//    @After("pt()")
    public void after() {
        System.out.println("最终通知");
    }

    @Around("pt()")
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
