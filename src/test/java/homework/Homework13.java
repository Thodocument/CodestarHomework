package homework;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import common.CommonActions;
import common.CommonBrowser;
import page_locator.LoginPageOrange;

public class Homework13 {
	CommonBrowser cb;
	CommonActions actions;
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		cb = new CommonBrowser();
		actions = new CommonActions();
		driver = cb.initChromeDriver(constants.Test1_WebInfo.Orange);
	}

	@Test
	@Ignore
	public void LoginSuccessfully() {
		LoginPageOrange login = new LoginPageOrange(driver);
		cb.pause(1000);
		login.setUserNameValue();
		cb.pause(1000);
		login.setPasswordValue();
		cb.pause(1000);
		login.clickLogin();
		cb.pause(2000);
		assertTrue(login.checkExistedUserName()); 


	}

	@Test
	public void LoginUnsuccesfullyByWrongEmail() {
		LoginPageOrange login = new LoginPageOrange(driver);
		cb.pause(2000);
		login.setUserNameValue("wrongemail");
		cb.pause(1000);
		login.setPasswordValue();
		cb.pause(1000);
		login.clickLogin();
		cb.pause(2000);
		assertTrue(login.checkExistedUserName()); 

	}

	@Test
	@Ignore
	public void LoginUnsuccesfullyByWrongPassword() {
		LoginPageOrange login = new LoginPageOrange(driver);
		cb.pause(2000);
		login.setUserNameValue();
		cb.pause(1000);
		login.setPasswordValue("wrongpass");
		cb.pause(1000);
		login.clickLogin();
		cb.pause(2000);
		assertTrue(login.checkLoginFail()); 

	}
	@Test
	@Ignore
	public void LoginUnsuccesfullyByWrongEmailAndPassword() {
		LoginPageOrange login = new LoginPageOrange(driver);
		cb.pause(2000);
		login.setUserNameValue("wrongemail");
		cb.pause(1000);
		login.setPasswordValue("wrongpass");
		cb.pause(1000);
		login.clickLogin();
		cb.pause(2000);
	}
	@Test
	@Ignore
	public void LogOut() {
		LoginPageOrange login = new LoginPageOrange(driver);
		cb.pause(2000);
		login.setUserNameValue();
		cb.pause(1000);
		login.setPasswordValue();
		cb.pause(1000);
		login.clickLogin();
		cb.pause(2000);
		login.clickButtonUser();
		cb.pause(1000);
		login.clickLogOut();
		cb.pause(1000);
	}

	@AfterTest
	public void afterTest() {
		cb.quitDriver(driver);
}
}