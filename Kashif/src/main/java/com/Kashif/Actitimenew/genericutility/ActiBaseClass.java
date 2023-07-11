package com.Kashif.Actitimenew.genericutility;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ActiBaseClass {
public WebDriver driver;
public ActitimeUtility util=new ActitimeUtility();
public WebDriverUtility webUtil=new WebDriverUtility();
@BeforeMethod
public void precondition() throws EncryptedDocumentException, IOException {
	if(util.data("Smoke", 3, 2).equals("Chrome"))
		driver=new ChromeDriver();
	else if(util.data("Smoke", 3, 2).equals("Firefox"))
		driver=new FirefoxDriver();
	else if (util.data("Smoke", 3, 2).equals("Edge"))
		driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get(util.data("Smoke", 4, 2));
}
@AfterMethod
public void postcondition() {
	driver.manage().window().minimize();
	driver.quit();
}
}
