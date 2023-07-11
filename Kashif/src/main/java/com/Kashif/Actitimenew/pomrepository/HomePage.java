package com.Kashif.Actitimenew.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "logoutLink")
	private WebElement logoutButton;
	@FindBy(id = "container_tt")
	private WebElement timeTrack;
	public WebElement getLogoutButton() {
		return logoutButton;
	}
	public WebElement getTimeTrack() {
		return timeTrack;
	}
}
