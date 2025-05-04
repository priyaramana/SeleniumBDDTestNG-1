package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {


	/**
	 * 
	 * locators
	 * constructors
	 * page actions
	 * 
	 */

	//locators
	private static WebDriver driver;
	private By name = By.name("name");
	private By email = By.name("email");
	private By subject = By.name("subject");
	private By message = By.id("message");
	private By file = By.name("upload_file");
	private By submitBtn = By.name("submit");

	//constructors
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	//page actions

	public  void enterName(String CTname) {
		driver.findElement(name).sendKeys(CTname);
	}
	
	public void enterEmail(String CTmail) {
		driver.findElement(email).sendKeys(CTmail);
	}
	
	public void enterSubject(String CTsubject) {
		driver.findElement(subject).sendKeys(CTsubject);
	}
	
	public void enterMsg(String CTmsg) {
		driver.findElement(message).sendKeys(CTmsg);
	}
	public void addFile() {
		WebElement fileInput = driver.findElement(file);
		String filePath = "/Users/lt535j/Desktop/Screenshot 2025-04-26 at 8.33.43 PM.png";
	    fileInput.sendKeys(filePath);
	}
	
	public void clickSubmitbtn() {
		driver.findElement(submitBtn).click();
	}
}
