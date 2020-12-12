package com.sample.test.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ModelTest {
	
	private Testing test;
	
	@Before
	public void initModel() {
		test = new Testing();
	}

	@Test
	public void testSum() {
		Model model = test.verifyTest();
		assertTrue("Model object is null", model != null);
		assertTrue("Model class name is mismatch", "com.cts.selfhealer.config.SelfHealerUIServer"
				.equalsIgnoreCase(model.getClassName()));
	}
}
