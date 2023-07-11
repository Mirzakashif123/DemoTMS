package popUpHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.selenium.dev/downloads");
		WebElement selVersion = driver.findElement(By.linkText("4.9.0"));
		selVersion.click();
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_J);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyRelease(KeyEvent.VK_J);
//		Thread.sleep(3000);
		driver.get("chrome://downloads/");
		WebElement down2 = driver.findElement(By.tagName("downloads-manager"));
		
		WebElement down3 = down2.getShadowRoot().findElement(By.cssSelector("downloads-item[id='frb0']"));
		WebElement keep = down3.getShadowRoot().findElement(By.cssSelector("cr-button[focus-type='save']"));
		Thread.sleep(3000);
		keep.click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		


	}

}
