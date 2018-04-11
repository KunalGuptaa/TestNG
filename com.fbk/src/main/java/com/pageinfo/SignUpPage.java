package com.pageinfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.QATestBaseDemo.TestBase;
//import com.fbk.TestCases.SignUpTestCases;

public class SignUpPage extends TestBase {
	@FindBy(name="firstname")
	WebElement firstname;
	
	@FindBy(name="lastname")
	WebElement lastname;
	
	@FindBy(name="reg_email__")
	WebElement regemail;
	
	@FindBy(name="reg_email_confirmation__")
	WebElement regemailconfirmation;
	
	@FindBy(name="reg_passwd__")
	WebElement regpassword;
	
	@FindBy(id="day")
	WebElement day;
	
	@FindBy(id="month")
	WebElement month;
	
	@FindBy(id="year")
	WebElement year;
	
	@FindBy(id="u_0_8")
	WebElement sex;
	

	public  SignUpPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public void Signup()
	{
		firstname.sendKeys(prop.getProperty("firstname"));
		lastname.sendKeys(prop.getProperty("lastname"));
		regemail.sendKeys(prop.getProperty("regemail"));
		regemailconfirmation.sendKeys(prop.getProperty("regemailconfirmation"));
		regpassword.sendKeys(prop.getProperty("regpassword"));
		
		//day.sendKeys(prop.getProperty("day"));
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("21");
        
		//month.sendKeys(prop.getProperty("month"));
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Aug");
		
		//year.sendKeys(prop.getProperty("year"));
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1992");
		
		sex.click();
		//Signup.click();
		
	}
}
	