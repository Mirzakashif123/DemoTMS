package com.qspiders.trello.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String properties(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Trello.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}

}
