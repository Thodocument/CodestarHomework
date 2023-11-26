package page_locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
    WebDriver driver;

    @FindBy(name = "email")
    private WebElement txtEmail;

    @FindBy(name = "password")
    private WebElement txtPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnLogin;

    @FindBy(xpath = "//div[contains(@class,'alert alert-danger')]")
    private WebElement lbLErrorAuthenticate;

    public LoginPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterCredentialsAndLogin(String email, String password) {
    	txtEmail.clear();
    	txtPassword.clear();
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        btnLogin.click();
    }

    public boolean isLoginErrorDisplayed() {
        return lbLErrorAuthenticate.isDisplayed();
    }
}
