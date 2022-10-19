package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Student {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

        String path = "C:\\Desktop\\Test DATA\\Student.xlsx";
        
        FileInputStream file = new FileInputStream(path);
        
        Sheet data = WorkbookFactory.create(file).getSheet("Sheet1");
      
        int values =  data.getLastRowNum();
        System.out.println(values);
      
      for(int i=0; i<=data.getLastRowNum(); i++) {
    	  for(int j=0; j<data.getRow(i).getLastCellNum(); j++) {
    		  
    		 String student = data.getRow(i).getCell(j).getStringCellValue();
//    		  double A = data.getRow(i).getCell(j).getNumericCellValue();
//    		 System.out.print(student + " | " + A +" | ");
    		  System.out.print(student + " | ");
    	  }
    	  System.out.println();
      }
		
	}

}
