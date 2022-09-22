package com.demo.test.SampleDemo;

import org.testng.annotations.Test;

public class ValidatePlayersCountry extends ReusableComponents {

	@Test
	public void testScenario1() throws Exception {
		verifyPlayers();
		//verifyRole();
	}
}
