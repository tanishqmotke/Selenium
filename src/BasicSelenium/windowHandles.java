package BasicSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowHandles {
	
	public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		//To switch from parent to child window
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set <String> opentabs = driver.getWindowHandles();
		
		Iterator <String>i  =	opentabs.iterator();
		
		String parent = i.next();
		
		String childid = i.next();
		
		driver.switchTo().window(childid);
		String username = driver.findElement(By.cssSelector(".im-para.red")).getText();
		
		String updatedusername = username.split("at")[1].split("with")[0].trim();
		
		System.out.println(updatedusername);
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.id("username")).sendKeys(updatedusername);
		
	}

}
