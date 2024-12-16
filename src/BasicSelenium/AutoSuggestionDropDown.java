package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropDown {

	public static void main(String []args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("Aust");
		
		Thread.sleep(4000);
		
		List<WebElement> options = driver.findElements(By.cssSelector(".ui-menu-item a"));
		
		//enhanced for loop
		for(WebElement option : options) {
			
		if(option.getText().equalsIgnoreCase("Austria"))
		{
			option.click();
			System.out.println("Clicked on Austria");
			break;
			
		} 
			
		}
	
	}
}
