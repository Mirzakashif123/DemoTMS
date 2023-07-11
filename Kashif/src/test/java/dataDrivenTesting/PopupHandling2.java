package dataDrivenTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class PopupHandling2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://pib.gov.in/");
		String alertText1 = driver.switchTo().alert().getText();
		System.out.println(alertText1);
		driver.switchTo().alert().accept();
		Actions action=new Actions(driver);
		WebElement defence = driver.findElement(By.linkText("Ministry of Defence"));
		action.scrollToElement(defence).pause(2000).click(defence).build().perform();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		action.scrollToElement(defence).pause(2000).click(defence).build().perform();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		List<WebElement> navBar = driver.findElements(By.xpath("//li[@class='sf-depth-1 menuparent']"));
		for (WebElement navOptions : navBar) {
			action.moveToElement(navOptions).pause(2000).build().perform();
			System.out.println(navOptions.getText());
		}
		
		driver.manage().window().minimize();
		driver.quit();
	}

}
