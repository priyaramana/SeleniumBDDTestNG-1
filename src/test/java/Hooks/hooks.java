package Hooks;

import base.baseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks {
/**
 * 
 * Add before and after classes
 * launch browser
 * close browser
 * capture screenshot on failed test case
 * 
 */
	//import base class
	baseClass bs = new baseClass();
	
	//launch browser
	@Before
	public void setUp() {
		bs.launchBrowser();
	}
	//screenshot
	@After(order = 1)
	public void failedTCsScreenshot(Scenario scenario){
		if(scenario.isFailed()) {
			String screenshotpath = ScreenshotUtil.takeScreenshot(scenario.getName());
			System.out.println("screenshot saved at " +screenshotpath);
		}
	}
	//quit browser
	@After()
	public void tearDown() {
		bs.quitBrowser();
	}
	
	
}
