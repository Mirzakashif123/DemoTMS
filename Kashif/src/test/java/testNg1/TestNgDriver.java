package testNg1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNgDriver {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod is executed");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod is executed");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass is executed");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass is executed");
	}@BeforeTest
	public void beforetest() {
		System.out.println("beforetest is executed");
	}@AfterTest
	public void afterTest() {
		System.out.println("afterTest is executed");
	}@BeforeSuite
	public void beforeTestSiute() {
		System.out.println("beforeTestSiute is executed");
	}@AfterSuite
	public void afterTestSuite() {
		System.out.println("afterTestSuite is executed");
	}
	
}
