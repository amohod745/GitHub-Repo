package Com.OrangeHRM.qa.Configure;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class OrangeHRM_readXL {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	OrangeHRM_readXL red = new OrangeHRM_readXL();
	red.getData("Sheet1");
	
}
public String[][] getData(String excelsheetname) throws EncryptedDocumentException, IOException {
	
	File file = new File(System.getProperty("user.dir")+"\\ExcelSheet\\testdata.xlsx");
	FileInputStream fis = new FileInputStream(file);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheetname = wb.getSheet(excelsheetname);
	
	int totalrow = sheetname.getLastRowNum();
	System.out.println(totalrow);
	Row rowCells = sheetname.getRow(0);
	int totalcell = rowCells.getLastCellNum();
	System.out.println(totalcell);
	
	DataFormatter format = new DataFormatter();
	String testdata [][] = new String [totalrow][totalcell];
	for (int i=1; i<=totalrow; i++) {
		for(int j=0; j<totalcell; j++) {
			testdata[i-1][j]= format.formatCellValue(sheetname.getRow(i).getCell(j));
			System.out.println();
		}
	}
	return testdata;	
}
}
