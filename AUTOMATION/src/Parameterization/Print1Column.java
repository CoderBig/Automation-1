package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Print1Column {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream File = new FileInputStream(
				"E:\\manual testing\\ST\\aUTOMATION\\Selenium\\Excell\\Excel 1.xlsx");
		Sheet sh = WorkbookFactory.create(File).getSheet("TEST DATA");
		 int rowsize = sh.getLastRowNum();
		for(int i =0; i<=rowsize; i++)  
		{
			double data = sh.getRow(i).getCell(6).getNumericCellValue();
			//System.out.println(data);
			int data1= (int) data;
			System.out.println(data1);
		}

	}

}
