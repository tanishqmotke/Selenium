package Demo_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_45 {

	public static void main(String []args) {
		
	System.setProperty("webdriver.chrome.driver","//Users//tanishqmotke//Documents//selenium//chromedriver");
	
	WebDriver driver = new ChromeDriver();
	
	//Sibling to sibling traverse
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	driver.findElement(By.xpath("//header/div/button[1]"));
	
	driver.findElement(By.xpath("//header/div/button/following-sibling::button[1]")); // here the traverse is from parent to child and then child to siblings
	
	//Now we are going to learn child to parent
	
	driver.findElement(By.xpath("//header/div/button[1]/parent::div")); // Syntax : /parent::div here the div is the tag name of the parent. 
	
	
	driver.quit();

	}
}
