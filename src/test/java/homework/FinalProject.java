package homework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterTest;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import common.CommonActions;
import common.CommonBrowser;
import page_locator.LoginPageRiseFactory;
import page_locator.SignUpPageFactoryAlada;
import constants.Test1_WebInfo;
import dev.failsafe.internal.util.Assert;

public class FinalProject {
	CommonBrowser cb;
	CommonActions actions;
	WebDriver driver;

	String title = "This is title", description = "This is description", startDate = "12-11-2023",
			endDate = "15-11-2023", location = "This is location", dataColor = "#83c340";

	int shareWith = 2, clientIndex = 1;
	boolean isRepeat;
//	boolean isDay ;

	@Test
	@Ignore
	public void TC_ADDEVE_001() {
		LoginPageRiseFactory rise = new LoginPageRiseFactory(driver);
		rise.Login();
		cb.pause(1000);
		rise.EnterEventPanel();
		cb.pause(1000);
		rise.OpenAddEventModal();
		cb.pause(1000);
		rise.clickSave();
		cb.pause(1000);

		title = "project codestar";
		description = "final project";
		startDate = "15-11-2023"; 
		endDate = "16-11-2023"; 
		location = "This is location";
		shareWith = 1;
		clientIndex = 5;
		isRepeat = false;

		rise.AddEvent(title, description, startDate, endDate, location, clientIndex, shareWith, dataColor, isRepeat);
	}

