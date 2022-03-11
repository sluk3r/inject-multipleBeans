package com.jd.brick;

import com.jd.brick.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DemoApplication.class)
class DemoApplicationTests {
	@Autowired
	OrderService orderService;

	@Test
	void check_normally() {
		System.out.println(orderService.echo());
	}
}
