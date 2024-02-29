package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class passenger_details {
		//create webdriver variable
		public WebDriver driver;
		 WebDriverWait wait;
		//initialize pagefactory class init method in constructor
		public passenger_details(WebDriver driver) {
			//initialize pagefactory init and driver
			this.driver=driver;
			
			PageFactory.initElements(driver,this);
	}
		
		@FindBy(xpath="(//input[@type='text'])[6]")
		WebElement fname;
		
		@FindBy(xpath="(//input[@type='text'])[7]")
		WebElement lname;
		
		@FindBy(xpath="(//input[@type='text'])[8]")
		WebElement phnumber;
		
		@FindBy(xpath="(//input)[9]")
		WebElement date_ofbirth;
		
		@FindBy(xpath=" (//input)[10]")
		WebElement Validupto;
		
		@FindBy(xpath=" (//input[@type='text'])[11]")
		WebElement ppnumber;
		
		@FindBy(xpath="div[id='pax-item-MSFBRFQ-'] div[class='css-1dbjc4n r-1awozwy r-1uavh4e r-z2wwpe r-d9fdf6 r-9qu9m4']")
		WebElement clickpassenger;
		
		@FindBy(xpath="(//div[@class='css-1dbjc4n r-19m6qjp r-z2wwpe r-1loqt21 r-156q2ks r-1sp51qo r-d9fdf6 r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr'])[1]")
		WebElement clicknext;
		
		@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73'])[1]")
		WebElement clickcontinue;
		
		public void getfname(String firstname) {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
	    	jse.executeScript("arguments[0].click()",fname);
	    	
			}
		
		public void getlname(String lastname) {
			lname.sendKeys(lastname);
		}
		
		public void getphnumber(String mobnumber) {
			phnumber.sendKeys(mobnumber);
		}
		
		public void clkdob(String dob) {
			date_ofbirth.sendKeys(dob);
		}
		
		public void getvalidupto(String validupto) {
			Validupto.sendKeys(validupto);
		}
		
		public void getppnumber(String passportnumber) {
			ppnumber.sendKeys(passportnumber);
		}
		
		public void clkpassenger() {
			clickpassenger.click();
		}
		
		public void clknext() {
			clicknext.click();
		}
		
		public void clkcontinue() {
			clickcontinue.click();
		}
}
