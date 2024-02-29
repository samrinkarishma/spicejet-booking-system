package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Homepage;

public class TC_01_Homepagetest extends Baseclass {
	@Test
	public void verifylogo_on_homepage() {
		Homepage homepage = new Homepage(driver);
		Assert.assertTrue(homepage.islogodisplayed());
		
	}
	
	@Test
	public void verifycheckin_on_homepage() {
		Homepage homepage = new Homepage(driver);
		Assert.assertTrue(homepage.ischekindisplayed());
		
	}
	
	@Test
	public void verifyflightstatus_on_homepage() {
		Homepage homepage = new Homepage(driver);
		Assert.assertTrue(homepage.isflightstatusdisplayed());
		
	}
	
	@Test
	public void verifymanagebooking_on_homepage() {
		Homepage homepage = new Homepage(driver);
		Assert.assertTrue(homepage.ismanagebookingdisplayed());
		
	}

}
