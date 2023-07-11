package com.Kashif.Actitime.driver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Kashif.Actitimenew.genericutility.ActiBaseClass;
import com.Kashif.Actitimenew.pomrepository.LoginPage;
	
public class ActitimeDriver extends ActiBaseClass{
	@Test
	public void loginPage1() throws EncryptedDocumentException, IOException, InterruptedException {
		webUtil.implicitWait(driver);
		LoginPage login=new LoginPage(driver);
		login.getUsername().sendKeys(util.data("Smoke", 7, 2));
		login.getPassword().sendKeys(util.data("Smoke", 8, 2));
		login.getLoginButton().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.titleIs(util.data("Smoke", 10, 4)));
		TakesScreenshot tss=(TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/act.png");
		FileUtils.copyFile(src, dest);
		
		
	}
}
