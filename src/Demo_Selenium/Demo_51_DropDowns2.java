package Demo_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo_51_DropDowns2 {

	public static void main(String[]args) throws InterruptedException{
		
		int j=1;
		
		System.setProperty("webdriver.chrome.driver","//Users//tanishqmotke//Documents//selenium//chromedriver");		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		for(int i=0; i<4; i++) {
			
		driver.findElement(By.id("hrefIncAdt")).click();
		
		}
		
		while(j<5) {
			
			driver.findElement(By.id("hrefIncChd")).click();
			j++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		driver.quit();
		
	
	}
}
