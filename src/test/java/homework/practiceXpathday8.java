package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.CommonActions;
import common.CommonBrowser;
import constants.Test1_WebInfo;


public class practiceXpathday8 {

	private static WebElement txtFirstEnterName;

	public static void main(String[] args) {
		// lấy location của user email, password, company, mobile number theo các cách đã học: id, name, link text, patiallinktext, class name, tag name. tạo class như hình để viết code và run test bằng TestNG
		CommonBrowser cb = new CommonBrowser();
		CommonActions actions = new CommonActions();
		WebDriver driver = cb.initChromeDriver(Test1_WebInfo.selectorsHub);
		cb.pause(2000);
		WebElement txtUserName = driver.findElement(By.id("userId"));
		
		txtUserName.sendKeys("thocodestaracademy@gmail.com");
		actions.sendKeys(txtUserName, "thocodestaracademy@gmail.com");
		WebElement txtPassword = driver.findElement(By.id("pass"));
		actions.sendKeys(txtPassword, "123test");
		WebElement txtCompany = driver.findElement(By.name("company"));
		actions.sendKeys(txtCompany, "codestaracademy");
		WebElement txtMobile = driver.findElement(By.name("mobile number"));
		actions.sendKeys(txtMobile, "012345698");

		WebElement selectorHub = driver.findElement(By.linkText("SelectorsHub Youtube Channel"));
		WebElement txtFirstCrush = driver.findElement(By.id("inp_val"));
		actions.sendKeys(txtFirstCrush, selectorHub.getText());//hiển thị những gì trang web đang có ví dụ trang web đang hiển thị SelectorsHub Youtube Channel thì tự sẽ tự điền SelectorsHub Youtube Channel mà ko cần phải gán cố định 
		
//		WebElement txtLastName = driver.findElement(By.linkText("Enter Last name"));
//		actions.sendKeys(txtLastName, "John");
	}

}
