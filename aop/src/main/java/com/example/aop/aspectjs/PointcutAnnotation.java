package com.example.aop.aspectjs;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PointcutAnnotation {
    @Pointcut("execution(* transfer())")
    private void anyOldTransfer() {

    }
}
