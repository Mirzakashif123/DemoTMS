package com.Kashif.Actitimenew.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "username")
	private WebElement userTextField;
	public WebElement getUsername() {
		return userTextField;
	}
	@FindBy(name = "pwd")
	private WebElement passwordTextField;
	public WebElement getPassword() {
		return passwordTextField;
	}
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginButton;
	public WebElement getLoginButton() {
		return loginButton;
	}
	
}
