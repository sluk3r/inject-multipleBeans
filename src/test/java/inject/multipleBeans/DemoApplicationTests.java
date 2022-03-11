package inject.multipleBeans;

import inject.multipleBeans.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DemoApplication.class)
@Slf4j
class DemoApplicationTests {
	@Autowired
	OrderService orderService;

	@Test
	void check_normally() {
		log.info(orderService.echo());
	}
}
