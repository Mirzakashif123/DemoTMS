package com.qspiders.trello.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FbProperties {
	public String fbData(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Facebook.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}
}
