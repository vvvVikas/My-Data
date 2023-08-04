package com.p1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ClassA {

	
	public static String  dataReader(int row, int cell) throws IOException {
		
		String location="C://Users//my pc//eclipse-workspace//Practice_Project2//Excelsheet//DataRead.xlsx";
		File file =new File (location);
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String value=sheet1.getRow(row).getCell(cell).getStringCellValue();
		wb.close();
		return value;	
	}
	public static void main(String[] args) throws IOException   {
//		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://jqueryui.com/datepicker/");
//
//		WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
//		driver.switchTo().frame(frame);
//	driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
//		  
//		 
//		 
		 

//		TakesScreenshot sc = (TakesScreenshot) driver;
//
//		File location = new File("C://Users//my pc//eclipse-workspace//Practice_Project2//Screenshot//abc.png");
//
//		File file = sc.getScreenshotAs(OutputType.FILE);
//
//		FileHandler.copy(file, location);

//		Thread.sleep(3000);
//		driver.close();
		
		System.out.println(dataReader(0, 0));
		
		
		

	}

}
