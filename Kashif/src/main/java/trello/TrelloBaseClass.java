package trello;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import trelloPom.LoginToContinue;

public class TrelloBaseClass {
	public WebDriver driver;
	public ExcelUtility excel=new ExcelUtility();
	public LoginToContinue password1=new LoginToContinue(driver);
	public WebDriverUtility waitTill=new WebDriverUtility();
	@BeforeMethod
	public void configBeforeMethod() throws IOException {
		
		if(excel.readStringData("homepage",3,2).equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(excel.readStringData("homepage",3,2).equals("edge")) {
			driver=new EdgeDriver();
		}
		else if(excel.readStringData("homepage",3,2).equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(excel.readStringData("homepage",4,2));
	}
	@AfterMethod
		public void configAfterMethod() {
		driver.manage().window().minimize();
		driver.quit();
}
}
