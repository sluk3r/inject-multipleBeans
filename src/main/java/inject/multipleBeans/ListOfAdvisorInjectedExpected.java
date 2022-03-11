package inject.multipleBeans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class ListOfAdvisorInjectedExpected {
    private String pointcut = "execution(* inject.multipleBeans.service.OrderService.*(..))";
    
    @Bean
    public AspectJExpressionPointcutAdvisor[] arrayOfAdvisorInjected() {
        log.info("arrayOfAdvisorInjected_invoked");
        AspectJExpressionPointcutAdvisor afterAdvisor = new AspectJExpressionPointcutAdvisor();
        afterAdvisor.setExpression(pointcut);
        afterAdvisor.setAdvice(new AfterDemo());
    
        AspectJExpressionPointcutAdvisor beforeAdvisor = new AspectJExpressionPointcutAdvisor();
        beforeAdvisor.setExpression(pointcut);
        beforeAdvisor.setAdvice(new BeforeDemo());
        
        return new AspectJExpressionPointcutAdvisor[]{afterAdvisor, beforeAdvisor};
    }
}
