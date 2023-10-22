package homework;

import org.testng.annotations.Test;

import common.CommonActions;
import common.CommonBrowser;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

import org.openqa.selenium.support.ui.Select;

public class Homework12 {
	CommonBrowser cb;
	CommonActions actions;
	WebDriver driver;

  @Test
  public void inputForm() {
	  Select select = new Select(driver.findElement(By.xpath("//select[@name='state']")));
	  select.selectByVisibleText("Alaska");
  }
  @Test
  public void radioButton() {
	  WebElement rdioButton = driver.findElement(By.xpath("//label[normalize-space()='Yes']"));
	  rdioButton.click();
}
  @BeforeTest
  public void beforeTest() {
	  cb = new CommonBrowser();
		actions = new CommonActions();
		driver = cb.initChromeDriver(constants.Test1_WebInfo.seleniumInputForm);
		cb.pause(4000);
  }
  

  @AfterTest
  public void afterTest() {
  }

}
