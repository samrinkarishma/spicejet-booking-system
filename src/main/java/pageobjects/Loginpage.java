package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	//create webdriver variable
			public WebDriver driver;
			//initialize pagefactory class init method in constructor
			public Loginpage(WebDriver driver) {
				//initialize pagefactory init and driver
				this.driver=driver;
				PageFactory.initElements(driver,this);
			}
			//locate an element on signup page
			
			//link click
			@FindBy(xpath="//div[@class='css-76zvg2 r-jwli3a r-ubezar']")
			WebElement Loginlinkfield;
			
			//clickemail checkbox
			@FindBy(xpath="//div[text()='Email']")
			WebElement Clickemail;
			
			//emailfield
			@FindBy(xpath="//*[@id=\"main-container\"]/div/div[3]/div[2]/div[2]/div/div/div/div[4]/div[2]/input")
			WebElement useremailfield;
			
			@FindBy(xpath="//input[@type='password']")
			WebElement userpassword;
			
			@FindBy(xpath="//*[@id=\"main-container\"]/div/div[3]/div[2]/div[2]/div/div/div/div[5]/div[3]")
			WebElement userloginbtn;
			
			@FindBy(xpath="//div[text()='Mobile Number']")
			WebElement Mobilenumber;
			
			public void loginlinkfield() {
				Loginlinkfield.click();
			}
			
			public void clickemail () {
				Clickemail.click();
			}
			
			public void getusername(String username) {
				useremailfield.sendKeys(username);
			}
			
			public void getpassword(String password) {
				userpassword.sendKeys(password);
			}
			public void click_submit_login() {
				userloginbtn.click();
			}
			
			public void mobilenumber() {
				Mobilenumber.click();
			}
}

