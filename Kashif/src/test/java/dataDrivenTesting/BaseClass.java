package dataDrivenTesting;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qspiders.trello.genericutility.FbProperties;
import com.qspiders.trello.genericutility.FileUtility;

public class BaseClass {
public WebDriver driver;
//public FileUtility fileUtils=new FileUtility();
FbProperties fbobj=new FbProperties();
@BeforeMethod
public void configBeforeMethod() throws IOException {
//	String browserName = fileUtils.properties("browser");
	String browserName = fbobj.fbData("browser");
	if(browserName.equals("chrome")) {
		driver=new ChromeDriver();
	}
	else if(browserName.equals("edge")) {
		driver=new EdgeDriver();
	}
	else if(browserName.equals("firefox")) {
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
//	driver.get(fileUtils.properties("url"));
	driver.get(fbobj.fbData("url"));
}
@AfterMethod
	public void configAfterMethod() {
	driver.manage().window().minimize();
	driver.quit();
}
}
