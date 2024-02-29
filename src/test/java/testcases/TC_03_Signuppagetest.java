package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Signuppage;

public class TC_03_Signuppagetest extends Baseclass{
	@Test
	public void signup() throws InterruptedException {
		//create an object of signup page
		Signuppage signup=new Signuppage(driver);
		signup.signup_linkclick();
		Switchwindow();  
		signup.signup_Title();
		Thread.sleep(2000);
		signup.getfirstname(prop.getProperty("firstname"));
		Thread.sleep(2000);
		signup.getlastname(prop.getProperty("lastname"));
		Thread.sleep(2000);
		signup.signup_Title1();
		Thread.sleep(2000);
		signup.getdob(prop.getProperty("dob"));
		Thread.sleep(2000);
		signup.getmobilenumber(prop.getProperty("mobilenumber"));
		Thread.sleep(4000);
		signup.getemailid(prop.getProperty("email"));
		Thread.sleep(2000);
		signup.getpassword(prop.getProperty("password"));
		Thread.sleep(2000);
		signup.getconfirmpassword(prop.getProperty("cpassword"));
		Thread.sleep(6000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("scroll(0, 650)");
		signup.getcheckbox();
		Thread.sleep(2000);
		signup.getclicksubmit();
	}
}
