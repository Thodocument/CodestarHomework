package page_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageOrange extends BasePage {
	protected WebDriver driver;

	public LoginPageOrange(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	By txtUser = By.xpath("//input[@name='username']");
	By txtPassword = By.name("password");
	By btnLogin = By.xpath("//button[@type='submit']");
	By btnUser = By.xpath("//span[@class='oxd-userdropdown-tab']");
	By lnkLogOut = By.xpath("//a[normalize-space()='Logout']");
	By txtLoginFail = By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']");
	
	public void setUserNameValue() {
		WebElement userName = driver.findElement(txtUser);
		userName.sendKeys("Admin");
	}

	public void setUserNameValue(String email) {
		WebElement userName = driver.findElement(txtUser);
		userName.sendKeys(email);
	}

	public void setUserNameValue(String email, String wrong) {
		WebElement userName = driver.findElement(txtUser);
		userName.sendKeys(wrong);
//		login.setUserNameValue("email","ADMIN"); overload (nap chong)

	}
	
	public void setPasswordValue() {
		WebElement password = driver.findElement(txtPassword);
		password.sendKeys("admin123");

	}
	public void setPasswordValue(String pass) {
		WebElement password = driver.findElement(txtPassword);
		password.sendKeys(pass);

	}


	public void clickLogin() {
		WebElement buttonLogin = driver.findElement(btnLogin);
		buttonLogin.click();
	}
	public void clickButtonUser() {
		WebElement buttonUser = driver.findElement(btnUser);
		buttonUser.click();
	
	}
	public void clickLogOut() {
		WebElement logOut = driver.findElement(lnkLogOut);
		logOut.click();
	
	}
	
	
	public boolean checkExistedUserName() {
		boolean isExisted = false;
		WebElement user = driver.findElement(btnUser);
		if (user.isDisplayed()) {
			isExisted = true;
		}
		return isExisted;
	}
	public boolean checkLoginFail() {
		boolean isExisted = false;
		WebElement loginfail = driver.findElement(txtLoginFail);
		if (loginfail.isDisplayed()) {
			isExisted = true;
		}
		return isExisted;
	}
	
	}

