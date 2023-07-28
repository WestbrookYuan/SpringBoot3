package com.yty.aop;

import com.yty.aop.service.SomeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Lession09AopApplicationTests {

	@Autowired
	private SomeService some;
	@Test
	public void testLog(){
		some.query(175147);
	}

}
