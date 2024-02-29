package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	//create webdriver variable
	public WebDriver driver;
	//initialize pagefactory class init method in constructor
	public Homepage(WebDriver driver) {
		//initialize pagefactory init and driver
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//locate an element on page
    @FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div/div/div[1]/div[1]/div")
    WebElement logo;
    
    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-779j7e r-1f1sjgu r-1otgn73'])[1]")
    WebElement checkin;
    
    @FindBy(xpath="//div[text()=\"flight status\"]")
    WebElement flightstatus;
    
    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-notknq r-1loqt21 r-18u37iz r-779j7e r-1f1sjgu r-1otgn73'])[1]")
    WebElement managebooking;
    //method   
	public Boolean islogodisplayed() {
		return logo.isDisplayed();
	}
	
	public Boolean ischekindisplayed() {
		return checkin.isDisplayed();
	}

	public Boolean isflightstatusdisplayed() {
		return flightstatus.isDisplayed();
	}
	
	public Boolean ismanagebookingdisplayed() {
		return managebooking.isDisplayed();
	}
}
