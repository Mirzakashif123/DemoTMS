package testNg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alvas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://alvas.org/");
		WebElement college = driver.findElement(By.partialLinkText("College of Medical Laboratory"));
		Actions action=new Actions(driver);
		action.scrollToElement(college).pause(2000).click(college).build().perform();
	}

}
