package Demo_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_32 {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","//Users//tanishqmotke//Documents//selenium//chromedriver");
		
			 WebDriver driver = new ChromeDriver();
			 
             //implicit wait - 5 seconds time out
			 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // Need to declare after the driver object is created. Duration is a class which is calling ofSecondmethod.
			
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			
			//driver.findElement(By.id("1nputUsername")).sendKeys("tanishq"); // when the webelement doesn't exist on the webpage we get NoSuchElementException
			
			driver.findElement(By.id("inputUsername")).sendKeys("tanishq");
			
			driver.findElement(By.name("inputPassword")).sendKeys("123");
			
			driver.findElement(By.className("submit")).click();		
			
			System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
			
			driver.findElement(By.linkText("Forgot your password?")).click();
			
			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Tanishq");
			
			driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("tmotke98@gmail.com"); //customize css selector
			
			driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
			
			driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("tmotke98@gmail.com");
			
			driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("723213123"); // xpath using the index when unqiue attribute is not present
			
			driver.findElement(By.className("reset-pwd-btn")).click();
			
			System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
			
			driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.cssSelector("#inputUsername")).sendKeys("tanishq");
			
			driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); // this is a cssSelector based on regular expression. Here the scenario is, when we know a particular value is going to be constant and the rest value will be going to change then we use the *.
			
			driver.findElement(By.id("chkboxOne")).click();
			
			driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();  //this is regular expression for xpath
			
			driver.findElement(By.linkText("//button[text()='Log Out']")).click(); // xpath for the text. CssSelector /syntax can't be used on it. Instead of Button you can use * . * means Optional.
			
			//------> "//*[text()='Log Out']"
			
			
			
			
			
			
			driver.quit();
			
			
			}
	
		}
