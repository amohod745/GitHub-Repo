package Parameterization;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Para1 {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Desktop\\Test DATA\\rollnumer.xlsx";
		
		FileInputStream data = new FileInputStream(path);
		
	//	double s = WorkbookFactory.create(data).getSheet("Sheet1").getRow(3).getCell(1).getNumericCellValue();
		String s1 = WorkbookFactory.create(data).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	//	System.out.println(s);
		System.out.println(s1);
	}

}
