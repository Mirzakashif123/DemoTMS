package com.Kashif.saucedemo.genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SauceExcel {
	public String data(String sheet, int a, int b) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/SauceDemo.xlsx");
		Workbook work = WorkbookFactory.create(fis);
		String value = work.getSheet(sheet).getRow(a).getCell(b).getStringCellValue();
		return value;
	}
}
