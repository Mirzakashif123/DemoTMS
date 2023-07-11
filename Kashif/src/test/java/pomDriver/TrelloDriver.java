package pomDriver;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import trello.TrelloBaseClass;
import trelloPom.LoginToContinue;
import trelloPom.TrelloHomePage;
import trelloPom.TrelloLoginPage;
	
public class TrelloDriver extends TrelloBaseClass {
	
	@Test
	public void loginButton() throws InterruptedException, EncryptedDocumentException, IOException {
		TrelloHomePage homepage=new TrelloHomePage(driver);
		homepage.getLoginOption().click();
	
		TrelloLoginPage loginpage=new TrelloLoginPage(driver);
		loginpage.getUserName().sendKeys(excel.readStringData("login",10,2));
		
		LoginToContinue password=new LoginToContinue(driver);
		password.getPassword().sendKeys(excel.readStringData("login to continue", 12, 2));
		Thread.sleep(3000);
	}

}
