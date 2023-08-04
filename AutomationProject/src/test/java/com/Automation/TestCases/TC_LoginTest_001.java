package com.Automation.TestCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.Automation.PageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {


	@Test
	public void loginTest() {
		driver.get(baseUrl);
	LoginPage lp= new LoginPage(driver);
	lp.setUsername(username);
	lp.setPassword(password);
	lp.clickLoginBtn();
	System.out.println(driver.getTitle());
	
	if(driver.getTitle().equals("GTPL Bank Manager HomePage")) {
		Assert.assertTrue(true);
	}else {
		Assert.assertTrue(false);
	}
	
	
	}
	
}