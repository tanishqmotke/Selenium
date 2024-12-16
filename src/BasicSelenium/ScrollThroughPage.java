package BasicSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ScrollThroughPage {
	
	
	public static void main(String[]args) {
		
		//How to scroll in the page
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,500)");
		
		//scroll within the page in webTable
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTo(0,500)");
		
		//get the values from the webTable and validate the total
	
		
		
	}

}
