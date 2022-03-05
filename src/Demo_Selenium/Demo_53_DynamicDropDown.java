package Demo_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_53_DynamicDropDown {
	
	public static void main (String[]args) {
	
	System.setProperty("webdriver.chrome.driver","//Users//tanishqmotke//Documents//selenium//chromedriver");
	
	WebDriver driver = new ChromeDriver();
	
	   driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   
	   driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	   
	   driver.findElement(By.xpath("//a[@value='COK']")).click();
	   
	   driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	   
	   driver.findElement(By.xpath("(//a[@value='PNQ'])[2]")).click();
	
	}
}
