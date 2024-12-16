package BasicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.driver.chromedriver","/Users/tanishqmotke/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//ID Locator
		driver.findElement(By.id("inputUsername")).sendKeys("tanishq");

		//ID Locator with Css format
		//driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("tanishq");
		
		//Name Locator
		//driver.findElement(By.name("inputPassword")).sendKeys("tanu123");
		
		//CSS with regular expression:
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("Tanu");
			
		//ClassName Locator
		driver.findElement(By.className("signInBtn")).click();
		
		//Css Format for ClassName
		//driver.findElement(By.cssSelector("button.signInBtn")).click();
		
		//Css Format for ClassName --> tagname.classname
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//Xpath Locator --> //tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tanishq");
		
		//Css Format without id name and class name
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("random@gmail.com");
		
		//Xpath with parent to child and using indexing
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9123223121");
		
		driver.findElement(By.className("reset-pwd-btn")).click();
		
		//Xpath with parent to child tag
		System.out.println(driver.findElement(By.xpath("//form/p")).getText());
		
		//Css locator with classname
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();  
		
		//Css locator with id name
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("tanishq");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshettyacademy");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	
		Thread.sleep(2000);
		
	System.out.println(driver.findElement(By.tagName("p")).getText());
	 
	 Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		
	driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
	 
		System.out.println("You are successfully logout");
	
		driver.close();
	}

}
