package testNg1;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;

import com.Kashif.saucedemo.genericutility.SauceBaseClass;

public class ScreenShot extends SauceBaseClass{

		@Test
		public void sauceLogin() throws IOException, InterruptedException {
			Thread.sleep(4000);
		File srcFile = driver.findElement(By.id("login-button")).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./myScreenShot/"+LocalDateTime.now().toString().replace(':', '-'));
	
		FileUtils.copyFile(srcFile, destFile);
		System.out.println("Screenshot is captured");
		}

}
