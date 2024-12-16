package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

public static void main(String[]args) {
	
	// In this we have studied parent to child traverse 
	// Sibling to sibling traverse 
	// Studied child to parent traverse
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	String s = driver.findElement(By.xpath("//header/div/button[1]")).getText();
	
	System.out.println(s);
	
	String t = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).getText();
	
	System.out.println(t);
	
	driver.findElement(By.xpath("//header/div/button[1]/parent::div"));
	
	// If you want to traverse from parent to grand parent then
	 
	driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header"));
	
	// If you want to traverse from grand parent to parent then
	
	driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/a"));
	
	
	 
}
}
