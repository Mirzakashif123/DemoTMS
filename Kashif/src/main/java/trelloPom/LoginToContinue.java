package trelloPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginToContinue {
	WebDriver driver;
	public LoginToContinue(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
}
