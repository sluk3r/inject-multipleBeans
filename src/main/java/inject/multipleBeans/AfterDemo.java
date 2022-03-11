package inject.multipleBeans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

@Slf4j
public class AfterDemo implements AfterReturningAdvice {
    
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        log.info("afterReturning_executed");
    }
}