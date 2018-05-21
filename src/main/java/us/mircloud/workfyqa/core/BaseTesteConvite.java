package us.mircloud.workfyqa.core;

import static us.mircloud.workfyqa.core.DriverFactory.killDriver;

import org.junit.After;

public class BaseTesteConvite {
		
	

	@After
	public void finaliza() {

	killDriver();
	
	}

}
