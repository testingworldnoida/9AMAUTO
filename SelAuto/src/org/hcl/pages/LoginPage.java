package org.hcl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterUsername(String uname)
	{
		driver.findElement(By.id("email")).sendKeys(uname);
	}
	
	public void enterPassword(String pass)
	{
		driver.findElement(By.id("pass")).sendKeys(pass);
	}
	
	public void clickSignin()
	{
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
