package php.genericUtility;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BlazeBaseClass {

		public WebDriver driver;
		
		@BeforeMethod
		public void preCondition() {
			String browser="chrome";
		if(browser.equals("chrome"))
			driver=new ChromeDriver();
		else if(browser.equals("fire fox"))
			driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		@AfterMethod
		public void postCondition() {
			driver.manage().window().minimize();
			driver.quit();
		}
	

}
