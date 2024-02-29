package testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Loginpage;

public class TC_02_Loginpagetest extends Baseclass {
	
	//define a method that should drive a data from excel 
		@DataProvider(name="logindata")
		public Object[][] getlogindata() throws EncryptedDocumentException, IOException, InterruptedException
		{
			//create a file object from where i want to pull the data
			FileInputStream file=new FileInputStream("C:\\Users\\Dell-2023\\eclipse-workspace\\Booking-system\\src\\test\\java\\testdata\\logindata.xlsx");
			Workbook workbook=WorkbookFactory.create(file);
			//Access the sheet in sheet1
			Sheet sheet=workbook.getSheet("Sheet1");
			
			//get the total number of row in sheet
			int rowcount= sheet.getLastRowNum();
			
			//get total number of column
			int columnCount= sheet.getRow(0).getLastCellNum();
			
			//create to store 2d array
			Object[][] data=new Object[rowcount][columnCount];
			
			Thread.sleep(2000);
			//iterate through each column 
			
			for(int i=0;i<rowcount;i++) {
			//get the current row
				Row row= sheet.getRow(i+1);
				
				//iterATE THROUGH column
				for(int j=0;j<columnCount;j++) {
					Cell cell=row.getCell(j);
					
					//store the cell value
					data[i][j]=(cell!=null)?cell.toString():null;
					
					
				}
				
			}
			
			
			return data;
		}
		
		@Test(dataProvider="logindata")
		public void LoginWith_valid_credentials(String username,String password) throws InterruptedException{
			Reporter.log("Welcome to loginpage",true);		
			//create an object of loginpage
			Loginpage loginobj=new Loginpage(driver);
			loginobj.loginlinkfield();
			//Switchwindow();
			Thread.sleep(3000);
			loginobj.clickemail();
			Thread.sleep(3000);
			loginobj.getusername(username);
			Thread.sleep(2000);
			loginobj.getpassword(password);
			Thread.sleep(2000);
			loginobj.click_submit_login();
			
}
		
}
