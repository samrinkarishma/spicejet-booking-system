package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Signuppage {
	//create webdriver variable
		public WebDriver driver;
		//initialize pagefactory class init method in constructor
		public Signuppage(WebDriver driver) {
			//initialize pagefactory init and driver
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		//locate an element on signup page
		
		//signup dashboard link
		@FindBy(xpath="//a[normalize-space()=\"Signup\"]")
		WebElement signupclicklink;
		
		@FindBy(xpath="//select[@class=\"form-control form-select \"]")
		WebElement selectTitle;
		
		@FindBy(xpath="//*[@id=\"first_name\"]")
		WebElement Firstname;
		
		@FindBy(xpath="//*[@id=\"last_name\"]")
		WebElement Lastname;
		
		@FindBy(xpath="//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[3]/div[1]/select")
		WebElement selectTitle1;
		
		@FindBy(xpath="//input[@id=\"dobDate\"]")
		WebElement Dob;
		
		@FindBy(xpath="//input[@class=\" form-control\"]")
		WebElement Mobilenumber;
		
		@FindBy(xpath="//input[@id=\"email_id\"]")
		WebElement Email;
		
		@FindBy(xpath="//input[@id=\"new-password\"]")
		WebElement Newpassword;
		
		@FindBy(xpath="//input[@id=\"c-password\"]")
		WebElement Confirmpassword;
		
		@FindBy(xpath="//input[@id=\"defaultCheck1\"]")
		WebElement selectcheckbox;
		
		@FindBy(xpath="//button[@class=\"btn btn-red\"]")
		WebElement Clicksubmit;
		
		
		public void signup_linkclick() {
			signupclicklink.click();
		}
		
		public void signup_Title() throws InterruptedException 
		{
		
			Select dropdown=new Select(selectTitle);
			  dropdown.selectByValue("MRS");
			  System.out.println(dropdown.getFirstSelectedOption().getText());
			  Thread.sleep(2000);
		}
		public void getfirstname(String firstname) {
			Firstname.sendKeys(firstname);
		}
		
		public void getlastname(String lastname) {
			Lastname.sendKeys(lastname);
		}
		
		public void signup_Title1() throws InterruptedException 
		{
		
			Select dropdown=new Select(selectTitle1);
			  dropdown.selectByValue("IN");
			  System.out.println(dropdown.getFirstSelectedOption().getText());
			  Thread.sleep(2000);
		}
		public void getdob(String dob) {
			Dob.sendKeys(dob);
		}
		
		public void getmobilenumber(String mobilenumber) {
			Mobilenumber.sendKeys(mobilenumber);
			
		}
		
		public void getemailid(String email) {
			Email.sendKeys(email);
		}

		public void getpassword(String password) {
			Newpassword.sendKeys(password);
		}
		
		public void getconfirmpassword(String cpassword) {
			Confirmpassword.sendKeys(cpassword);
		}
		
		public void getcheckbox() {
			selectcheckbox.click();
		}
		
		public void getclicksubmit() {
			Clicksubmit.click();
		}
}
