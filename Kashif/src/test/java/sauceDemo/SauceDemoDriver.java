package sauceDemo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Kashif.saucedemo.genericutility.SauceBaseClass;
import com.Kashif.saucedemo.genericutility.SauceExcel;

public class SauceDemoDriver extends SauceBaseClass{
	SauceExcel ex=new SauceExcel();
@Test(priority = 1, groups = {"functionality"})
public void tast1() throws EncryptedDocumentException, IOException {
	if(driver.getTitle().equals(ex.data("Functionality", 6, 4))) {
		System.out.println("Title is correct");
		if(driver.getCurrentUrl().equals(ex.data("Functionality", 7, 4))) {
			System.out.println("url is correct");
			System.out.println("Login page is displayed");
		}else {
			System.out.println("url is incorrect");
		}
	}else {
		System.out.println("Title is not correct");
	}
	
	driver.findElement(By.id("user-name")).sendKeys(ex.data("Functionality", 8, 2));
	driver.findElement(By.id("password")).sendKeys(ex.data("Functionality", 9, 2));
	driver.findElement(By.id("login-button")).click();
	if(driver.getTitle().equals(ex.data("Functionality", 11, 4))) {
		System.out.println("Home page title is correct");
		if(driver.getCurrentUrl().equals(ex.data("Functionality", 12, 4))) {
			System.out.println("Home page url is correct");
			System.out.println("Home page is displayed");
		}else {
			System.out.println("Home page url is incorrect");
		}
	}else {
		System.out.println("Home page is not correct");
	}
}
@Test(priority = 2, groups = {"functionality", "integration"})
public void test2() throws EncryptedDocumentException, IOException {
	if(driver.getTitle().equals(ex.data("integration", 6, 4))) {
		System.out.println("Title is correct");
		if(driver.getCurrentUrl().equals(ex.data("integration", 7, 4))) {
			System.out.println("url is correct");
			System.out.println("Login page is displayed");
		}else {
			System.out.println("url is incorrect");
		}
	}else {
		System.out.println("Title is not correct");
	}
	
	driver.findElement(By.id("user-name")).sendKeys(ex.data("integration", 8, 2));
	driver.findElement(By.id("password")).sendKeys(ex.data("integration", 9, 2));
	driver.findElement(By.id("login-button")).click();
	if(driver.getTitle().equals(ex.data("integration", 11, 4))) {
		System.out.println("Home page title is correct");
		if(driver.getCurrentUrl().equals(ex.data("integration", 12, 4))) {
			System.out.println("Home page url is correct");
			System.out.println("Home page is displayed");
			driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
			System.out.println("Item page is displayed");
			driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
			System.out.println("Shopping cart option value is incremented");
			driver.findElement(By.cssSelector("a[class='shopping_cart_link']")).click();
			System.out.println("shopping cart page is displayed and item is visible");
			System.out.println("Integration testing is pass");
		}else {
			System.out.println("Home page url is incorrect");
		}
	}else {
		System.out.println("Home page is not correct");
	}
}
@Test(priority = 3, groups = {"functionality","integration","system"})
public void test3() throws EncryptedDocumentException, IOException, InterruptedException {
	if(driver.getTitle().equals(ex.data("system", 6, 4))) {
		System.out.println("Title is correct");
		if(driver.getCurrentUrl().equals(ex.data("system", 7, 4))) {
			System.out.println("url is correct");
			System.out.println("Login page is displayed");
		}else {
			System.out.println("url is incorrect");
		}
	}else {
		System.out.println("Title is not correct");
	}
	
	driver.findElement(By.id("user-name")).sendKeys(ex.data("system", 8, 2));
	driver.findElement(By.id("password")).sendKeys(ex.data("system", 9, 2));
	driver.findElement(By.id("login-button")).click();
	if(driver.getTitle().equals(ex.data("system", 11, 4))) {
		System.out.println("Home page title is correct");
		if(driver.getCurrentUrl().equals(ex.data("system", 12, 4))) {
			System.out.println("Home page url is correct");
			System.out.println("Home page is displayed");
			driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
			System.out.println("Item page is displayed");
			driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
			System.out.println("Shopping cart option value is incremented");
			driver.findElement(By.cssSelector("a[class='shopping_cart_link']")).click();
			System.out.println("shopping cart page is displayed and item is visible");
			System.out.println("Integration testing is pass");
			driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
			System.out.println("Home page is displayed");
			driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
			System.out.println("menu options should be visible");
			driver.findElement(By.id("logout_sidebar_link")).click();
			System.out.println("Login page is displayed");
		}else {
			System.out.println("Home page url is incorrect");
		}
	}else {
		System.out.println("Home page is not correct");
	}
	
}

}
