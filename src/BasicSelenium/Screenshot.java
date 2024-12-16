package BasicSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Firstly we change the webdriver object to TakeScreenshot
		
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(SrcFile,new File("/Users/tanishqmotke/seleniumScreenshot.png"));
		
	}

}
