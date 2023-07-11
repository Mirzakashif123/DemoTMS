package blazeDemoPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedBusPom {
public WebDriver driver;
public RedBusPom(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//label[text()='From']")
private WebElement from;
public WebElement getFrom() {
	return from;
}
@FindBy(xpath = "//label[text()='From']")
private WebElement to;
public WebElement getto() {
	return from;
}@FindBy(xpath = "//label[text()='From']")
private WebElement search;
public WebElement getSearch() {
	return from;
}
}
