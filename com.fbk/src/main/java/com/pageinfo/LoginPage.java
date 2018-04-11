package com.pageinfo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QATestBaseDemo.TestBase;

public class LoginPage extends TestBase {
	@FindBy(name="email")
	WebElement Login_name;
	
	@FindBy(id="pass")
	WebElement Password;
	
	@FindBy(id="loginbutton")
	WebElement login;

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public void verifyLogin()
	{
		Login_name.sendKeys(prop.getProperty("username"));
		Password.sendKeys(prop.getProperty("password"));
		login.click();
	}
}
	
