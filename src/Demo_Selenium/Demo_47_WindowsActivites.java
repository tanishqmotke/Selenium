package Demo_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_47_WindowsActivites {

	public static void main(String [] args) {
		
		System.setProperty("webdriver.chrome.driver","//Users//tanishqmotke//Documents//selenium//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.navigate().to("https://google.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().to("https://facebook.com");
		
		driver.navigate().refresh();
	
	}
}
