package com.wuxi.infinitechat.authenticationservice;

import com.wuxi.infinitechat.authenticationservice.utils.JwtUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AuthenticationServiceApplicationTests {

	@Test
	void contextLoads() {
		System.out.println(JwtUtil.generate("1"));
	}

}
