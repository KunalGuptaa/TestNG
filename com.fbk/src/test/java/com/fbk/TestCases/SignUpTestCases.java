package com.fbk.TestCases;

import org.testng.Assert;
//mport org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.QATestBaseDemo.TestBase;
 import com.pageinfo.SignUpPage;

public class SignUpTestCases  extends TestBase
{
	SignUpPage SignUpPage1;
	public  SignUpTestCases() 
	{
		super();
	}
	
	@BeforeSuite
	public void setUp()
	{
		initialization();
		SignUpPage1 = new SignUpPage();
	}
	
	@Test
	public void verifyTitleTest()
	{
		String title=SignUpPage1.verifyTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}
	
	@Test
	public void verifySignUpTest()
	{
		SignUpPage1.Signup();
	}
	
	/*@AfterSuite
	public void teraDown()
	{
		driver.quit();
	}*/
}
