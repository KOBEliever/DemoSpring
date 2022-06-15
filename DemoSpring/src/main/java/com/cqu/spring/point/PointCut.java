package com.cqu.spring.point;

import org.aspectj.lang.JoinPoint;

public class PointCut {
    public void before(JoinPoint joinPoint) throws Throwable {
        System.out.println("前置增强");
        for (Object o : joinPoint.getArgs()) {
            System.out.println(o.toString());
        }
        System.out.println(joinPoint.getSignature().getName());
        System.out.println(joinPoint.getTarget().toString());
    }
}
