package homework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import common.CommonActions;
import common.CommonBrowser;
import page_locator.SignUpPageFactoryAlada;
import constants.Test1_WebInfo;
import dev.failsafe.internal.util.Assert;

public class Homework14 {
	CommonBrowser cb;
	CommonActions actions;
	WebDriver driver;

	@Test
	public void SignUpAdala() {
		// Initialize the SignUpPageFactoryAlada with the driver
		SignUpPageFactoryAlada signup = PageFactory.initElements(driver, SignUpPageFactoryAlada.class);
		signup.registerAlada();
		String expectedURL = "https://alada.vn/danh-sach-khoa-hoc.html";

		// Navigate to the URL
		driver.get(expectedURL);

		// Get the actual URL after navigation
		String actualURL = driver.getCurrentUrl();
		cb.pause(4000);
		// Use an if statement to check the URL and assert

		if (actualURL.equals(expectedURL)) {
			System.out.println("URLs match. Test passed.");
		} else {
			System.out.println("URLs do not match. Test failed.");
		}
	}

	@BeforeTest
	public void beforeTest() {
		cb = new CommonBrowser();
		actions = new CommonActions();
		driver = cb.initChromeDriver(Test1_WebInfo.alada);
		cb.pause(4000);
	}

	@AfterTest
	public void afterTest() {
        cb.quitDriver(driver);
	}
}
