package com.QATestBaseDemo;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		try
		{
			FileInputStream ip= new FileInputStream("C:\\Users\\Kunal Gupta\\eclipse-workspace\\com.fbk\\src\\main\\java\\com\\properties\\config.properties");
			prop= new Properties();
			prop.load(ip);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			
		}
	}
	public static void initialization()
	{
		String name=prop.getProperty("browser");
		if(name.equalsIgnoreCase("Firefox"))
		{
			System.setProperty(prop.getProperty("systemproperty1"),prop.getProperty("systemproperty2"));
			driver=new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
	}
}
	

