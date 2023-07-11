package trello;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This Class will be used to read the data from Excel
 * @author SCSE15
 *
 */
public class ExcelUtility {

	public String readStringData(String sheetName, int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/Trello.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String value = workbook.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
	}
	public double readNumericData(String sheetName, int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/Trello.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		double value = workbook.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getNumericCellValue();
		return value;
	}
}
