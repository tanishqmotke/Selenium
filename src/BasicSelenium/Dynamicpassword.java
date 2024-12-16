package BasicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicpassword {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String username = "Tanishq";
		String password = "random123";
		String email = "xyz@gmail.com";
		String phonenumber = "1234567890";

		driver.findElement(By.id("inputUsername")).sendKeys(username);

		driver.findElement(By.name("inputPassword")).sendKeys(password);

		driver.findElement(By.className("signInBtn")).click();

		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

		String NewPassword = Password(driver); // Password is the method name and driver is the parameter

		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();

		driver.findElement(By.id("inputUsername")).sendKeys(username);

		driver.findElement(By.name("inputPassword")).sendKeys(NewPassword);

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

		driver.close();
	}

	public static String Password(WebDriver driver) throws InterruptedException {

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(5000);
		driver.findElement(By.className("reset-pwd-btn")).click();

		Thread.sleep(5000);

		String password = driver.findElement(By.xpath("//form/p")).getText();
		System.out.println(password);
		// Here we are dividing the string using the split method and extracting the
		// password from it.

		String[] PasswordArray = password.split("'");
		String[] PasswordArray2 = PasswordArray[1].split("'");
		String Newpassword = PasswordArray2[0];
		System.out.println(Newpassword);
		return Newpassword;

	}
}
