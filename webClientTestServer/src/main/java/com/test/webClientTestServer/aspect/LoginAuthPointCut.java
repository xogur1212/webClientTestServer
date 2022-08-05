package com.test.webClientTestServer.aspect;


import com.sun.org.apache.xpath.internal.operations.Bool;
import com.test.webClientTestServer.model.dto.HeaderCode;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Aspect
@Component
@Slf4j
public class LoginAuthPointCut {


    @Value("${authentication.secretKey}")
    private String secretKey;
    @Value("${authentication.accessKey}")
    private String accessKey;

    @Pointcut("execution(* com.test.webClientTestServer.controller.*.*(..))")
    public void authentication() {

    }

    @Around("authentication()")
    public Object aroundAuthentication(ProceedingJoinPoint proceedingJoinPoint) {

        ServletRequestAttributes requestAttributes =
                (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        Object returnValue = null;
        String accessKey =request.getHeader("accessKey");
        String secretKey =request.getHeader("secretKey");
        if (isVerificationKey(accessKey,secretKey)) {
            try {
                returnValue = proceedingJoinPoint.proceed();
            } catch (Throwable e) {
                log.error("RuntimeException 발생");
                throw new RuntimeException(e);
            }

        } else {
            returnValue = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return returnValue;
    }


    private Boolean isVerificationKey(String accessKey, String secretKey) {


        if (this.secretKey.equals(secretKey) && this.accessKey.equals(accessKey)) {
            return true;
        }
        return false;
    }
}
