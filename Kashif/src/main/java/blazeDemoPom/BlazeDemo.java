package blazeDemoPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlazeDemo {
	public WebDriver driver;
	public BlazeDemo(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//h1[text()='Welcome to the Simple Travel Agency!']")
	private WebElement welcome;
	public WebElement getWelcome() {
		return welcome;
	}
	@FindBy(xpath = "//a[text()='destination of the week! The Beach!']")
	private WebElement destinationWeek;
	public WebElement getDestinationWeek() {
		return destinationWeek;
	}
	@FindBy(xpath = "//select[@name='fromPort']")
	private WebElement departure;
	public WebElement getDeparture() {
		return departure;
	}
	@FindBy(xpath = "//select[@name='toPort']")
	private WebElement destination;
	public WebElement getDestination() {
		return destination;
	}
	@FindBy(xpath = "//input[@value='Find Flights']")
	private WebElement findFlights;
	public WebElement getFindFlights() {
		return findFlights;
	}

	

}
