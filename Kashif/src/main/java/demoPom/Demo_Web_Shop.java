package demoPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo_Web_Shop {
	public WebDriver driver;
public Demo_Web_Shop(WebDriver  driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement register;
	public WebElement getRegister() {
		return register;
	}
}
