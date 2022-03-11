package inject.multipleBeans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class OrderService {
    public String echo() {
        log.info("saveOrder_invoked");
        log.info("about to exit");
        return "echo_result";
    }
    
    protected String protectedMethod() {
        return "protectedMethod";
    }
    
     String packagePrivateMethod() {
        return "packagePrivateMethod";
    }
    
    private String privateMethod() {
        return "privateMethod";
    }

}
