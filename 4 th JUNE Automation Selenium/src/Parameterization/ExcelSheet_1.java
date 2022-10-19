package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet_1 {
	
	public static void main (String [] args) throws EncryptedDocumentException, IOException  {
		
		
		String path = "C:\\Users\\amoho\\OneDrive\\Desktop\\Perameterazition\\rollnumer.xlsx";
		
		FileInputStream data = new FileInputStream(path);
		
	//	String data1 = WorkbookFactory.create(data).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		double data2 = WorkbookFactory.create(data).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();

	//	System.out.println(data1);
		System.out.println(data2);
		
	}

}
