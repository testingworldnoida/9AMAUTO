package org.hcl.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hcl.base.CreateDriver;
import org.hcl.pages.LoginPage;
import org.hcl.testdata.TestDataProvider;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_001_Validate_Login_valid_credentials extends CreateDriver{
	
	
	@Test(dataProvider="dp1", dataProviderClass=TestDataProvider.class)
	public void tcase1(String a, String b) throws InterruptedException
	{
		
		LoginPage login = new LoginPage(driver);
		login.enterUsername(a);
		login.enterPassword(b);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,250);","");
		Thread.sleep(3000);
		
	}
	
	

}
