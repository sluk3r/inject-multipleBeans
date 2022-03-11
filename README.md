# inject-multipleBeans
inject-multipleBeans


1. we can see that configurabledvisorBefore and configurabledvisorAfter declared in inject.multipleBeans.ConfigurableAdvisorConfig are injected into spring-aop.
2. the array of AspectJExpressionPointcutAdvisor declared in ListOfAdvisorInjectedExpected.arrayOfAdvisorInjected are not injected into spring-aop, which is expected.


Notice:
1. AspectJExpressionPointcutAdvisor is not used in inject.multipleBeans.OrderService, which is the only business service bean.