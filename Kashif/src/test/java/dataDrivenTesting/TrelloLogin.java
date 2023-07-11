package dataDrivenTesting;

import org.testng.annotations.Test;


public class TrelloLogin extends BaseClass {
	@Test(priority = 2)
	public void name() {
		System.out.println("name");
	}
	@Test(priority = 3, invocationCount = 3)
	public void dateOfBirth() {
		System.out.println("Dob");
	}
	@Test(priority = 3)
	public void placeOfb() {
		System.out.println("POB");
	}
	@Test(priority = 3, enabled = false)
	public void yearOfBirth() {
		System.out.println("YOB");
	}
}
