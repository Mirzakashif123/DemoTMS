package php.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RedBusUtility {
	
	public String data(String sheet, int a, int b) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/RedBusUtility.xlsx");
		Workbook work = WorkbookFactory.create(fis);
		String value = work.getSheet(sheet).getRow(a).getCell(b).getStringCellValue();
		return value;
	}
	
}
	