	@Test
	@Ignore
	public void TC_ADDEVE_002() {
		LoginPageRiseFactory rise = new LoginPageRiseFactory(driver);
		rise.Login();
		cb.pause(1000);
		rise.EnterEventPanel();
		cb.pause(1000);
		rise.OpenAddEventModal();
		cb.pause(1000);
		rise.clickSave();
		cb.pause(1000);
		rise.checkExistedErrorMessageTitle();
		rise.checkExistedErrorMessageStartDay();


		title = "";
		description = "";
		startDate = ""; 
		endDate = ""; 
		location = "";
		shareWith = 1;
		clientIndex = 5;
		isRepeat = false;

		rise.AddEvent(title, description, startDate, endDate, location, clientIndex, shareWith, dataColor, isRepeat);
		assertTrue(rise.checkExistedErrorMessageTitle());
		assertTrue(rise.checkExistedErrorMessageStartDay());

	}
	@Test
	public void TC_ADDEVE_003() {
		LoginPageRiseFactory rise = new LoginPageRiseFactory(driver);
		rise.Login();
		cb.pause(1000);
		rise.EnterEventPanel();
		cb.pause(1000);
		rise.OpenAddEventModal();
		cb.pause(1000);
		rise.clickSave();
		cb.pause(1000);
		assertTrue(rise.checkExistedErrorMessageTitle());
		assertTrue(rise.checkExistedErrorMessageStartDay());


		title = "project codestar";
		description = "";
		startDate = "15-11-2023"; 
		endDate = ""; 
		location = "";
		shareWith = 1;
		clientIndex = 1;
		isRepeat = false;

		rise.AddEvent(title, description, startDate, endDate, location, clientIndex, shareWith, dataColor, isRepeat);
	}	
	@Test
	public void TC_ADDEVE_004() {
		LoginPageRiseFactory rise = new LoginPageRiseFactory(driver);
		rise.Login();
		cb.pause(1000);
		rise.EnterEventPanel();
		cb.pause(1000);
		rise.OpenAddEventModal();
		cb.pause(1000);
		rise.clickSave();
		cb.pause(1000);
		rise.checkExistedErrorMessageTitle();
		rise.checkExistedErrorMessageStartDay();


		title = "project codestar";
		description = "";
		startDate = "30-11-2023"; 
		endDate = ""; 
		location = "vietnam";
		shareWith = 1;
		clientIndex = 5;
		isRepeat = false;

		rise.AddEvent(title, description, startDate, endDate, location, clientIndex, shareWith, dataColor, isRepeat);
	}
	@Test
	public void TC_ADDEVE_005() {
		LoginPageRiseFactory rise = new LoginPageRiseFactory(driver);
		rise.Login();
		cb.pause(1000);
		rise.EnterEventPanel();
		cb.pause(1000);
		rise.OpenAddEventModal();
		cb.pause(1000);
		rise.clickSave();
		cb.pause(1000);
		rise.checkExistedErrorMessageStartDay();


		title = "add blank space";
		description = "";
		startDate = "15-11-2023"; 
		endDate = ""; 
		shareWith = 1;
		clientIndex = 5;
		isRepeat = false;

		rise.AddEvent(title, description, startDate, endDate, location, clientIndex, shareWith, dataColor, isRepeat);
	}
	@Test
	public void TC_ADDEVE_006() {
		LoginPageRiseFactory rise = new LoginPageRiseFactory(driver);
		rise.Login();
		cb.pause(1000);
		rise.EnterEventPanel();
		cb.pause(1000);
		rise.OpenAddEventModal();
		cb.pause(1000);
		rise.clickSave();
		cb.pause(1000);
		


		title = "project codestar";
		description = "";
		startDate = "9-11-2023"; 
		endDate = ""; 
		location = "";
		shareWith = 1;
		clientIndex = 5;
		isRepeat = false;

		rise.AddEvent(title, description, startDate, endDate, location, clientIndex, shareWith, dataColor, isRepeat);
	}
	@Test
	public void TC_ADDEVE_007() {
		LoginPageRiseFactory rise = new LoginPageRiseFactory(driver);
		rise.Login();
		cb.pause(1000);
		rise.EnterEventPanel();
		cb.pause(1000);
		rise.OpenAddEventModal();
		cb.pause(1000);
		rise.clickSave();
		cb.pause(1000);
		rise.checkExistedErrorMessageTitle();
		rise.checkExistedErrorMessageStartDay();


		title = "Loreal";
		description = "50 personnes Plats BurattAlcool Whisky";
		startDate = "9-11-2023"; 
		endDate = "9-11-2023";
		location = "Liberta";
		shareWith = 3;
		clientIndex = 5;
		isRepeat = false;

		rise.AddEvent(title, description, startDate, endDate, location, clientIndex, shareWith, dataColor, isRepeat);
	}
	@Test
	public void TC_ADDEVE_008() {
		LoginPageRiseFactory rise = new LoginPageRiseFactory(driver);
		rise.Login();
		cb.pause(1000);
		rise.EnterEventPanel();
		cb.pause(1000);
		rise.OpenAddEventModal();
		cb.pause(1000);
		rise.clickSave();
		cb.pause(1000);
		


		title = "project codestar";
		description = "";
		startDate = "15-11-2023"; // Need follow this format or date will be today by default
		endDate = "14-11-2023"; // Need follow this format or date will be today by default
		location = "";
		shareWith = 1;
		clientIndex = 5;
		isRepeat = false;

		rise.AddEvent(title, description, startDate, endDate, location, clientIndex, shareWith, dataColor, isRepeat);
	}
	@Test
	public void TC_ADDEVE_009() {
		LoginPageRiseFactory rise = new LoginPageRiseFactory(driver);
		rise.Login();
		cb.pause(1000);
		rise.EnterEventPanel();
		cb.pause(1000);
		rise.OpenAddEventModal();
		cb.pause(1000);
		rise.clickSave();
		cb.pause(1000);
		


		title = "project codestar";
		description = "final project";
		startDate = "12-11-2023"; 
		endDate = "12-11-2023"; 
		location = "vietnam";
		shareWith = 2;
		clientIndex = 3;
		isRepeat = false;
		rise.AddEvent(title, description, startDate, endDate, location, clientIndex, shareWith, dataColor, isRepeat);
}
	@Test
	public void TC_ADDEVE_0010() {
		LoginPageRiseFactory rise = new LoginPageRiseFactory(driver);
		rise.Login();
		cb.pause(1000);
		rise.EnterEventPanel();
		cb.pause(1000);
		rise.OpenAddEventModal();
		cb.pause(1000);
		rise.clickSave();
		cb.pause(1000);
		rise.checkExistedErrorMessageTitle();
		rise.checkExistedErrorMessageStartDay();


		title = "project codestar";
		description = "final project";
		startDate = "01-11-2023"; 
		endDate = "02-11-2023"; 
		location = "";
		shareWith = 1;
		clientIndex = 2;
		isRepeat = false;

		rise.AddEvent(title, description, startDate, endDate, location, clientIndex, shareWith, dataColor, isRepeat);
}
	@BeforeTest
	public void beforeTest() {
		cb = new CommonBrowser();
		actions = new CommonActions();
		driver = cb.initChromeDriver(Test1_WebInfo.riseFair);
		cb.pause(4000);
	}

	@AfterTest
	public void afterTest() {
		 cb.quitDriver(driver);
	}
}
