package com.skull.gateway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Test main class for api gateway.
 * 
 * @author Carlos Feitosa (carlos.feitosa.nt@gmail.com)
 * @since 2020-09-30
 *
 */
@SpringBootTest
class MpmSrvGatewayApplicationTests {

	/**
	 * Test if context loads
	 */
	@Test
	void contextLoads() {
		MpmSrvGatewayApplication.main(new String[] {});
	}

}
