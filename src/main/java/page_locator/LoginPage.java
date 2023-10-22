package page_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.CommonActions;
import common.CommonBrowser;
import constants.Test1_WebInfo;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// đăng nhập vào tài khoản ngân stk :0785981586 mk 123456
		CommonBrowser cb = new CommonBrowser();
		CommonActions actions = new CommonActions();
		WebDriver driver1 = cb.initChromeDriver(Test1_WebInfo.kafood);
		cb.pause(2000);
		WebElement txtSDT = driver.findElement(By.name("numberphone"));
		actions.sendKeys(txtSDT, "0785981586");
		WebElement txtmathau = driver.findElement(By.name("password"));
		actions.sendKeys(txtSDT, "123456");
		cb.pause(2000);

		WebElement btnLogin = driver.findElement(By.linkText("btn btn-success btn-sm']"));
		btnLogin.click();

	}

}
