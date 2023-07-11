package blazeDemoDriver;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import blazeDemoPom.BlazeDemo;
import blazeDemoPom.FlightsPom;
import blazeDemoPom.Purchase;
import blazeDemoPom.ThankYou;
import php.genericUtility.BlazeBaseClass;
//Bye
public class BlazeDriver extends BlazeBaseClass{
	@Test
	public void login() {
		BlazeDemo demo=new BlazeDemo(driver);
		String title="BlazeDemo";
		if(driver.getTitle().equals(title))
			System.out.println("Home page is displayed");
		else if(demo.getWelcome().getText().equals("Welcome to the Simple Travel Agency!"))
			System.out.println("Home page is displayed");
		demo.getDestinationWeek().click();
		String vacation="vacation";
		if(driver.getCurrentUrl().contains(vacation))
			System.out.println("It is Vacation page");
		driver.navigate().back();
		Select selectDep=new Select(demo.getDeparture());
		selectDep.selectByVisibleText("Mexico City");
		Select selectDes=new Select(demo.getDestination());
		selectDes.selectByVisibleText("London");
		demo.getFindFlights().click();
		FlightsPom flight=new FlightsPom(driver);
		flight.getChooseTheFlight().click();
		Purchase purchase=new Purchase(driver);
		String totalCost = purchase.getTotalPrice().getText();
		if(totalCost.equals("Total Cost: "))
			System.out.println("Total cost text is visible in the page");
		purchase.getPurchaseFlight().click();
		ThankYou id=new ThankYou(driver);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.urlContains("confirmation"));
		System.out.println("Thank you page is loaded");
//		String myId = id.getId().getText();
//		System.out.println("Purchase id is "+myId);
	}
}
