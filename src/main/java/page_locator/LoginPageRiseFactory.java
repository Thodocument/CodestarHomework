package page_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginPageRiseFactory extends BasePageFactory {
	protected WebDriver driver;
	
	public LoginPageRiseFactory(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	By txtUser = By.name("email");
	By txtPassword = By.name("password");
	By btnLogin = By.xpath("//button[@type='submit']");
	By lnkEvent = By.xpath("//a[contains(@href, '/events')]//parent::li");
	By btnEvent = By.xpath("//a[@class='btn btn-default add-btn' and @title='Add event']");
	By txtTitle = By.xpath("//input[@id='title']");
	By txtDescription = By.xpath("//div[@class=' col-md-9']/textarea");
	By dtpStartDay = By.xpath("//input[@id='start_date']");
	By dtpEndDay = By.xpath("//input[@id='end_date']");
	By btnStartTime = By.xpath("//input[@id='start_time']");
	By btnEndTime = By.xpath("//input[@id='end_time']");
	By btnDecreaseHour = By.xpath("//a[@data-action='decrementHour']");
	By btnDecreaseMinute = By.xpath("//a[@data-action='decrementMinute']");
	By btnMeridianUp = By.xpath("//a[@data-action='toggleMeridian']//parent::td[1]");
	By txtLocation = By.xpath ("//input[@id='location']");
	By dlClient = By.xpath ("//div[@id='s2id_clients_dropdown']");
	By btnClose = By.xpath("//div[@id='events-dropzone']//button[@type='button'][normalize-space()='Close']");
	By btnSave = By.xpath("//*[@id=\"events-dropzone\"]/div[2]/button[3]");
	By rdSpecific = By.xpath("//*[@id='share_with_specific_radio_button']");
	By rdOnlyMe = By.xpath("//*[@id='only_me']");
	By rdAll = By.xpath("//*[@id='share_with_all']");
	By ckbRepeat = By.xpath("//*[@id='event_recurring']");
	By errorMsgTitle = By.xpath("//span[@id='title-error' and  @class='help-block']");
	By errorMsgStartDay = By.xpath("//span[@id='start_date-error' and @class='help-block']");
//	
	
	public void Login() {
		
		WebElement loginElement = driver.findElement(btnLogin);
		loginElement.click();

	}
	
	public void EnterEventPanel() {
		WebElement lnkEventEle = driver.findElement(lnkEvent);
		lnkEventEle.click();
	}
	
	public void OpenAddEventModal() {
		WebElement btnEventEle = driver.findElement(btnEvent);
		btnEventEle.click();
	}
	
	// Function with parameter
	// ShareWith 1 = Only me, 2 = All team members, 3 = Specific members and teams
	public void AddEvent(String title
						,String desc
						,String startDate
						,String endDate
						,String location
						,int clientIndex
						,int shareWith
//						,boolean repeat
						,String dataColor, boolean isDay) {
	
		//Enter Title
		WebElement txtTitleEle = driver.findElement(txtTitle);
		txtTitleEle.clear();
		txtTitleEle.sendKeys(title);
		
		//Enter Description
		WebElement txtDescEle = driver.findElement(txtDescription);
		txtDescEle.clear();
		txtDescEle.sendKeys(desc);
		
		//Enter Start Date
		WebElement dtpStartDateEle = driver.findElement(dtpStartDay);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('readonly','readonly');", dtpStartDateEle);
		dtpStartDateEle.clear();
		dtpStartDateEle.sendKeys(startDate);
		
		//Enter Start Time
		WebElement btnStartTimeEle = driver.findElement(btnStartTime);
		btnStartTimeEle.click();

		//TO DO
		//Check the button increase hour, minute, meridian
		
		//Enter End Date
		WebElement dtpEndDateEle = driver.findElement(dtpEndDay);
		js.executeScript("arguments[0].removeAttribute('readonly','readonly');", dtpEndDateEle);
		dtpEndDateEle.clear();
		dtpEndDateEle.sendKeys(endDate);
			
		//Enter End Time
//		WebElement btnEndTimeEle = driver.findElement(btnEndTime);
//		btnEndTimeEle.click();
//		
		//TO DO
		//Check the button decrease hour, minute, meridian 
//		WebElement decreaseHour = driver.findElement(btnDecreaseHour);
//		decreaseHour.click();
//		for (int i = 0; i < 5; i++) {
//			decreaseHour.click();
//			}
//	
//		WebElement decreaseMinute = driver.findElement(btnDecreaseMinute);
//		decreaseMinute.click();
//		for (int i = 0; i < 5; i++) {
//			decreaseMinute.click();
//			}		
//		WebElement setDaynNight = driver.findElement(btnMeridianUp);
//		if (isDay == true) {
//			setDaynNight.sendKeys("AM");
//		}
//		else {
//			setDaynNight.sendKeys("PM");
//		}
			

		
		//Enter Location
		WebElement txtLocationEle = driver.findElement(txtLocation);
		txtLocationEle.click();
		txtLocationEle.clear();
		txtLocationEle.sendKeys(location);
		
		//Enter Client
		WebElement dlClientEle = driver.findElement(dlClient);
		dlClientEle.click();
		
		WebElement dlClientEle2 = driver.findElement(By.xpath("//ul[@class='select2-results']/li[" + clientIndex +"]//parent::div"));
		dlClientEle2.click();
		
		//Check client
		switch (shareWith) {
			case 1:
				WebElement rdOnlyEle = driver.findElement(rdOnlyMe);
				if(!rdOnlyEle.isSelected()) {
					rdOnlyEle.click();
				}
				break;
			case 2:
				WebElement rdAllEle = driver.findElement(rdAll);
				if(!rdAllEle.isSelected()) {
					rdAllEle.click();
				}
				break;
			case 3:
				WebElement rdSpecificEle = driver.findElement(rdSpecific);
				if(!rdSpecificEle.isSelected()) {
					rdSpecificEle.click();
				}
				
				//-- To do
				//Need select value for drop down list
				//Do that below
				break;
		}
		
		
		//Enter repeat
//		WebElement ckbRepeatEle = driver.findElement(ckbRepeat);
//		if(repeat == true) {
//			if (!ckbRepeatEle.isSelected()) {
//				ckbRepeatEle.click();
				
				//-- To do
				//Fill value for Repeat Every drop down list
				//Fill value for Months drop down list
//				//Fill value for Cycles drop down list
//			}
//		}
//		else {
//			if (ckbRepeatEle.isSelected()) {
//				ckbRepeatEle.clear();
			
		}
		
		// To do
		//Choose color button for the event.
		//Using xpath to find //div[@class='color-palet']
		//Collect all span under the div above, stored to list
		//Based on the parameter color string, then select span element with the correct data-color.
		//After got the span with correct data-color. Perform click().
	
		public void clickSave() {
			WebElement save = driver.findElement(btnSave);
			save.click();
	
		
	}
		public boolean checkExistedErrorMessageTitle() {
		    boolean isExisted = false;
		    WebElement errormsgtitle = driver.findElement(errorMsgTitle);
		    if (errormsgtitle.isDisplayed()) {
		        isExisted = true;
		        System.out.println("Test case is successful: Error message for title is displayed.");
		    } else {
		        System.out.println("Test case is unsuccessful: Error message for title is not displayed.");
		    }
		    return isExisted;
		}

	
	
	public boolean checkExistedErrorMessageStartDay() {
	    boolean isExisted = false;
	    WebElement errormsgstartday = driver.findElement(errorMsgStartDay);
	    if (errormsgstartday.isDisplayed()) {
	        isExisted = true;
	        System.out.println("Test case is successful: Error message for start day is displayed.");
	    } else {
	        System.out.println("Test case is unsuccessful: Error message for start day is not displayed.");
	    }
	    return isExisted;
	}

	}

	

