package inject.multipleBeans;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = DemoApplication.class)
@Slf4j
class DemoApplicationTests {
	@Autowired
	OrderService orderService;
	
	@BeforeEach
	public void setUp() {
		BeforeDemo.aop_method_invoked = false;
	}

	@Test
	void check_normally() {
		log.info(orderService.echo());
	}
	
	@Test
	void protected_method() {
		assertFalse(BeforeDemo.aop_method_invoked, "方法调用前标识为False");
		orderService.protectedMethod();
		assertTrue(BeforeDemo.aop_method_invoked, "protectedMethod被Aop拦截");
	}

	@Test
	void p_method() {
		assertFalse(BeforeDemo.aop_method_invoked, "方法调用前标识为False");
		orderService.packagePrivateMethod();
		assertTrue(BeforeDemo.aop_method_invoked, "packagePrivateMethod被Aop拦截");
	}
	
	@Test
	void private_method() {
		assertFalse(BeforeDemo.aop_method_invoked, "方法调用前标识为False");
		
		String privateMethodResult = ReflectionTestUtils.invokeMethod(orderService, "privateMethod");
		assertEquals("privateMethod", privateMethodResult);
		
		assertFalse(BeforeDemo.aop_method_invoked, "privateMethod没能被Aop拦截");
	}
	
	
}