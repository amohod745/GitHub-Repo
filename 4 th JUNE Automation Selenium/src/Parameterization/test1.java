package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {


		String path = "C:\\Desktop\\Test DATA\\team.xlsx"; 
		
		FileInputStream file = new FileInputStream(path);
		
	//	Sheet data = WorkbookFactory.create(file).getSheet("Sheet1");
		Sheet data1 = WorkbookFactory.create(file).getSheet("Sheet1");
		int lastrownumber = data1.getLastRowNum();
		System.out.println(lastrownumber);

		for(int i=0; i<=data1.getLastRowNum(); i++) { // row
			for(int j=0; j<data1.getRow(i).getLastCellNum(); j++) { // celi			
				String values = data1.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(values + " | ");
			}
			System.out.println();
			
		}
	}

}
