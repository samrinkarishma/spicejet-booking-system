package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flightstatus {
	//create webdriver variable
	public WebDriver driver;
	 WebDriverWait wait;
	//initialize pagefactory class init method in constructor
	public Flightstatus(WebDriver driver) {
		//initialize pagefactory init and driver
		this.driver=driver;
		PageFactory.initElements(driver,this);
}
	
	@FindBy(xpath="//div[text()=\"flight status\"]")
	WebElement flightstatus;
	
	@FindBy(xpath="//div[text()='Departure Date']")
	WebElement fbdate;
	
	@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div/div[2]/div[4]")
	WebElement fbdatetarget;
	
	@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]/div[2]/input")
	WebElement fbfrom;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement fb_to;
	
	@FindBy(xpath="(//input[@value='SG - '])[1]")
	WebElement flight_no;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1niwhzg r-1p0dtai r-1d2f490 r-1udh08x r-u8s1d r-zchlnj r-ipm5af'])[1]")
	WebElement fb_search;
	
	public void status() {
		flightstatus.click();
	}
	
	public void date() {
		fbdate.click();
	}
	
	public void datetarget() {
		fbdatetarget.click();
	}
	
	public void fb_from(String bookingfrom) {
		fbfrom.sendKeys(bookingfrom);
	}
	
	public void Fb_to(String bookingto) {
		fb_to.sendKeys(bookingto);
	}
	
	public void Flight_num(String fbnumber) {
		flight_no.sendKeys(fbnumber);
	}
	
	public void fb_searchflight() {
		fb_search.click();
	}
}
