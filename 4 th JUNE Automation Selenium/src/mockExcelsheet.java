import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class mockExcelsheet {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
String path = "C:\\Desktop\\Test DATA\\mock1.xlsx";
		FileInputStream src = new FileInputStream(path);
		Sheet data = WorkbookFactory.create(src).getSheet("Sheet1");	
		for(int i=0; i<=data.getLastRowNum(); i++) {
			for(int j=0; j<data.getRow(i).getLastCellNum(); j++) {
				String values =data.getRow(i).getCell(j).toString();
				System.out.print(values + " | ");
		    }
			System.out.println();
		}
	}
}
