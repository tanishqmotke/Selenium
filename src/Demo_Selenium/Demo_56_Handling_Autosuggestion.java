package Demo_Selenium;



import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_56_Handling_Autosuggestion {
	
	public static void main(String []args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","//Users//tanishqmotke//Documents//selenium//chromedriver");	
		
		//In the above css selector we have many options. We need to collect this all the options in one variable.
		
		//Here you will use the findElements has it's is plural.
		
		//Here we have used List <WebElement> because it's the return type of the findElements.
		
		
		
		//In the below every time when the looks operate then an option is selected from options. That option is stored in the variable name "Option".
		
		//Return type is WebElement
		
		WebDriver driver =new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		
		  driver.findElement(By.id("autosuggest")).sendKeys("ind");
		  
		  Thread.sleep(3000);
		  
		  List<WebElement> options
		  =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		  
		  for(WebElement option :options)
		  
		  {
		  
		  if(option.getText().equalsIgnoreCase("India"))
		  
		  {
		  
		  option.click();
		  
		  break;
		  
		  }
		  
		  }
		 
	
	driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
	// In the above you can see the ID is too big. So here you can use the release attribute.
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	
	//To check wether the check box is selected or not. In Selenium there is a method which tells us that about it.
	
	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	
	//To get the size[number] of the checkboxes on the web pages
	
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	
	System.out.println("Exit");
	
	
	}
	
}
