package com.Lokesh.Sauce.generic;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SauceBaseClass {
public WebDriver driver;
	public SauceUtility util=new SauceUtility();
	@BeforeMethod
	public void preCondition() throws EncryptedDocumentException, IOException {
		String browser="chrome";
		if(browser.equals(util.data("Functionality", 4, 2)))
			driver = new ChromeDriver();
		else if(browser.equals(util.data("Functionality", 4, 2)))
			driver = new EdgeDriver();
		else if(browser.equals(util.data("Functionality", 4, 2)))
			driver = new FirefoxDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(util.data("Functionality", 5, 2));

	}
	@AfterMethod
	public void postCondition() {
		driver.manage().window().minimize();
		driver.quit();
	}
}
