package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
	
	public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/droppable/");
		
		System.out.println(driver.findElement(By.tagName("iframe")).getSize());
		
		//driver.switchTo().frame(0);
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement source = driver.findElement(By.cssSelector("#draggable"));
		
		WebElement target = driver.findElement(By.cssSelector("#droppable"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(source,target).build().perform();
		
		
	}

}
