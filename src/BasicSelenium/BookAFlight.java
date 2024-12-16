package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookAFlight {
	
	public static void main(String [] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		
		Thread.sleep(5000);
		
		List<WebElement> options = driver.findElements(By.cssSelector(".ui-menu-item a"));
		
		for(WebElement option : options) {
			
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				System.out.println("Clicked on India");
				break;
				
			} 
				
			}
		
		driver.findElement(By.className("select_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
		
	driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
	
	driver.findElement(By.id("divpaxinfo")).click();
	
	Thread.sleep(5000);
	
	for(int i=1;i<5;i++) {
		
		driver.findElement(By.id("hrefIncAdt")).click();
		
	}
	System.out.println(driver.findElement(By.id("spanAudlt")).getText());
	
	driver.findElement(By.id("btnclosepaxoption")).click();
	
	WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	
	Select selectdropdown = new Select(dropdown);
	
	selectdropdown.selectByValue("AED");
	
	driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	
	driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();	
	
	driver.close();
		}

		
	
		
	}


