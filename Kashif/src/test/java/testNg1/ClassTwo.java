package testNg1;

import org.testng.annotations.Test;

public class ClassTwo extends TestNgDriver {
@Test(groups = {"smoke","adhoc"})
public void methodD() {
	System.out.println("D from two");
}
@Test(groups = {"smoke"})
public void methodE() {
	System.out.println("E from two");
}
@Test(groups = {"functionality"})
public void methodF() {
	System.out.println("F from two");
}
}
