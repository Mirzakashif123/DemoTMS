package com.qspiders.trello.genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String stringValue(String sheet, int row, int column) throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream("./src/test/resources/RawData1");
		Workbook workbook = WorkbookFactory.create(fis);
		String strValue = workbook.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
		return strValue;
	}
	
	public double numericValue(String sheet, int row, int column) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/RawData1");
		Workbook workbook = WorkbookFactory.create(fis);
		double strValue = workbook.getSheet(sheet).getRow(row).getCell(column).getNumericCellValue();
		return strValue;
	}
}