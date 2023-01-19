package DataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fi=new FileInputStream("./src/test/java/Resources/TestScript2.xlsx");
		
		Workbook wb=WorkbookFactory.create(fi);
 Sheet s=wb.getSheet("sheet1");
 Row r=s.getRow(0);
 Cell c=r.getCell(1);
  c.setCellValue("hey dear");
    
  
  FileOutputStream fs=new FileOutputStream("./src/test/java/Resources/TestScript2.xlsx");
  wb.write(fs);
  wb.close();
 
		// TODO Auto-generated method stub

	}

}
