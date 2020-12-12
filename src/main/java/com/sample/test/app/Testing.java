package com.sample.test.app;

public class Testing {

	public Model verifyTest() {
		Model request = null;
		try {			
			request.setClassName("com.cts.selfhealer.config.SelfHealerUIServer");
			request.setMethodName("methodName");
			System.out.println("verifyTest : " + request);
		} catch (RuntimeException e) {
			System.out.println("Null pointer " + e.getMessage());
		}
		return request;
	}
	
}
