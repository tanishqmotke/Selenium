package BasicSelenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class ActionsDemo{
	
	
	public static void main (String[]args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		Actions a = new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		
		a.click(searchbox).keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().sendKeys(Keys.DELETE)
		.build().perform();

	}
	
}

