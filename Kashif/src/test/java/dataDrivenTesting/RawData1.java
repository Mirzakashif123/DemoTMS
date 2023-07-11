package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class RawData1 {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fistream=new FileInputStream("./src/test/resources/Actitime.properties"); 
	
		Properties obj=new Properties();
		obj.load(fistream);
		String value = obj.getProperty("username");
		System.out.println(value);
	}

}
