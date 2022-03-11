package inject.multipleBeans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

@Slf4j
public class BeforeDemo implements MethodBeforeAdvice {
    public static boolean aop_method_invoked = false;
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        log.info("before_executed");
        aop_method_invoked = true;
    }
}