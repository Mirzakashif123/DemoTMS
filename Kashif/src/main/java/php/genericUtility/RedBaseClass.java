package php.genericUtility;



import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;







public class RedBaseClass {
	public WebDriver driver;
	public RedBusUtility util=new RedBusUtility();
	@BeforeClass
	public void DemoBase() throws EncryptedDocumentException, IOException {
		if(util.data("Sheet1", 4, 2).equals("chrome"))
			driver=new ChromeDriver();
		else if(util.data("Sheet1", 4, 2).equals("edge"))
			driver=new EdgeDriver();
		else if(util.data("Sheet1", 4, 2).equals("firefox"))
			driver=new FirefoxDriver();
	}
	@BeforeMethod
	public void winMax() throws EncryptedDocumentException, IOException {
		driver.get(util.data("Sheet1", 5, 2));
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@AfterMethod
	public void winMin() {
		driver.manage().window().minimize();
	}
	@AfterClass
	public void winClose() {
		driver.quit();
	}
	
	
}
