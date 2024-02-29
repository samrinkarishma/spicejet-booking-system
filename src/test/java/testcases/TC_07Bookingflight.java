package testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Checkingflights;
import pageobjects.passenger_details;

public class TC_07Bookingflight extends Baseclass {
	
	//define a method that should drive a data from excel 
	@DataProvider(name="passengerdetails")
	public Object[][] getpassengerdetails() throws EncryptedDocumentException, IOException, InterruptedException
	{
		//create a file object from where i want to pull the data
		FileInputStream file=new FileInputStream("C:\\Users\\Dell-2023\\eclipse-workspace\\Booking-system\\src\\test\\java\\testdata\\passengerdetails.xlsx");
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
@Test(dataProvider="passengerdetails")
public void bookingflights(String firstname,String lastname,String mobnumber,String dob,String validupto,String passportnumber) throws InterruptedException {	
	Checkingflights checkflights=new Checkingflights(driver);
		checkflights.oneway();
		Thread.sleep(2000);
		checkflights.from_destination(prop.getProperty("from"));
		Thread.sleep(2000);
		checkflights.to_destination(prop.getProperty("to"));
		Thread.sleep(8000);
		checkflights.selecteddate();
		checkflights.patdate();
		Thread.sleep(2000);
		checkflights.passengers();
		Thread.sleep(2000);
		checkflights.S_passenger();
		checkflights.Done();
		Thread.sleep(4000);
		checkflights.searchflightbtn();
		Thread.sleep(2000);
	    Switchwindow();
	    Thread.sleep(6000);
		checkflights.clkfbcontinue();
		Thread.sleep(4000);
		passenger_details ppdetails=new passenger_details(driver);	
		ppdetails.getfname(firstname);
		Thread.sleep(2000);
		ppdetails.getlname(lastname);
		Thread.sleep(2000);
		ppdetails.getphnumber(mobnumber);
		Thread.sleep(2000);
		ppdetails.clkdob(dob);
		Thread.sleep(2000);
		ppdetails.getvalidupto(validupto);
		Thread.sleep(2000);
		ppdetails.getppnumber(passportnumber);
		Thread.sleep(2000);
		ppdetails.clknext();
		Thread.sleep(2000);
		ppdetails.clkcontinue();
		
	}


	
}
