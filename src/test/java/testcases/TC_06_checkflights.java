package testcases;

import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Checkingflights;
import pageobjects.Flightstatus;

public class TC_06_checkflights extends Baseclass{
@Test
public void checkflights() throws InterruptedException {
	Checkingflights checkflights=new Checkingflights(driver);
	checkflights.oneway();
	Thread.sleep(2000);
	checkflights.from_destination(prop.getProperty("from"));
	Thread.sleep(2000);
	checkflights.to_destination(prop.getProperty("to"));
	Thread.sleep(8000);
	checkflights.selecteddate();
	checkflights.patdate();
	//checkflights.depaturedate();
	Thread.sleep(2000);
	checkflights.passengers();
	Thread.sleep(2000);
	checkflights.S_passenger();
	checkflights.Done();
	//checkflights.selectadultbtn();
	Thread.sleep(2000);
	//checkflights.selectchildrenbtn();
	checkflights.clkcurrency();
	Thread.sleep(2000);
	checkflights.searchflightbtn();
	Thread.sleep(2000);
    Switchwindow();
    Thread.sleep(6000);
	 checkflights.clkfbcontinue();
	 Thread.sleep(6000); 
}


@Test
public void checkflights_roundtrip() throws InterruptedException {
	Checkingflights checkflights=new Checkingflights(driver);
	checkflights.roundtrip();
	Thread.sleep(2000);
	checkflights.from_destination(prop.getProperty("from"));
	Thread.sleep(2000);
	checkflights.to_destination(prop.getProperty("to"));
	Thread.sleep(8000);
	checkflights.selecteddate();
	checkflights.patdate();
	//checkflights.depaturedate();
	Thread.sleep(9000);
	//checkflights.returndate();
	checkflights.returndate1();
	checkflights.paticulardate();
	Thread.sleep(4000);
	checkflights.passengers();
	Thread.sleep(2000);
	checkflights.S_passenger();
	checkflights.Done();
	//checkflights.selectadultbtn();
	Thread.sleep(2000);
	//checkflights.selectchildrenbtn();
	checkflights.clkcurrency();
	Thread.sleep(2000);
	checkflights.searchflightbtn();
	Thread.sleep(2000);
    Switchwindow();
    Thread.sleep(6000);
	 checkflights.clkfbcontinue();
	 Thread.sleep(6000); 
}


@Test
public void checkin_booking() throws InterruptedException {
	Checkingflights checkflights=new Checkingflights(driver);
	checkflights.checkin_flight();
	Thread.sleep(6000);
	checkflights.getpnr(prop.getProperty("pnr"));
	Thread.sleep(2000);
	checkflights.getemail_searchbook(prop.getProperty("email"));
	Thread.sleep(9000);
	checkflights.clksearchbooking();
}

@Test
public void flightstatus() throws InterruptedException {
	Flightstatus fs=new Flightstatus(driver);
	fs.status();
	Thread.sleep(2000);
	fs.date();
	fs.datetarget();
	Thread.sleep(6000);
	fs.fb_from(prop.getProperty("bookingfrom"));
	Thread.sleep(6000);
	fs.Fb_to(prop.getProperty("bookingto"));
	Thread.sleep(6000);
	fs.Flight_num(prop.getProperty("fbnumber"));
	Thread.sleep(6000);
	fs.fb_searchflight();
	
}
	
}
