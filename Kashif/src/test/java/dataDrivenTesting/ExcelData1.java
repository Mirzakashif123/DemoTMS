package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./src/test/resources/RawData1.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet detail = workbook.getSheet("Details");
		Row rowNum = detail.getRow(1);
		Cell cell = rowNum.getCell(1);
		long value = (long)cell.getNumericCellValue();
		System.out.println(value);
	
	}

}
