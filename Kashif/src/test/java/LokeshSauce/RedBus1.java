package LokeshSauce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class RedBus1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.redbus.in/");
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//label[text()='From']")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("//label[text()='To']")).sendKeys("Hyderabad");
		WebElement dates = driver.findElement(By.id("onwardCal"));
		Select date=new Select(dates);
		date.deselectByVisibleText("30");
		driver.findElement(By.id("search_button")).click();
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
