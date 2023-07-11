package blazeDemoPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Purchase {
	public WebDriver driver;
	public Purchase(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//em[text()='914.76 ']")
	private WebElement price;
	public WebElement getPrice() {
		return price;
	}
	@FindBy(xpath = "//p[text()='Total Cost: ']")
	private WebElement totalPrice;
	public WebElement getTotalPrice() {
		return totalPrice;
	}
	@FindBy(xpath = "//input[@value='Purchase Flight']")
	private WebElement purchaseFlight;
	public WebElement getPurchaseFlight() {
		return purchaseFlight;
	}
}
