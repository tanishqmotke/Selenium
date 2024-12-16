package BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver","/Users/tanishqmotke/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

//s	How to declare different types of array:
//		int[] arr = {1,2,3};
//		
//		int [] ar1r = new int[5];
//		
//		String[] ars = new String[4];
//		
//		ars[1]="hello";
//		
//		System.out.println(ars[1]);
//	

	}

}
