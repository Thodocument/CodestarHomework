package homework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.CommonActions;
import common.CommonBrowser;
import constants.Test1_WebInfo;


public class hwXpathday8 {

	public static void main(String[] args) {
		// Vào trang https://automationfc.github.io/basic-form/index.html  và lấy location của các element được đánh số trong ảnh sau bằng id, name, linktext, paritalLinkText, class name, tag name vào class code
		CommonBrowser cb = new CommonBrowser();
		CommonActions actions = new CommonActions();
		WebDriver driver = cb.initChromeDriver(Test1_WebInfo.automationFc);
		cb.pause(2000);
		WebElement txtName = driver.findElement(By.id("name"));
	
		//txtName.sendKeys("John Doe");
		actions.sendKeys(txtName, "John Doe");
		WebElement txtAddress = driver.findElement(By.name("address"));
		actions.sendKeys(txtAddress, "codestar.st");
		WebElement txtEmail = driver.findElement(By.id("email"));
		actions.sendKeys(txtEmail, "codestaracademy@gmail.com");
		WebElement txtPassword = driver.findElement(By.id("password"));
		actions.sendKeys(txtPassword, "012345");
		cb.pause(2000);
		
		WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
		btnLogin.click();
	
	}

}
