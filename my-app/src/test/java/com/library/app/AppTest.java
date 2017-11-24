package com.library.app;

import static org.assertj.core.api.Assertions.*;


import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {
	
	@ClassRule
	public static OutputCapture outputCapture = new OutputCapture();
	
	@Test
	public void testMain() {
		String output = AppTest.outputCapture.toString();
		assertThat(output).contains("firstName = 'Alice, lastName = 'Smith'");
		
	}
}
