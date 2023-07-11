package dataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopupSendKeys {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.foundit.in/seeker/registration");
		WebElement resumeUpload = driver.findElement(By.xpath("//div[@class='uploadResumeContent']/input[@type='file']"));
		//resumeUpload.click();
		resumeUpload.sendKeys("D:\\Kashif docs\\Kashif_Resume.docx");
		
		driver.manage().window().minimize();
		driver.quit();
		
		
		
		
	}

}
