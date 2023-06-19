package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1 {

	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file =new FileInputStream("E:\\manual testing\\ST\\aUTOMATION\\Selenium\\Excell\\Excel 1.xlsx"); 
		Sheet sh = WorkbookFactory.create(file).getSheet("TEST DATA");
		//1. getStringCellValue(); to get string data from cell
		String data1 = sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
		
		String data2 = sh.getRow(0).getCell(4).getStringCellValue();
		System.out.println(data2);
		//if you dont save the excell sheet and call it in the program the u'll get the error.		
		String data10 = sh.getRow(0).getCell(5).getStringCellValue();
		System.out.println(data10);
		//2. getNumericCellValue(); to get numeric data from cell
		double data3 = sh.getRow(0).getCell(2).getNumericCellValue();
		System.out.println(data3); //100.0
		//explicit casting double to int
		int data4 = (int)data3;
		System.out.println(data4); //100
		//3. getBooleanCellValue(); to get boolean data from cell
		boolean data5 = sh.getRow(0).getCell(3).getBooleanCellValue();
		System.out.println(data5); //true
		// we can write numbers as string but we have to use ' symbol in front of number in cell
		String data6 = sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println(data6); // 400 got printed as string
		//5.getLastRowNum(); to get number of rows in excell sheet from 0th index 
		int rowsize = sh.getLastRowNum();
		System.out.println(rowsize+1); // to get number of rows we have to add +1
		//6. getLastCellNum(); to get number of cells in each row 
		short cellsize = sh.getRow(1).getLastCellNum();// for each row we have to write this statement 
		System.out.println(cellsize);// for more no of rows we have to use loop
		
		

		
	}

}
