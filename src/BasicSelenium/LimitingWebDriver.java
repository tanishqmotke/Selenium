package BasicSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LimitingWebDriver {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		//1. Task to find links present in the webpage
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2.Take to find the links present in the footer section
		WebElement footerlines = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerlines.findElements(By.tagName("a")).size());
		
		//3. Task to find the links present in the first column of the footer section
		WebElement column1 = footerlines.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(column1.findElements(By.tagName("a")).size());
		
		//4. Open each link present in the the column 
		
		for(int i = 1; i<column1.findElements(By.tagName("a")).size();i++) {
			
			String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			column1.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			
		}
		
		Set<String> links = driver.getWindowHandles();
		
		Iterator<String> i = links.iterator();
		
		while(i.hasNext()){
			driver.switchTo().window(i.next());
			System.out.println(driver.getTitle());
		}
	
	}

}
