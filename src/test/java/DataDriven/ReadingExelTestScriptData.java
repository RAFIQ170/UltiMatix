package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExelTestScriptData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		// we have to create excel file out side of the eclipse
		//step1; we have to convert that(excel)physical file into java readable object
		
		FileInputStream fi=new FileInputStream("./src/test/java/Resources/TestScript2.xlsx");
		//step2: open the excel workbook
		//import the workbook,sheet,row,cell all of these from org.apache.poi.ss.usermodel
		//the below statement throws the encryptedDocumentionExcetion and IO Exception
		
		Workbook wb=WorkbookFactory.create(fi);
		  //Step3::Get control over particular sheet
		Sheet s=wb.getSheet("sheet1");
		//step4:: get control over particular row
		Row r=s.getRow(0);
		// step5:: get control over particular cell
		
		Cell c=r.getCell(1);	
		//step6::Fetch the data from cell
		System.out.println(c.getStringCellValue());
		
		//step7:: close workbook(other wise it will corrupt if we login again and again without closing it)
		
		wb.close();
	}

}
