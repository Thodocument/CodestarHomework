package page_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	WebDriver driver;

	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // dành cho trường hợp ko extend từ page khác phải khai báo lại 
		
	}

	@FindBy(name = "email")
	WebElement txtEmail;
	@FindBy(name = "password")
	WebElement txtPassword;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement btnLogin;
	@FindBy(xpath = "//div[contains(@class,'alert alert-danger')]")
	WebElement lbLErrorAuthenticate;

	public void Login(String uservalue, String passwordvalue) {
		txtEmail.clear();
		txtPassword.sendKeys(passwordvalue);
		btnLogin.click();
	}

}
