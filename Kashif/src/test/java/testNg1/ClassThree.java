package testNg1;

import org.testng.annotations.Test;

public class ClassThree extends TestNgDriver {
@Test(groups = {"regression","smoke"})
public void methodG() {
	System.out.println("G from three");
}
@Test(groups = {"functionality"})
public void methodH() {
	System.out.println("H from three");
}
@Test(groups = {"smoke"})
public void methodI() {
	System.out.println("I from three");
}
}
