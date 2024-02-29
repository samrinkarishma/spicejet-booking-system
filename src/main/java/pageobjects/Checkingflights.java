package pageobjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Checkingflights {
	//create webdriver variable
		public WebDriver driver;
		String actualMonth;
		String ExpectedMonth="March 2024";
		String ExpectedMonth1="April 2024";
		//initialize pagefactory class init method in constructor
		public Checkingflights(WebDriver driver) {
			//initialize pagefactory init and driver
			this.driver=driver;
			PageFactory.initElements(driver,this);
}
		
		@FindBy(xpath="//div[text()='Flights']")
	     WebElement Flights ;
	    
	    @FindBy(xpath="//div[text()='one way']")
	    WebElement Onewaytrip;
	    
	    @FindBy(xpath="//div[text()='round trip']")
	    WebElement Roundtrip;
	    
	    @FindBy(xpath="//div[@data-testid='to-testID-origin']//input[@type='text']")
	    WebElement From;
	    
	    @FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[1]")
	    WebElement To;
	    
	    @FindBy(xpath="//div[text()='Departure Date']")
	    WebElement Depaturedate;
	    
	    @FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'])[1]")
	    WebElement targetele;
	    
	    @FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[16]")
	    WebElement element;
	    
	    @FindBy(xpath="(//div[text()='1'])[1]")
	    WebElement date;
	    
	    @FindBy(xpath="//div[text()='Return Date']")
	    WebElement Returndate;
	    
	    @FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'])[1]")
	    WebElement targetdate;
	    
	    @FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[16]")
	    WebElement element2;
	    
	    @FindBy(xpath="(//div[text()='25'])[2]")
	    WebElement rdate;
	    
	    @FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]")
		WebElement selectpassenger;
	    
	    @FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")
	    WebElement spassenger;
	    
	    @FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[2]")
	    WebElement clkdone;
	    
	    @FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")
	    WebElement clickadultbtn;
	    
	    @FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[3]")
		WebElement clickchildrenbtn;
	   
		
		@FindBy(xpath="//div[text()='Family & Friends']")
		WebElement selectfamily_friends;
		
		@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[7]/div[2]/div/div[2]")
		WebElement Searchflights;
		
		@FindBy(xpath="//div[text()=\"check-in\"]")
		WebElement Checkin;
		
		@FindBy(xpath="//input[@placeholder='e.g. W3X3H8']")
		WebElement pnr;
		
		@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]")
	    WebElement searchbooking;
		
		@FindBy(xpath="//input[@placeholder='john.doe@spicejet.com']")
		WebElement entermail;
		
		@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[1]/div[1]")
		WebElement sdate;
		
		@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div[1]/div[5]/div")
		WebElement pdate;
		
		@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div/div[2]")
		WebElement retdate;
		
		@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div[5]/div[4]/div")
		WebElement patdate;
		
		@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[2]/div[1]/div[1]")
		WebElement currency;
		
		@FindBy(xpath="//div[text()=\"INR\"]")
		WebElement selectcurrency;
		
		@FindBy(xpath="(//div[@class='css-1dbjc4n r-1niwhzg r-1p0dtai r-1d2f490 r-1udh08x r-u8s1d r-zchlnj r-ipm5af'])[1]")
		WebElement flightcontinue;
		
		public void returndate1() {
			retdate.click();
		}
		
		public void paticulardate() {
			patdate.click();
		}
		
		public void clkcurrency() {
			currency.click();
			Actions action=new Actions(driver);
			action.moveToElement(currency).perform();
			selectcurrency.click();
		}
		
		public void selecteddate() {
			sdate.click();
		}
		
		public void patdate() {
			pdate.click();
		}
	    public void flights() {
			Flights.click();
		}
	    
	    public void oneway() {
			Onewaytrip.click();
		}
	    
	    public void roundtrip() {
			Roundtrip.click();
		}
		
	    public void from_destination(String from) throws InterruptedException {
	    	  From.sendKeys(from);
			  Thread.sleep(2000);
			
	    	}
	    public void to_destination(String to) throws InterruptedException {
	    	To.sendKeys(to);
			Thread.sleep(2000);	
	    }
	    
	    
	    public void depaturedate() throws InterruptedException 
		{
	    	Depaturedate.click();
	    	 while(true)
	    	 {
	    		String actualMonth=targetele.getText();
	    		if(ExpectedMonth.equals(actualMonth)) {
	    			break;
	    		}else{
	    			element.click();
	    		}
	    	 }
	    	 date.click();
		}


		public void returndate() {
	    	Returndate.click();
	    	while(true)
	    	{
	    		String actualmonth=targetdate.getText();
	    		if(ExpectedMonth1.equals(actualmonth)) {
	    			break;
	    		}else {
	    			element2.click();
	    		}
	    	}
	    	rdate.click();
	    }
	    public void passengers() throws InterruptedException 
		{
		selectpassenger.click();
		}
	    
	    public void S_passenger() {
	    	spassenger.click();
	    }
	    
	    public void Done() {
	    	sdate.click();
	    }
	    public void selectadultbtn() {
	    	clickadultbtn.click();
	    }
	    
	    public void selectchildrenbtn() {
	    	clickchildrenbtn.click();
	    }
	    
	    public void currency() throws InterruptedException 
		{
		
			Select dropdown=new Select(selectcurrency);
			  dropdown.selectByValue("INR");
			  System.out.println(dropdown.getFirstSelectedOption().getText());
			  Thread.sleep(2000);
		}
	    
	    public void selectfamily() {
	    	selectfamily_friends.click();
		}
	    
	    public void searchflightbtn() {
	    	JavascriptExecutor jse = (JavascriptExecutor)driver;
	    	jse.executeScript("arguments[0].click()",searchbooking);
		}
	    
	    public void checkin_flight()
	    {
	    	Checkin.click();
	    }
	    
	    public void getpnr(String number)
	    {
	    	pnr.sendKeys(number);
	    }
	    
		public void clksearchbooking(){
			searchbooking.click();
			
		}
	    
	   

		public void getemail_searchbook(String email) {
	    	entermail.sendKeys(email);
	    }
		
		public void clkfbcontinue() {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
	    	jse.executeScript("arguments[0].click()",flightcontinue);
			
			}

		
}
