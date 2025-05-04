package utils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import base.baseClass;

public class ScreenshotUtil {

	public static String takeScreenshot(String scenarioName) {
		
		// call driver
		WebDriver driver = baseClass.getDriver();
		
		// create screenshots folder
		final String SCREENSHOT_DIR = "src/test/resources/screenshots";
        
		// create screenshot
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// add time stamp and name
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		String screenshotName = "screenshots/" +scenarioName.replaceAll(" ", "_") + "_" + timestamp + ".png";
		//move screenshot to screenshots folder
		String filePath = SCREENSHOT_DIR + File.separator + screenshotName;
		
		// copy to destination file
		File destfile = new File(screenshotName);
		try
		{
			FileUtils.copyFile(srcfile, destfile);
		} catch(IOException e) {
			e.printStackTrace();
		}

        return screenshotName;
		
	}
}
