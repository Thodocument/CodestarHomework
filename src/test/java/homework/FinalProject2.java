package homework;

import org.testng.annotations.Test;

import common.CommonActions;
import common.CommonBrowser;
import page_locator.AddEventPageFactory;
import page_locator.LoginPageFactory;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class FinalProject2 {
	CommonBrowser cb;
	CommonActions actions;
	WebDriver driver;

	@Test
	public void addEventSuccessfully() {
		LoginPageFactory login = new LoginPageFactory(driver);
		login.enterCredentialsAndLogin("admin@demo.com", "riseDemo");
		AddEventPageFactory event = new AddEventPageFactory(driver);
		cb.pause(2000);
		event.clicklinkEvent();
		cb.pause(1000);
		event.verifyLinkEvent();
		cb.pause(500);
		event.clickButtonEvent();
		cb.pause(1000);
		event.setTitle("project codestart");
		cb.pause(1000);
		event.setDescription("final project");
		cb.pause(1000);
		event.selectStartDay("15-11-2023");
		cb.pause(1000);
		event.selectStartTime("1:00 AM");
		cb.pause(1000);
		event.selectEndDay("16-11-2023");
		cb.pause(1000);
		event.selectEndTime("3:00 AM");
		cb.pause(1000);
		event.setLocation("vietnam");
		cb.pause(2000);
		event.clientOption("Demo Client");
		cb.pause(2000);

	}

	@BeforeTest
	public void beforeTest() {
		cb = new CommonBrowser();
		actions = new CommonActions();
		driver = cb.initChromeDriver(constants.Test1_WebInfo.riseFair);
	}

	@AfterTest
	public void afterTest() {
		cb.quitDriver(driver);
	}

}
