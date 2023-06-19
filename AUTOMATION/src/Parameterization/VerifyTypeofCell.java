package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class VerifyTypeofCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("E:\\manual testing\\ST\\aUTOMATION\\Selenium\\Excell\\Excel 1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("TEST DATA");
		//CellType CT = sh.getRow(0).getCell(0).getCellType();//STRING
		CellType CT = sh.getRow(0).getCell(2).getCellType();//NUMERIC
		System.out.println(CT);

	}

}
