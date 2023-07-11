package com.Kashif.Actitimenew.genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ActitimeUtility {
public String data(String sheet, int a, int b) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/ActitimeNew.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	String value = workbook.getSheet(sheet).getRow(a).getCell(b).getStringCellValue();
	return value;
}
}
