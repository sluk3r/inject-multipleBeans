package inject.multipleBeans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class ConfigurableAdvisorConfig {
    private String pointcut = "execution(* inject.multipleBeans.OrderService.*(..))";
    
    @Bean
    public AspectJExpressionPointcutAdvisor configurabledvisorBefore() {
        log.info("configurabledvisorBefore");
        AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
        advisor.setExpression(pointcut);
        advisor.setAdvice(new BeforeDemo());
        return advisor;
    }
    
    @Bean
    public AspectJExpressionPointcutAdvisor configurabledvisorAfter() {
        log.info("configurabledvisorAfter");
        AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
        advisor.setExpression(pointcut);
        advisor.setAdvice(new AfterDemo());
        return advisor;
    }
}
