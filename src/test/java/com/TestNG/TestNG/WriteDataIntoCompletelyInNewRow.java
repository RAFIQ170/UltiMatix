package com.TestNG.TestNG;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoCompletelyInNewRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/java/TestScript.xlsx");
		 Workbook wb=WorkbookFactory.create(fis);
		 Sheet sh=wb.getSheet("sheet1");
		 Row r=sh.createRow(4);
		 Cell c=r.createCell(0);
		 c.setCellValue("hello this is rafiq");
		 FileOutputStream fos=new  FileOutputStream("./src/test/java/TestScript.xlsx");
		 wb.write(fos);
		 wb.close();
		 
		// TODO Auto-generated method stub

	}

}
