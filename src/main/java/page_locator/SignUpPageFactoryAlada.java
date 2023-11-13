package page_locator;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonActions;
import common.CommonBrowser;

public class SignUpPageFactoryAlada extends BasePage {
	protected WebDriver driver;

	public SignUpPageFactoryAlada(WebDriver driver) {
		super(driver);
		this.driver = driver;

		
}
	CommonActions actions = new CommonActions();
	CommonBrowser cb = new CommonBrowser();

	
	@FindBy(id = "txtFirstname")
	WebElement txtHoVaTen;
	@FindBy(id = "txtPassword")
	WebElement txtPassword;
	@FindBy (id = "txtCPassword")
	WebElement txtNhapLaiPassword;
	@FindBy(id = "txtEmail")
	WebElement txtEmail;
	@FindBy(id = "txtCEmail")
	WebElement txtNhapLaiEmail;
	@FindBy(id = "txtPhone")
	WebElement txtPhone;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement btnRegister;
	@FindBy (xpath = "//img[@alt=' John Doe'] [1]")
	WebElement avatarUser;
	@FindBy (xpath ="//a[@class='fs14']")
	WebElement fixProfile;
	@FindBy (xpath = "//input[@name='txtpassword']")
	WebElement txtMatKhauHienTai;
	@FindBy (xpath = "//input[@name='txtnewpass']")
	WebElement txtMatKhauMoi;
	@FindBy (xpath = "//input[@name='txtrenewpass']")
	WebElement txtNhapLaiMatKhauMoi;
	
public void registerAlada () {
	WebElement txtFirstName = driver.findElement(By.id("txtFirstname"));
	actions.sendKeys(txtFirstName, "John Doe");
	cb.pause(3000);
//	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss"); thường sẽ lấy thời gian hiện tại 2023.11.04.16.32.00
//	Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());
	Random random = new Random();
	int number = random.nextInt(100);
	String email = "John" + String.valueOf(number) + ".@gmail.com";
	actions.sendKeys(txtEmail, email);
	actions.sendKeys(txtNhapLaiEmail, email);
	actions.sendKeys(txtPassword, "123456789");
	actions.sendKeys(txtNhapLaiPassword, "123456789");
	actions.sendKeys(txtPhone, "0978344222");
	btnRegister.click();
	cb.pause(1000);
}
}