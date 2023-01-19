package com.TestNG.TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelReadTestScripyData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/java/TestScript.xlsx");
		 Workbook wb=WorkbookFactory.create(fis);
		 Sheet s=wb.getSheet("sheet1");
		 Row r=s.getRow(0);
		 Cell c=r.getCell(1);
		 System.out.println(c.getStringCellValue());
		 wb.close();
		 
		
		// TODO Auto-generated method stub

	}

}
