package blazeDemoPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsPom {
		public WebDriver driver;
		public FlightsPom(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
}
		@FindBy(xpath = "(//input[@value='Choose This Flight'])[3]")
		private WebElement chooseTheFlight;
		public WebElement getChooseTheFlight() {
			return chooseTheFlight;
		}
}
