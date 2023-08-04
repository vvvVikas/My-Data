package Base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {
	public static WebDriver driver;
	public static FileReader f;
	public static FileReader f1;
	public static Properties prop =new Properties();
	public static Properties loc =new Properties();
	
	@BeforeTest

	public void setup() throws IOException {
		FileReader f = new FileReader(System.getProperty("user.dir")+"//src//test//resources//Configfiles//config.Properties");
		prop.load(f);
		FileReader f1 = new FileReader(System.getProperty("user.dir")+"//src//test//resources//Configfiles//Locators");
		loc.load(f1);
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get(prop.getProperty("url"));
			
			
		}
	}
	@AfterTest
	public void teardown() {
	driver.quit();
	}
	
}
