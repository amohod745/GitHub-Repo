package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class practice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path = "C:\\Desktop\\Test DATA\\TestData.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		Sheet data = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lastrowno = data.getLastRowNum();
		System.out.println(lastrowno);
		
		for(int i=0; i<=data.getLastRowNum(); i++) {//row
			
			for(int j=0; j<data.getRow(i).getLastCellNum(); j++) {
				
				String values = data.getRow(i).getCell(j).getStringCellValue();
				System.out.print(values+ " | ");
			}
			System.out.println();
		}
	}
}
