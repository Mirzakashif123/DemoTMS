package testNg1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing1 {
@BeforeMethod
public void BM() {
System.out.println("BM");
}
@BeforeTest
public void BT() {
	System.out.println("BT");
	
	// TODO Auto-generated method stub

}
@BeforeClass
public void BC() {
	System.out.println("BC");
}
@Test
public void Test() {
	System.out.println("test1");
}
@Test
public void Test1() {
	System.out.println("test2");
}

}
