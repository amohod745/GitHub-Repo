package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
		String path="C:\\Desktop\\Test DATA\\rollnumer.xlsx";
		FileInputStream file=new FileInputStream(path);
		
		double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		
		System.out.println(data);
	}

}
