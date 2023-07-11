package testNg1;

import org.testng.annotations.Test;

public class ClassOne extends TestNgDriver{
@Test(groups = {"functionality","adhoc"})
public void methodA() {
	System.out.println("A from one");
}
@Test(groups = {"functionality"})
public void methodB() {
	System.out.println("B from one");
}
@Test(groups = {"usability"})
public void methodC() {
	System.out.println("C from one");
}
}
