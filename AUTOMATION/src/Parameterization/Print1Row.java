package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Print1Row {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("E:\\manual testing\\ST\\aUTOMATION\\Selenium\\Excell\\Excel 1.xlsx"); 
		Sheet sh = WorkbookFactory.create(file).getSheet("TEST DATA");
		
		
		short cellsize = sh.getRow(2).getLastCellNum();
		for (int i=0; i<cellsize; i++)
			//for (int i=0; i<=cellsize-1; i++)
		{
			String data = sh.getRow(2).getCell(i).getStringCellValue();
			System.out.println(data);
	}

	}

}
