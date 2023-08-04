package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001 extends BaseTest {
	
@Test
	
	public static void loginTest() throws InterruptedException {
		driver.findElement(By.linkText(loc.getProperty("signInLink"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("email"))).sendKeys("vvvpole@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("next"))).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys("Vikas.141");
	//	driver.findElement(By.xpath(loc.getProperty("signIn"))).click();
		//Thread.sleep(2000);
		
	}

	

}
