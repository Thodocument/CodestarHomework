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
	public void AddEventSuccessfully() {
		LoginPageRiseFactory rise = new LoginPageRiseFactory(driver);
		rise.Login();
		cb.pause(1000);
		rise.EnterEventPanel();
		cb.pause(1000);
		rise.OpenAddEventModal();
		cb.pause(1000);
		rise.clickSave();
		cb.pause(1000);

		title = "This is title3";
		description = "This is description3";
		startDate = "15-11-2023"; // Need follow this format or date will be today by default
		endDate = "16-11-2023"; // Need follow this format or date will be today by default
		location = "This is location";
		shareWith = 1;
		clientIndex = 5;
		isRepeat = false;
		dataColor = "#83c340";

		rise.AddEvent(title, description, startDate, endDate, location, clientIndex, shareWith, dataColor, isRepeat);
	}

	@Test
	public void AddEventUnsuccessfully() {
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
		startDate = ""; // Need follow this format or date will be today by default
		endDate = ""; // Need follow this format or date will be today by default
		location = "";
		shareWith = 1;
		clientIndex = 5;
		isRepeat = false;
		dataColor = "#83c340";

		rise.AddEvent(title, description, startDate, endDate, location, clientIndex, shareWith, dataColor, isRepeat);
		assertTrue(rise.checkExistedErrorMessageTitle());
		assertTrue(rise.checkExistedErrorMessageStartDay());

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
