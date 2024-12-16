package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CityDropDown {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	driver.findElement(By.cssSelector("input.select_CTXT")).click();

	driver.findElement(By.xpath("//a[@value='ATQ']")).click();
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
	//Here if we don't want to use the indexing then we can go with the parent child relation i.e.:
	// We can give the xpath path of the parent 'space ' xpath of the child
	//	driver.findElement(By.xpath("//div[@id=''] //div[@id='']")).click();
	
	//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	}

}
