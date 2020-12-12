package com.sample.test.app;

public class Testing {

	public Model verifyTest() {
		Model request = null;
		request.setClassName("com.cts.selfhealer.config.SelfHealerUIServer");
		request.setMethodName("methodName");
		System.out.println("verifyTest : " + request);
		return request;
	}
	
}
