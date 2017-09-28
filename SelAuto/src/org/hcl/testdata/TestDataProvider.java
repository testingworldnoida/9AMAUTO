package org.hcl.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class TestDataProvider {

	@DataProvider(name="dp1")
	public static Object[][] testData() throws IOException
	{
		File f = new File("E:\\DH.xlsx");
		FileInputStream fs = new FileInputStream(f);
		XSSFWorkbook wk = new XSSFWorkbook(fs);
		XSSFSheet s1 = wk.getSheet("Sheet1");
		int r = s1.getPhysicalNumberOfRows();
		Object [][] arr = new Object[r][2];
		for(int i=0;i<r;i++)
		{
			XSSFRow r1= s1.getRow(i);
			XSSFCell u= r1.getCell(0);
			XSSFCell p= r1.getCell(1);
			arr[i][0] = u.getStringCellValue();
			arr[i][1] = p.getStringCellValue();
		}

		return arr;
	}
	
	
}
