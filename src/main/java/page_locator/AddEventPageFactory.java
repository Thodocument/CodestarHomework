package page_locator;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddEventPageFactory extends BasePageFactory {
	protected WebDriver driver;

	public AddEventPageFactory(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = "//a[contains(@href, 'events')]")
	WebElement lnkEvent;
	@FindBy(xpath = "//a[@class='btn btn-default add-btn' and @title='Add event']")
	WebElement btnEvent;
	@FindBy(xpath = "//input[@id='title']")
	WebElement txtTitle;
	@FindBy(xpath = "//div[@class=' col-md-9']/textarea")
	WebElement txtDescription;
	@FindBy(xpath = "//input[@id='start_date']")
	WebElement dtpStartDay;
	@FindBy(xpath = "//input[@id='end_date']")
	WebElement dtpEndDay;
	@FindBy(xpath = "//input[@id='start_time']")
	WebElement btnStartTime;
	@FindBy(xpath = "//input[@id='end_time']")
	WebElement btnEndTime;
	@FindBy(xpath = "//a[@data-action='decrementHour']")
	WebElement decreaseH;
	@FindBy(xpath = "//a[@data-action='decrementMinute']")
	WebElement decreaseM;
	@FindBy(xpath = "//a[@data-action='toggleMeridian']//parent::td[1]")
	WebElement btnMeridianUp;
	@FindBy(xpath = "//input[@id='location']")
	WebElement txtLocation;
	@FindBy(xpath = "//span[@id='select2-chosen-2']")
	WebElement dlClient;
	@FindBy(xpath = "//div[@id='events-dropzone']//button[@type='button'][normalize-space()='Close']")
	WebElement btnCLose;
	@FindBy(xpath = "//*[@id=\"events-dropzone\"]/div[2]/button[3]")
	WebElement btnSave;
	@FindBy(xpath = "//*[@id='share_with_specific_radio_button']")
	WebElement rdSpecific;
	@FindBy(xpath = "//*[@id='only_me']")
	WebElement rdOnlyMe;
	@FindBy(xpath = "//*[@id='share_with_all']")
	WebElement rdAll;
	@FindBy(xpath = "//span[@id='title-error' and  @class='help-block']")
	WebElement errorMsgTitle;
	@FindBy(xpath = "//span[@id='start_date-error' and @class='help-block']")
	WebElement errorMsgStartDay;
	String strddlClient = "//ul[@id='select2-results-2']//li//div[contains(text(),'%s')]";

	public void clicklinkEvent() {
		lnkEvent.click();
	}

	public void verifyLinkEvent() {
		String newBaseURL = "https://rise.fairsketch.com/events";
		String currentURL = driver.getCurrentUrl();
		try {
			Assert.assertEquals(newBaseURL, currentURL);
		} catch (Exception e) {
			driver.get(newBaseURL);
		}
	}

	public void clickButtonEvent() {
		btnEvent.click();
	}

	public void setTitle(String title) {
		txtTitle.sendKeys(title);
	}

	public void setDescription(String codestar) {
		txtDescription.clear();
		txtDescription.sendKeys(codestar);
	}

	public void selectStartDay(String startDate) {
		dtpStartDay.click();
		dtpStartDay.clear();
		dtpStartDay.sendKeys(startDate);
	}

	public void selectStartTime(String startTime) {
		btnStartTime.click();
		btnStartTime.clear();
		btnStartTime.sendKeys(startTime);
	}

	public void selectEndDay(String endDate) {
		dtpEndDay.click();
		dtpEndDay.clear();
		dtpEndDay.sendKeys(endDate);
	}

	public void selectEndTime(String endTime) {
		btnEndTime.click();
		btnEndTime.clear();
		btnEndTime.sendKeys(endTime);
	}

	public void setLocation(String location) {
		txtLocation.sendKeys(location);
	}

	public void clientOption(String client) {
		// Click to open the dropdown

//		driver.findElement(By.id("s2id_clients_dropdown")).click();
//
//		// Find the desired option within the dropdown and click on it
//		driver.findElement(By.xpath("//ul[@id='select2-results-7']")).click();
		dlClient.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String xPathClient = String.format(strddlClient, client);
		WebElement ddlClientOption = driver.findElement(By.xpath(xPathClient));
		ddlClientOption.click();

		// Select days = new
		// Select(driver.findElement(By.xpath("//span[@id='select2-chosen-2']")));
		// days.deselectByVisibleText(client);

	}
}
