package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.configReader;

public class baseClass {

	/**
	 * 
	 * launch browser
	 * read configurations from config.properties
	 * use webdriver manager
	 * handle basic browser setup and teardown
	 * 
	 */
	
	private static WebDriver driver;
	
	//launch browser
	public void launchBrowser() {
		configReader.loadconfig();
		
		String browser = configReader.get("browser");
		String url = configReader.get("baseUrl");
		int timeout = Integer.parseInt("implicitWait");
		int Pageloadtime = Integer.parseInt("pageLoadTimeout");
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else {
			throw new RuntimeException("browser not found" + browser);
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Pageloadtime));
		driver.get(url);
	}
	public void quitBrowser() {
		if(driver!=null)
		driver.quit();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}


