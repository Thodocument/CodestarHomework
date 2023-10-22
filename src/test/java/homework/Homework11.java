package homework;

import org.testng.annotations.Test;

import common.CommonActions;
import common.CommonBrowser;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class Homework11 {
	CommonBrowser cb;
	CommonActions actions;
	WebDriver driver;

	@Test
	public void singleCheckboxDemo() {
		WebElement thisCheckbox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
		cb.pause(1000);
		thisCheckbox.click();
		WebElement defaultCheck = driver.findElement(By.xpath("//label[normalize-space()='Default Checked']"));
		// if (defaultCheck.isEnabled()) {
		cb.pause(1000);
		defaultCheck.click();
		WebElement defaultDisabledElement = driver
				.findElement(By.xpath("//label[normalize-space()='Default Disabled']"));
		if (defaultDisabledElement.isEnabled()) {
			cb.pause(1000);
			defaultDisabledElement.click();
			System.out.println("default disabled is clickable");
		} else {
			System.out.println("default disabled is unclickable ");

		}
	}
		@Test
		public void multipleCheckboxDemo() {
			List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));

			//traverse through the list and select all checkboxes if they are enabled and displayed.
			for(int i=0; i < checkboxes.size(); i++)
			{
				if(checkboxes.get(i).isDisplayed() && checkboxes.get(i).isEnabled())
				{
	                   System.out.println("Checkbox is displayed at index : " + i + " Clicking on it now");
	                   cb.pause(1000);
	                        checkboxes.get(i).click();
				}
			}
	}

	@BeforeTest
	public void beforeTest() {
		cb = new CommonBrowser();
		actions = new CommonActions();
		driver = cb.initChromeDriver(constants.Test1_WebInfo.demoSelenium);
		cb.pause(4000);
	}

	@AfterTest
	public void closeBrowser() {
	driver.close();
	}

}
