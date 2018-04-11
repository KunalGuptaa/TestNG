package com.fbk.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.QATestBaseDemo.TestBase;
import com.pageinfo.LoginPage;

public class LoginPageTestCases extends TestBase
{
	LoginPage loginPage1;
	public LoginPageTestCases()
	{
		super();
	}
	
	@BeforeSuite
	public void setUp()
	{
		initialization();
		loginPage1 = new LoginPage();
	}
	
	@Test
	public void verifyTitleTest()
	{
		String title=loginPage1.verifyTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}
	
	@Test
	public void verifyLoginTest()
	{
		loginPage1.verifyLogin();
	}
	
	@AfterSuite
	public void teraDown()
	{
		driver.quit();
	}
}
