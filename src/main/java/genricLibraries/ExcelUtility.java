package genricLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class contains all the reusable methods to perform operations on excel
 * @author mrafi
 *
 */
public class ExcelUtility {
	private Workbook workbook; 
	private DataFormatter df;
	private Sheet sheet;
/**
 * This method is to initialize excel workbook
 * @param path
 * @param sheetName
 */
	public void excelInitialization(String path) {
		
		
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(path);
			
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
/**
 * 
 * @param sheetName
 * @param rowNum
 * @param cellNum
 * @return
 */
	public String readDataFromExcel(String sheetName, int rowNum, int cellNum) {
		df=new DataFormatter();
		sheet=workbook.getSheet(sheetName);
		return df.formatCellValue(sheet.getRow(rowNum).getCell(cellNum));
	}
/**
 * This method is used to fetch multiple data in key-value format from excel
 * @param sheetName
 * @param expectedTestName
 * @return
 */
  public Map<String,String> readDataFromExcel(String sheetName, Object expectedTestName){
	  DataFormatter df = new DataFormatter();
		Sheet sheet = workbook.getSheet(sheetName);
	  Map<String,String> map=new HashMap<>();
	  for(int i=0; i<sheet.getLastRowNum();i++) {
		  if(df.formatCellValue(sheet.getRow(i).getCell(1)).equals(expectedTestName)) {
				for(int j=i; j<sheet.getLastRowNum();j++) {
					String key = df.formatCellValue(sheet.getRow(j).getCell(2));
					String value = df.formatCellValue(sheet.getRow(j).getCell(3));
					map.put(key, value);
					if(df.formatCellValue(sheet.getRow(i).getCell(2)).equals("####"))
						break;
				}
				break;
			}
		}
		return map;
	  
  }
 /**
  * This method is used to write data in to excel
  * @param data
  * @param cellNum
  * @param rownum
  * @param path
  * @param sheetName
  */
  public void setDataToExcel(String data, int cellNum, int rownum, String path, String sheetName) {
		
		Sheet sheet = workbook.getSheet(sheetName);
		Cell cell = sheet.getRow(rownum).createCell(cellNum);
		cell.setCellValue(data);
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			workbook.write(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
  /**
   * This method is used to update test status in to excel workbook
   * @param expectedTestName
   * @param status
   * @param path
   * @param sheetName
   */
	public void setDataToExcel(String expectedTestName, String status, String path, String sheetName) {
		DataFormatter df = new DataFormatter();
		Sheet sheet = workbook.getSheet(sheetName);
		for(int i=0; i< sheet.getLastRowNum();i++) {
			if(df.formatCellValue(sheet.getRow(i).getCell(1)).contains(expectedTestName)) {
				sheet.getRow(i).getCell(4).setCellValue(status);
			}
		}
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			workbook.write(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * This method is used to close excel workbook 
	 */
	public void closeWorkbook() {
		try {
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

