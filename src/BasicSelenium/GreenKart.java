package BasicSelenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");


		String[] addVegetable = { "Cucumber", "Beetroot", "Carrot" };

		driver.manage().window().maximize();
		
		List<WebElement> vegetableName = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < vegetableName.size(); i++) {

			String[] vegetable = vegetableName.get(i).getText().split("-");
			String nameOfVegetable = vegetable[0].trim();

			// convert Array into ArrayList
			List<String> itemsNeededList = Arrays.asList(addVegetable);

			if (itemsNeededList.contains(nameOfVegetable)) {

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
		}
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("span.promoInfo"))));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		Assert.assertEquals(driver.findElement(By.cssSelector("span.promoInfo")).getText(),"Code applied ..!");
		
	}

}
