package com.Kashif.saucedemo.genericutility;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Kashif.saucedemo.genericutility.SauceExcel;

public class SauceBaseClass {
	public WebDriver driver;
	SauceExcel excel=new SauceExcel();
@BeforeMethod
public void preCondition() throws EncryptedDocumentException, IOException {
	if(excel.data("Functionality", 4, 2).equals("chrome")) {
		driver=new ChromeDriver();
	}else if(excel.data("Functionality", 4, 2).equals("edge")) {
		driver=new EdgeDriver();
	}else if(excel.data("Functionality", 4, 2).equals("firefox")) {
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get(excel.data("Functionality", 5, 2));
}
@AfterMethod
public void post() {
	driver.manage().window().minimize();
	driver.quit();
}
}
