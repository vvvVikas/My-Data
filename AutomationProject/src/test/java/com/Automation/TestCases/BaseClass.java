package com.Automation.TestCases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	
	public String baseUrl="https://demo.guru99.com/V1";
	public String username="mngr511312";
	public String password="dusEzuq";
	public static WebDriver driver;
	
	
	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public static void tearDown() {
		//driver.quit();
	}

}
