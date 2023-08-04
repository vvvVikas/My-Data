package com.Automation.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	 
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	@FindBy (name="uid")
	WebElement username;
	
	@FindBy (name="password")
	WebElement password;
	
	@FindBy (name="btnLogin")
	WebElement login;

	
	public void setUsername (String usrname) {
		username.sendKeys(usrname);
	}
		
	public void setPassword (String pwd) {
		password.sendKeys(pwd);
			
	}
	
	public void clickLoginBtn() {
		login.click();
	}
	
}
