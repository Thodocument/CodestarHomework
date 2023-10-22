package page_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPagePractice extends BasePage {
	protected WebDriver driver;

	public LoginPagePractice(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
//properties xây dựng page login riêng (tuỳ vào nhu cầu dự án)
	By txtUser ;
	By txtPassword ;
	By btnLogin ;
	public By getTxtUser() {
	setTxtUser(txtUser);
	return txtUser;
	
	}
	public void setTxtUser(By txtUser) {
		this.txtUser = By.name("username");

	}
	public By getTxtPassword() {
		setTxtPassword(txtPassword);
		return txtPassword; 
	}
	public void setTxtPassword(By txtPassword) {
		this.txtPassword = By.name("password");
	}
	public By getBtnLogin() {
		setBtnLogin(btnLogin);
		return btnLogin;
	}
	public void setBtnLogin(By btnLogin) {
		this.btnLogin = By.xpath("//button[@type='submit']");
	}
	//actions
	public void setUserNameValue( ) {
		WebElement userName = driver.findElement(getTxtUser());
		userName.sendKeys("Admin");
	}
	public void setPasswordValue( ) {
		WebElement password = driver.findElement(txtPassword);
		password.sendKeys("admin123");
	}
	public void clickLogin( ) {
		WebElement loginElement = driver.findElement(btnLogin);
		loginElement.click();
	}
}
