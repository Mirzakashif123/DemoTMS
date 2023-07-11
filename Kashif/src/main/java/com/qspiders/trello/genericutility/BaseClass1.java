package com.qspiders.trello.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass1 {
public WebDriver driver;
public FileUtility fileUtils=new FileUtility();
public void configBeforeMethod() throws IOException {
	String browserName = fileUtils.properties("browser");
	if(browserName.equals("chrome")) {
		driver=new ChromeDriver();
	}
	else if(browserName.equals("edge")) {
		driver=new EdgeDriver();
	}
	else if(browserName.equals("firefox")) {
		driver=new FirefoxDriver();
	}
	
}
}
