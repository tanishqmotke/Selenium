package Demo_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_50_DropDowns {
	
	public static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver", "//Users//tanishqmotke//Documents//selenium//chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//select dropdowns with select tag
		
		WebElement StaticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); 
		
		Select dropdown = new Select(StaticDropDown);
		
		//One way to select the webelement from the Dropdown
		
		dropdown.selectByIndex(3);
		
		//Now to get the value what we have choosen in the ouput we write
		
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//Second way to select the webelement from the Dropdown
		
		dropdown.selectByVisibleText("INR");
		
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//Third way to select the web element from the Dropdown 
		
		dropdown.selectByValue("AED");
		
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.quit();
		
		
	}
	
	

}
