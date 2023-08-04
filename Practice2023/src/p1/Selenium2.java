package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {

	
		public class A1Locators {

			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\my pc\\Desktop\\SeleniumDriver\\chromedriver.exe");
				
				//step-1 Launch browser
						WebDriver driver=new ChromeDriver();
						
						//Step-2 Maximize window
						driver.manage().window().maximize();		
						
						//step-3 Open the web page
						driver.get("https://www.flipkart.com/");
						
						//step-4  find element : Click on login button and then click on it
					//	WebElement button=driver.findElement(By.className("_1_3w1N"));
					//	button.click();
						//Thread.sleep(2000);
						
						
						// Find enter mo. no. text box and enter mo no.
						WebElement textBox=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));	
						textBox.sendKeys("8007368416");
					//	Thread.sleep(2000);
						 				
						// Find password textbox and enter password
						WebElement textBoxPass=driver.findElement(By.xpath("//input[@type='password']"));	
						textBoxPass.sendKeys("141898");
						//Thread.sleep(2000);
						
						// After entering mo no and pass, find login button and click it
						WebElement button2=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));		
						button2.click();
					//	Thread.sleep(2000);
						
						//click on mobile REDMI 9i (Midnight Black, 64 GB
						WebElement image1=driver.findElement(By.xpath("//a[@class='s1Q9rs']"));		
						image1.click();
						//Thread.sleep(2000);
						
					/*	WebElement image2=driver.findElement(By.xpath("//img[@class='kJjFO0 _3DIhEh']"));		
						image2.click();
						Thread.sleep(2000);
						
						WebElement image3=driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9']"));		
						image3.click();
						Thread.sleep(2000);*/
						
						
						// click on add to cart button
						WebElement cartButton=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));		
						cartButton.click();
						//Thread.sleep(2000);
						
						
					/*	//click on place order
					WebElement orderButton=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']"));		
						orderButton.click();
						Thread.sleep(2000);
						*/
					
						
						
			}

		}

	}


