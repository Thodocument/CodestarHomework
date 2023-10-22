package homework;

import org.testng.annotations.Test;

import common.CommonActions;
import common.CommonBrowser;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class Homework10 {
	CommonBrowser cb;
	CommonActions actions;
	WebDriver driver;

	@Test
	public void homework10() {

		WebDriver driver = cb.initChromeDriver("https://alada.vn/tai-khoan/dang-ky.html");
		cb.pause(3000);
		WebElement txtFirstname = driver.findElement(By.xpath("//input[@id='txtFirstname']"));
		actions.sendKeys(txtFirstname, "john jason");
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='txtEmail']"));
		actions.sendKeys(txtEmail, "jason5@gmail.com");
		WebElement txtCEmail = driver.findElement(By.xpath("//input[@id='txtCEmail']"));
		actions.sendKeys(txtCEmail, "jaso6@gmail.com");
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		actions.sendKeys(txtPassword, "codestar");
		WebElement txtCPassword = driver.findElement(By.xpath("//input[@id='txtCPassword']"));
		actions.sendKeys(txtCPassword, "codestar");
		WebElement txtPhone = driver.findElement(By.xpath("//input[@id='txtPhone']"));
		actions.sendKeys(txtPhone, "0912355647");
		WebElement btnSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
		btnSubmit.click();
		WebElement btnSubmit1 = driver.findElement(By.xpath("//button[@type='submit']"));
		btnSubmit1.click();
		Alert alert = driver.switchTo().alert();
		String textOnAlert = alert.getText();
		System.out.println(textOnAlert);
		alert.accept();

	}

	@Test
	public void groupRadioButton() {

		WebDriver driver = cb.initChromeDriver("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		cb.pause(3000);
		WebElement rdioMale = driver.findElement(By.xpath("//input[@name='gender'][@value='Male']"));
		cb.pause(1000);
		rdioMale.click();
		WebElement rdioFemale = driver.findElement(By.xpath("//input[@name='gender'][@value='Female']"));
		cb.pause(1000);
		rdioFemale.click();
		WebElement rdoAgeGroup0To5 = driver.findElement(By.xpath("//input[@name='ageGroup'][@value='0 - 5']"));
		cb.pause(1000);
		rdoAgeGroup0To5.click();
		WebElement rdoAgeGroup5To10 = driver.findElement(By.xpath("//input[@type='radio' and @value='5 - 15' and @name='ageGroup']"));
		cb.pause(1000);
		rdoAgeGroup5To10.click();
		WebElement rdoAgeGroup15To50 = driver.findElement(By.xpath("//input[@type='radio' and @value='15 - 50' and @name='ageGroup']"));
		cb.pause(1000);
		rdoAgeGroup15To50.click();
	}
	@BeforeTest
	public void beforeTest() {
		cb = new CommonBrowser();
		actions = new CommonActions();
		cb.pause(4000);
	}

	private void findElement(By xpath) {
		// TODO Auto-generated method stub
		
	}

	@AfterTest
	public void closeBrowser() {
		// System.out.println("This is afterTest ");
//		cb.quitDriver(driver);
	}

}
