package org.example.openapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 打印入参
 *
 * @author jinyue 2022/05/23
 */
@Aspect
@Component
public class CommandAspect {
    private final static Logger logger = LoggerFactory.getLogger(CommandAspect.class);
    @Resource
    ObjectMapper objectMapper;

    /**
     * 所有command为切入点
     */
    @Pointcut("bean(openController) ")
    public void commandLog() {
    }

    /**
     * 在切点之前织入
     *
     * @param joinPoint joinPoint
     */
    @Before("commandLog()")
    public void doBefore(JoinPoint joinPoint) throws JsonProcessingException {

        // 打印调用的全路径以及执行方法
        logger.info(">>>>>>> {}.{}", joinPoint.getSignature().getDeclaringTypeName(),
                joinPoint.getSignature().getName());
        // 打印请求入参
        logger.info(">>>>>>> {}", objectMapper.writeValueAsString(joinPoint.getArgs()));
    }
}