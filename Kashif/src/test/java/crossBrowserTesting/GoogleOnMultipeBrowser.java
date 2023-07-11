package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleOnMultipeBrowser {
	
	
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void launchBrowser(String browser) {
		
		switch (browser) {
		case "chrome":
			driver=new ChromeDriver();

			break;

		case "edge":
			driver=new EdgeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		}
		driver.manage().window().maximize();

	}
	@Test
	public void getTitleAndUrl() {
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	@AfterMethod
	public void quit() {
		driver.manage().window().minimize();
		driver.quit();
	}
}
