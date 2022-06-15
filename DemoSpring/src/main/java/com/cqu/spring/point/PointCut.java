package com.cqu.spring.point;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class PointCut {
    public void before(JoinPoint joinPoint) throws Throwable {
        System.out.println("前置增强");
        for (Object o : joinPoint.getArgs()) {
            System.out.println(o.toString());
        }
        System.out.println(joinPoint.getSignature().getName());
        System.out.println(joinPoint.getTarget().toString());
    }

    /**
     * 后置增强
     */
    public void afterReturning(JoinPoint joinPoint) {
        System.out.println(joinPoint.getArgs().length + "启动后置增强");
    }

    /**
     * 异常抛出增强
     */
    public void afterThrowing() {
        System.out.println("启动异常抛出增强!");
    }

    /**
     * 最终增强
     */
    public void after() {
        System.out.println("启动最终增强!");
    }

    /**
     * 环绕增强
     */
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("启动环绕前置增强");
        //放行 接收到的返回数据 就是被织入方法的返回值
        Object[] objs = {"aaa", "bbb", "ccc"};
        Object proceed = pjp.proceed(objs);//执行被织入的方法
        System.out.println("启动环绕后置增强");
        return proceed;
    }

}
