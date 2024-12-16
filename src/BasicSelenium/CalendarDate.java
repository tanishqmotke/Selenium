package BasicSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarDate {
	// task to select date 30 
	public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("label[ for ='departure']"))));
		
		driver.findElement(By.cssSelector("label[ for ='departure']")).click();
		
		//taken all the days in a list 
		List<WebElement> dates = driver.findElements(By.cssSelector("div[class='DayPicker-Day']"));
		
		while(!driver.findElement(By.cssSelector("div[class='DayPicker-Caption']")).getText().contains("January")) {
			
			driver.findElement(By.cssSelector("span[aria-label='Next Month")).click();
		}
		
		int count = driver.findElements(By.cssSelector("div[class='DayPicker-Day']")).size();
	
		for (int i = 0; i < count; i++) {
			
		String date = driver.findElements(By.cssSelector("div[class='DayPicker-Day']")).get(i).getText();
		
		String updatedDate = date.split("₹")[0].trim();
		
			System.out.println(updatedDate);
			
			if(updatedDate.equalsIgnoreCase("30")) {
				
				driver.findElements(By.cssSelector("div[class='DayPicker-Day']")).get(i).click();
				break;
			}
			
		}
		
	}

}
