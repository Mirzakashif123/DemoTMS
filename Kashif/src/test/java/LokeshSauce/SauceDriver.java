package LokeshSauce;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Kashif.saucedemo.genericutility.SauceBaseClass;
import com.Lokesh.Sauce.generic.SauceUtility;

public class SauceDriver extends SauceBaseClass{
	SauceUtility util=new SauceUtility();
	@Test
	public void login() throws EncryptedDocumentException, IOException {
		driver.findElement(By.id("user-name")).sendKeys(util.data("Functionality", 8, 2));
		driver.findElement(By.id("password")).sendKeys(util.data("Functionality", 9, 2));
		driver.findElement(By.id("login-button")).click();
		
	}
	@Test
	public void logon() {
		
	}
}
