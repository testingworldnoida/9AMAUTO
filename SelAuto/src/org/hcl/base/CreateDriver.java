package org.hcl.base;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentReports;

public class CreateDriver {
	public WebDriver driver;
	@BeforeMethod
	public void generateDriverObject()
	{
	    
		 System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("https://www.facebook.com");
	     driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeDriverObject()
	{
		
		 driver.quit();
	}
	
}
