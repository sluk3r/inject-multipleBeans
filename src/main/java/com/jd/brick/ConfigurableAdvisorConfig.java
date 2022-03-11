package com.jd.brick;

import org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurableAdvisorConfig {
    private String pointcut = "execution(* com.jd.brick.service.OrderService.*(..))";
    
    @Bean
    public AspectJExpressionPointcutAdvisor configurabledvisorBefore() {
        System.out.println("configurabledvisorBefore");
        AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
        advisor.setExpression(pointcut);
        advisor.setAdvice(new BeforeDemo());
        return advisor;
    }
    
    @Bean
    public AspectJExpressionPointcutAdvisor configurabledvisorAfter() {
        System.out.println("configurabledvisorAfter");
        AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
        advisor.setExpression(pointcut);
        advisor.setAdvice(new AfterDemo());
        return advisor;
    }
}
