package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my pc\\Desktop\\SeleniumDriver\\chromedriver.exe");
		
		//step-1 Launch browser
				WebDriver driver=new ChromeDriver();
				
				//Step-2 Maximize window
				driver.manage().window().maximize();		
				
				//step-3 Open the web page
				driver.get("https://www.flipkart.com/");
		
	}

}
