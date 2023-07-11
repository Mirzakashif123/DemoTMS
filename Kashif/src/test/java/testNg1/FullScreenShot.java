package testNg1;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.Kashif.saucedemo.genericutility.SauceBaseClass;

public class FullScreenShot extends SauceBaseClass{
	@Test
public void fullScreenShot() {
	TakesScreenshot ss = (TakesScreenshot)driver;
	File sShot = ss.getScreenshotAs(OutputType.FILE);
	String shot = sShot.getAbsolutePath();
	System.out.println(shot);
}
}
