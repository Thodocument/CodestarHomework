package page_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddEventPageFactory extends BasePageFactory {
	protected WebDriver driver;

	public AddEventPageFactory(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = "//a[contains(@href, '/events')]//parent::li")
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
	@FindBy(xpath = "//span[contains(text(),'Demo Client')]//parent::a")
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

	public void clicklinkEvent() {
lnkEvent.click();
	}
	public void clickButtonEvent() {
		btnEvent.click();
	}
	public void setTitle(String title) {
		txtTitle.sendKeys(title);
	}
	public void setDescription (String codestar) {
		txtTitle.sendKeys(codestar);
	}
	public void selectStartDay(String startDate) {
	    dtpStartDay.click();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].removeAttribute('readonly','readonly');", dtpStartDay);
	    dtpStartDay.clear();
	    dtpStartDay.sendKeys("13-11-2023");
	}
	public void selectEndDay(String startDate) {
	    dtpStartDay.click();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].removeAttribute('readonly','readonly');", dtpEndDay);
	    dtpEndDay.clear();
	    dtpEndDay.sendKeys("14-11-2023");
	}
	public void setLocation (String vietnam) {
		txtTitle.sendKeys(vietnam);
	}
	public void clientOption() {
		WebElement selectClient = driver.findElement(
				By.xpath("//a[@data-action='toggleMeridian']//parent::td[1]"));
				selectClient.click();
	}	
	
}
